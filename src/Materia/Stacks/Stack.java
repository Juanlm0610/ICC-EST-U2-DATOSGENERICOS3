package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Stack {
    private Node top;
    private int size;
    
    public Stack(){
        this.top = null;
    }
    public void push(int value){
        Node newnodo = new Node(value);
        newnodo.setNext(top);
        top = newnodo;
        size++;

    }
    public int  pop(){
        if (isEmpty()) {
           throw new EmptyStackException(); 
        }
        int value = top.getValue();
        top = top.getNext();
        size --;
        return value;
        
    }
    public boolean isEmpty(){
        return top == null;

    }
   
    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }
    public void printStack(){
        Node current =  top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
            
        }
    }
    public int getSize2(){
        int cont = 0;
        Node current = top;
        while (current != null) {
            cont ++;
            current = current.getNext();
        }
        return cont;
    }
    public int getSize(){
        return size;
    }
}
