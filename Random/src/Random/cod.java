package Random;

public class cod {
    private int m13 = 50;
    private int a117 = 45;
    private int outlaw = 9;

    public cod(int m13, int a117, int outlaw) {
        this.m13 = m13;
        this.a117 = a117;
        this.outlaw = outlaw;
    }

    public void setM13(int m13) {
        this.m13 = m13;
    }

    public int getM13() {
        return m13;
    }

    public void setA117(int a117) {
        this.a117 = a117;
    }

    public int getA117() {
        return a117;
    }

    public void setOutlaw(int outlaw) {
        this.outlaw = outlaw;
    }

    public int getOutlaw() {
        return outlaw;
    }

    public static void main(String[] args) {
        cod s = new cod(50, 45, 9);
        System.out.println("m13 mag size: " + s.getM13()+"\n"+"a177 mag size "+s.getA117());
    }
}
