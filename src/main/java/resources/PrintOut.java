package main.java.resources;

public class PrintOut{
    String sSting;
    public PrintOut() {
    }
    public PrintOut(String sString) {
        this.sSting = sString;
    }

    public void prt(String sSting){
        System.out.println(sSting);
    }
}
