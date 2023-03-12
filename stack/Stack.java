/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author gabri
 */
public class Stack {
    int top;
    int length;
    Object[] array;
    
    public Stack(int length){
        this.length = length;
        this.top = -1;
        this.array = new Object [length];
    }
    
    public boolean isFull(){
        return this.top >= length;
    }
    
    public boolean isEmpty(){
        return this.top == -1;
    }
    
    void stackUp(Object element){
        if (!isFull()){
            this.top++;
            this.array[top] = element;
            System.out.println("Element " + element + " was stacked");
        } else{
            System.out.println("You can't stack up an element! Stack is full!");
        }
    }
    
    void unstack(){
        Object unstacked = null;
        if (isEmpty()){
            System.out.println("You can't unstack an element! Stack is already empty!");
        } else{
            unstacked = this.array[top];
            this.array[top] = null;
            this.top--;
            System.out.println("Element " + unstacked + " was unstacked");
            
        }
    }
    
    Object topElement(){
        if (isEmpty()){
            return null;
        } else{
            return this.array[top];
        }
    }
}
