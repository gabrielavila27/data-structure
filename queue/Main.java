/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

/**
 *
 * @author gabri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue fifo = new Queue(3);;
        System.out.println(fifo.isEmpty());
        fifo.queueElement("Lewis Hamilton");
        fifo.queueElement("Max Verstappen");
        fifo.queueElement("Felipe Drugovich");
        fifo.queueElement("Charles Leclerc");
        fifo.removeElement();
        fifo.queueElement("Charles Leclerc");
        System.out.println(fifo.getFirst());
        fifo.printQueue();
    }
    
}
