package 练习题.题16;

public class nine {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        double a1 = 1;
        double a2 = 2;
        double a3 = 3;
        String m1 = "abc";
        String m2 = "abc";
        X x0 = new X(n1, n2);
        x0.exchange(n1, n2);
        System.out.println(x0.getN1() + " , " + x0.getN2());
        X x1 = new X(a1, a2, a3);
        System.out.println(x1.mul(a1, a2, a3));
        X x2 = new X(m1, m2);
        x2.bo(m1, m2);
    }
}

class X {
    private int n1;
    private int n2;
    private double a1;
    private double a2;
    private double a3;
    private String m1;
    private String m2;

    public X(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void exchange(int n1, int n2) {
        if (n1 > n2) {
            int c = n1;
            n1 = n2;
            n2 = n1;
        }
    }

    public X(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public double getA1() {
        return a1;
    }

    public double getA2() {
        return a2;
    }

    public double getA3() {
        return a3;
    }

    public double mul(double a1, double a2, double a3) {
        return a1 * a2 * a3;
    }

    public X(String m1, String m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public String getM1() {
        return m1;
    }

    public String getM2() {
        return m2;
    }

    public void bo(String m1, String m2) {
        System.out.println(m1.equals(m2));
    }
}