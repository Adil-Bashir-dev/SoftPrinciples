/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Indirection_With_Principle;

public class App {
    private final Printer printer;

    public App(Printer printer) {
        this.printer = printer; // Inject the printer
    }

    public void run() {
        printer.print("Hello from New App!");
    }

    public static void main(String[] args) {
        Printer screenPrinter = new ScreenPrinter();
        App app = new App(screenPrinter);
        app.run();
    }
}
