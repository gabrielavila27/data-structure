/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author gabri
 */
public class Main {
    public static void main(String[] args){
        Stack stackBahrein = new Stack(8);
        System.out.println(stackBahrein.isEmpty());
        stackBahrein.stackUp(1);
        stackBahrein.stackUp("Max Verstappen");
        stackBahrein.stackUp(11);
        stackBahrein.stackUp("Checo Pérez");
        stackBahrein.stackUp(14);
        stackBahrein.stackUp("Fernando Alonso");
        stackBahrein.stackUp(16);
        stackBahrein.stackUp("Charles Leclerc");
        System.out.println(stackBahrein.isFull());
        stackBahrein.unstack();
        stackBahrein.unstack();
    }
}
