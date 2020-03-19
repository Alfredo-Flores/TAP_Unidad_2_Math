public class Operadores {

    public static final double E = 2.718281828459045D;
    public static final double PI = 3.141592653589793D;
    private static final double DEGREES_TO_RADIANS = 0.017453292519943295D;
    private static final double RADIANS_TO_DEGREES = 57.29577951308232D;

    Operadores() {

    }

    public static double raiz(double x0){
        double root,givenError,error;
        boolean flag=true;
        int i=1;

        givenError=x0;

        while(flag){
            root = x0 - (F(x0)/Fprime_X(x0));
            error = Math.abs((root-x0)/root)*100;
            x0 = root;

            if(givenError>error)
            {
                flag=false;
            }
        }
        System.out.println(x0);
        return x0;
    }

    public static double F(double x){
        return Math.pow(x,3)-(0.165*Math.pow(x,2))+(3.993*Math.pow(10,-4));
    }

    public static double Fprime_X(double x){
        return 3*Math.pow(x,2)-0.33*x;
    }

    public static int abs(int i) {
        return (i < 0) ? -i : i;
    }

    public static long abs(long l) {
        return (l < 0) ? -l : l;
    }

    public static float abs(float f) {
        return (f <= 0) ? 0 - f : f;
    }

    public static double abs(double d) {
        return (d <= 0) ? 0 - d : d;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static long min(long a, long b) {
        return (a < b) ? a : b;
    }

    public static float min(float a, float b) {
        // this check for NaN, from JLS 15.21.1, saves a method call
        if (a != a)
            return a;
        // no need to check if b is NaN; < will work correctly
        // recall that -0.0 == 0.0, but [+-]0.0 - [+-]0.0 behaves special
        if (a == 0 && b == 0)
            return -(-a - b);
        return (a < b) ? a : b;
    }

    public static double min(double a, double b) {
        // this check for NaN, from JLS 15.21.1, saves a method call
        if (a != a)
            return a;
        // no need to check if b is NaN; < will work correctly
        // recall that -0.0 == 0.0, but [+-]0.0 - [+-]0.0 behaves special
        if (a == 0 && b == 0)
            return -(-a - b);
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static long max(long a, long b) {
        return (a > b) ? a : b;
    }

    public static float max(float a, float b) {
        // this check for NaN, from JLS 15.21.1, saves a method call
        if (a != a)
            return a;
        // no need to check if b is NaN; > will work correctly
        // recall that -0.0 == 0.0, but [+-]0.0 - [+-]0.0 behaves special
        if (a == 0 && b == 0)
            return a - -b;
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        // this check for NaN, from JLS 15.21.1, saves a method call
        if (a != a)
            return a;
        // no need to check if b is NaN; > will work correctly
        // recall that -0.0 == 0.0, but [+-]0.0 - [+-]0.0 behaves special
        if (a == 0 && b == 0)
            return a - -b;
        return (a > b) ? a : b;
    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static long factorial(long n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    private static int array[];

    public static int[] ordenar(int[] arr) {
        array = arr;

        quickSort(0, array.length - 1);

        return array;
    }

    private static void quickSort(int left, int right) {
        int i = left;
        int j = right;

        int pivot = array[left + (right - left) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j)
            quickSort(left, j);
        if (i < right)
            quickSort(i, right);
    }

    public static int pow(int x, int n) {
        if (n < 0) return pow(1 / x, -n);
        else if (n == 0) return 1;
        else if (n == 1) return x;
        else if (n % 2 == 0) return pow(x * x, n / 2);
        else return x * pow(x * x, (n - 1) / 2);
    }

    public static int pow(int x, long n) {
        if (n < 0) return pow(1 / x, -n);
        else if (n == 0) return 1;
        else if (n == 1) return x;
        else if (n % 2 == 0) return pow(x * x, n / 2);
        else return x * pow(x * x, (n - 1) / 2);
    }

    public static long pow(long x, long n) {
        if (n < 0) return pow(1 / x, -n);
        else if (n == 0) return 1;
        else if (n == 1) return x;
        else if (n % 2 == 0) return pow(x * x, n / 2);
        else return x * pow(x * x, (n - 1) / 2);
    }

    public static double pow(double x, int n) {
        if (n < 0) return pow(1 / x, -n);
        else if (n == 0) return 1;
        else if (n == 1) return x;
        else if (n % 2 == 0) return pow(x * x, n / 2);
        else return x * pow(x * x, (n - 1) / 2);
    }

    public static double raizCuadrada(double Number)
    {
        double sqrRoot = 0;
        double temp = 0;
        temp = Number/2;

        while (Number >= 0.0)
        {
            sqrRoot = temp - (temp * temp - Number) / (2 * temp);
            double value;
            value = abs(temp - sqrRoot);

            if (value < .0001)
                return sqrRoot;

            else temp = sqrRoot;
        }
        return Number;
    }

}
