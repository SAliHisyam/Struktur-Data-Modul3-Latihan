package modul3semester4latihan21;

/*
without 
import java.util.LinkedList;
import java.util.Queue;*/

public class MainQueue {
    private static final int MAX_SIZE = 4;
    private static String[] queue = new String[MAX_SIZE];
    private static int front = 0;
    private static int rear = -1;
    private static int size = 0;

    public static void main(String[] args) {
        enqueue("Java");
        enqueue("DotNet");
        enqueue("PHP");
        enqueue("HTML");
        
        System.out.println("remove: " + dequeue());
        System.out.println("element: " + peek());
        System.out.println("poll: " + dequeue());
        System.out.println("peek: " + peek());
    }
    
    public static void enqueue(String data) {
        if (size == MAX_SIZE) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = data;
        size++;
    }
    
    public static String dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        String data = queue[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        return data;
    }
    
    public static String peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        return queue[front];
    }
}
