/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Indirection_With_Principle;

public class ScreenPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}