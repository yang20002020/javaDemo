package it_03;

public class test {
    public static void main(String[] args) {
        usePrinter(s->System.out.println(s.toUpperCase()));

        printString ps=new printString();
        usePrinter(ps::printUpper);
    }

    private  static void usePrinter(printer p){
        p.printUpperCase("HelloWorld");
    }
}
