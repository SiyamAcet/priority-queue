public class OncelikliKuyruk {
    public int maxSize;
    public int[] queArray;
    public int nItems;
    public int front;
    public OncelikliKuyruk(int s) { // constructo
        maxSize = s;
        queArray = new int[maxSize];
        nItems = 0;
    }
    public void insert(int item) {// sıralı ekleme metodu
        int j;
        if (nItems == 0)
            queArray[nItems++] = item;
        else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item < queArray[j])
                    queArray[j + 1] = queArray[j];
                else {
                    break;
                }}
            queArray[j + 1] = item;
            nItems++;}
    }

    public int remove() {//silme metodu
        int temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public int peekFront() {//peek metodu
        return queArray[front];
    }

    public boolean isEmpty() {//isEmpty metodu
        return (nItems == 0);
    }

    public boolean isFull() {//isFull metodu
        return (nItems == maxSize);
    }

    public int size() {// size metodu
        return nItems;
    }
}
