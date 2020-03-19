import java.util.LinkedList;

public class Derivatives {

    public static long derivativeTerm(String pTerm, long val)
    {
        // Get coefficient
        LinkedList<Character> coeffStr = new LinkedList<>();
        int i = 0;
        long coeff = 1;
        try {
            for (i = 0; pTerm.toCharArray()[i] != 'x'; i++) {
                coeffStr.addLast(pTerm.toCharArray()[i]);
            }

            coeff = Long.parseLong(String.valueOf(coeffStr.toString().charAt(1)));
        } catch (Exception ignored) {
        }


        // Get Power (Skip 2 characters for x and ^)
        LinkedList<Character> powStr = new LinkedList<>();
        long power = 1;

        try {
            for (i = i + 2; i != pTerm.length(); i++)
                powStr.addLast(pTerm.toCharArray()[i]);
            power = Long.parseLong(String.valueOf(powStr.toString().charAt(1)));
        } catch (Exception ignored) {
        }


        // For ax^n, we return a(n-1)x^(n-1)
        return coeff * power * Operadores.pow(val, power - 1);
    }

    public static long derivativeVal(String poly, int val)
    {
        long ans = 0;

        String[] term = poly.split("[+]");

        for (int i = 0; i < term.length; i++) {
            ans = (ans + derivativeTerm(term[i], val));
        }

        return ans;
    }
}