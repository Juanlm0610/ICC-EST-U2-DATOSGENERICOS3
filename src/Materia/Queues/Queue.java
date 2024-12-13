package Materia.Queues;

import java.util.NoSuchElementException;

import Materia.Models.Node;

public class Queue {
    private Node front; 
    private Node rear; 
    private int size = 0;
    public Queue(){
        this.front = null;
        this.rear = null;
    }
   
    public void enqueue(int value){
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        }else{
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
        }
      
        public boolean isEmpty(){
            return front == null;
    }
  
    public Node dequeue(){
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        Node node = front;
        front = front.getNext();
        if (front == null) {
            rear = null;
            
        }
        size--;
        return node;
    }
    public Node peek(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return front;
    }
    public void pritnQueue(){
        Node current = front;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
            
        }
    }
    
    public int getSize(){
        int cont = 0;
        Node current = front;
        while (current != null) {
            cont ++;
            current = current.getNext();
        }
        return cont;
    }
    public int size(){
        return size;
    }
}
