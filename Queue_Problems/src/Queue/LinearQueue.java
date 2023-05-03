package Queue;

public class LinearQueue {
    private int front;
    private int rear;
    private int[] queue;
    private int maxSize;

    
    public LinearQueue(int size) {
        front = -1;
        rear = -1;
        queue = new int[size];
        maxSize = size;
    }

    //Check queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    //check queue is full 
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //Adding element in queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        queue[rear] = element;
    }

    //Removing element in queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int element = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return element;
    }
}

