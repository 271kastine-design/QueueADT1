public class LinkedQueue<T> implements QueueInterface<T>{
    private LLNode<T> front;
    private LLNode<T> rear;
    private int size;
    public LinkedQueue(){
        front = null;
        rear = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean empty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    public void clear(){
        front = null;
        rear = null;
        size = 0;
    }
    public T peek() throws QueueUnderflowException{
        if(empty()){
            throw new QueueUnderflowException("Linked queue is empty!");
        }
        return front.getInfo();
    }
    public T remove() throws QueueUnderflowException{
        if(empty()){
            throw new QueueUnderflowException("Linked queue is empty!");
        }
        T item = front.getInfo();
        front = front.getLink();
        size--;
        if(front == null){
            rear = null;
        }
        return item;
    }
    public T add(T item){
        LLNode<T> newNode = new LLNode<T>(item);
        if(rear == null){
            front = newNode;
        }else{
            rear.setLink(newNode);
        }
        rear = newNode;
        size++;
        return item;
    }
}
