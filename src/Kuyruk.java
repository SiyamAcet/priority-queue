public class Kuyruk {
    public int maxSize;
    public int[] queArray;
    public int front;
    public int rear;
    public int nItems;

    public Kuyruk(int maxSize) { // constructor
        this.maxSize = maxSize;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int adet) { // insert metodu
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = adet;
        nItems++;
    }

    public int remove() { // remove metodu
        int temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public int peekFront() { // peek front metodu
        return queArray[front];
    }

    public boolean isEmpty() { // isEmpty metodu
        return (nItems == 0);
    }

    public boolean isFull() { // isFull metodu
        return (nItems == maxSize);
    }

    public int size() { // size metodu
        return nItems;
    }

}
