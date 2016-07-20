package ir.hri.view;

import ir.hri.bl.Adaptee;
import ir.hri.bl.Adapter;
import ir.hri.bl.ITarget;

public class App {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        System.out.println(adapter.request(5));
        System.out.println(adapter.specificRequest(5, 5));

        ITarget iTarget = new Adapter();
        System.out.println(iTarget.request(5));
        // System.out.println(iTarget.specificRequest(5, 5)); Cannot resolve method 'specificRequest(int,int)'

        Adaptee adaptee = new Adapter();
        // System.out.println(adaptee.request(5)); Cannot resolve method 'request(int)'
        System.out.println(adaptee.specificRequest(5, 5));
    }
}
