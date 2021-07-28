import model.*;
public class Main {
    public static void main(String args[]){
        Printer printer = new Printer();
        ColorPrinter colorPrinter = new ColorPrinter();
        BlWhPrinter blwhPrinter = new BlWhPrinter();
        printer.print();
        colorPrinter.print();
        blwhPrinter.print();
    }
}
