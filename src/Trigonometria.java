public class Trigonometria {

    public static final double E = 2.718281828459045D;
    public static final double PI = 3.141592653589793D;
    private static final double DEGREES_TO_RADIANS = 0.017453292519943295D;
    private static final double RADIANS_TO_DEGREES = 57.29577951308232D;

    Trigonometria() {
    }

    public static double sin(double a) {
        a %= 2 * PI;

        if (a < 0) {
            a = 2 * PI - a;
        }

        int sign = 1;
        if (a > PI) {
            a -= PI;
            sign = -1;
        }

        final int PRECISION = 8;
        double temp = 0;
        for (int i = 0; i <= PRECISION; i++) {
            temp += Operadores.pow(-1, i) * (Operadores.pow(a, 2 * i + 1) / Operadores.factorial(2 * i + 1));
        }

        return sign * temp;
    }

    public static double cos(double x) {
        double cosOut = 1;
        int n = 2;
        int precision = 8;
        int factorial = 1;
        double power = 1;
        while (n<=precision) {
            power = power * x * x * -1; // note the -1 for the addition flip flop
            factorial = factorial * n * (n-1);
            cosOut = cosOut + (power/factorial);
            n = n + 2;
        }
        return cosOut;
    }

    public static double toRadians(double angdeg) {
        return angdeg / 180.0 * PI;
    }
}
