package Materia.Queues;
import java.util.NoSuchElementException;
import Materia.Models.NodeGeneric;

public class QueueGeneric <T> {
    private NodeGeneric<T> front;
    private NodeGeneric<T> rear;
    private int size;


    public QueueGeneric(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    
    public void enqueue(T data){
        NodeGeneric<T> newNode = new NodeGeneric<T>(data);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }
    public NodeGeneric<T> dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        NodeGeneric<T> node = front;
        front = front.getNext();
        if(front == null){
            rear = null;
        }
        size--;
        return node;
    }
    
    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front.getValue();
    }


    public boolean isEmpty(){
        return front == null;
    }

    public void printQueueGeneric(){
        NodeGeneric<T> current = front;
        while(current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public int size(){
        return size;
    }
    
   
}
