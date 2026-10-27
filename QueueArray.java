public class QueueArray<T> implements QueueInterface{
    private T[] array;
    private int size;
    private int[] order;
    private int check;
    private int front = 0;
    public QueueArray(){
        array = (T[]) new Object[4];
        size = 0;
        order = new int[4];
        check = 0;
    }
    public int size(){
        return size;
    }
    public boolean empty(){
        if(size() == 0){
            return true;
        }
        return false;
    }
    public void Clear(){
        array = (T[]) new Object[4];
        order =  new int[4];
        size = 0;
    }
    public T add(T item){
        if(size == array.length){
            T[] temp = (T[]) new Object[array.length*2];
            for(int i = 0; i < size; i++){
                temp[i] = array[(front + i) % array.length];
            }
            array = temp;
            front = 0;
        }
        int rear = (front + size) % array.length;
        array[rear] = item;
        size++;
        return item;
    }
    public T peek(){
        return array[0];
    }
    public void clear(){
        
    }
}