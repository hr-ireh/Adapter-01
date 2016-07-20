package ir.hri.bl;

public class Adapter extends Adaptee implements ITarget {
    public String request(int a) {
        return "the result is, " + (int) Math.round(specificRequest(a, 5));
    }
}
