package Queue.LinkedListQueue;

public class QueueManager {
    QueueNode front, rear;

    public QueueManager() {
        front = rear = null;
    }

    public boolean queueisEmpty() {
        if (front == null && rear == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        QueueNode queueNode = new QueueNode(value);
        if (queueisEmpty()) {
            front = rear = queueNode;
        } else {
            front.setNextNode(queueNode);
            front = queueNode;
        }
    }

    public QueueNode pop() {
        if (queueisEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        } else {
            QueueNode popNode = rear;
            rear = rear.getNextNode();
            return popNode;
        }
    }

    public QueueNode peek() {
        if (queueisEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        } else {
            return rear;
        }
    }

    public int size() {
        QueueNode front2 = front;
        QueueNode rear2 = rear;
        int count = 0;
        while (front2 != rear2 && rear2 != null) {
            count++;
            rear2 = rear2.getNextNode();
        }
        return count;
    }
}
