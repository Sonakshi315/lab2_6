import java.util.Scanner;

class Subtract {

    // subtract two integers
    void subtract(int a, int b) {
        System.out.println("Result = " + (a - b));
    }

    // subtract three integers
    void subtract(int a, int b, int c) {
        System.out.println("Result = " + (a - b - c));
    }

    // subtract two double values
    void subtract(double a, double b) {
        System.out.println("Result = " + (a - b));
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subtract s = new Subtract();

        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        s.subtract(a, b);

        System.out.println("Enter three integers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        s.subtract(x, y, z);

        System.out.println("Enter two double values:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        s.subtract(d1, d2);

        sc.close();
    }
}
