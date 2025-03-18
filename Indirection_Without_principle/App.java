/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Indirection_Without_principle;

public class App {
    private final ScreenPrinter printer = new ScreenPrinter();

    public void run() {
        printer.print("Hello from App!");
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}