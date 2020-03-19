public class Trigonometria {

    public static final double E = 2.718281828459045D;
    public static final double PI = 3.141592653589793D;
    private static final double DEGREES_TO_RADIANS = 0.017453292519943295D;
    private static final double RADIANS_TO_DEGREES = 57.29577951308232D;

    Trigonometria() {
    }

    public static double sin(double x) {
        float s = 0;
        int signo = 1;
        for(int i=3; i<15; i+=2)
        {
            s += signo*Operadores.pow(x, i) / Operadores.factorial(i);
            signo *= -1;
        }
        return s;
    }

    public static double cos(double grados) {
        double s = 0;
        int signo = 1;
        for (int i = 0, n2 = 16 * 2; i <= n2; i+=2)
        {
            s += signo*Operadores.pow(grados, i) / Operadores.factorial(i);
            signo *= -1;
        }
        return s;
    }

    public static double tan(double valor) {
        double tangente;

        tangente = sin(valor) / cos(valor);

        return tangente;
    }

    public static double asin(double x) {
        double s = x;
        double anterior = 1;
        for(int i=3; i<84; i+=2)
        {
            anterior *= ((double) (i - 2) /(i-1));
            s += anterior*(Operadores.pow(x, i) / i);
        }
        return s;
    }

    public static double acos(double valor) {
        return (PI / 2) - asin(valor);
    }


    public static double cot(double valor) {
        double cotangente;

        cotangente = 1 / tan(valor);

        return cotangente;

    }

    public static double sec(double valor) {
        double secante;

        secante = 1 / cos(valor);

        return secante;

    }

    public static double csc(double valor) {
        double cosecante;

        cosecante = 1 / sin(valor);

        return cosecante;

    }

    public static double Grados(double radianes) {
        double grados, pi = 3.14159265358979;

        grados = radianes * (180 / pi);

        return grados;

    }

    public static double Radianes(double grados) {
        double radianes, pi = 3.14159265358979;

        radianes = grados * (pi / 180);

        return radianes;

    }


}
