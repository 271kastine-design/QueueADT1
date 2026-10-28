public class LinkedQueue<T> implements QueueInterface<T>{
    private int front;
    private LLNode<T> node;
    private int size;
    public LinkedQueue(){
        front = 0;
        node = new LLNode(null);
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
        node.setLink(null);
    }
    public T peek(){
        while(node.getLink() != null){
            node = node.getLink();
        }
        return node.getInfo();
    }
    public T remove() throws QueueUnderflowException{
    
        if(empty()){
            throw new QueueUnderflowException("Linked queue is empty!");
        }
        while(node.getLink()!= null){
            node = node.getLink();
        }
        node.setLink(null);
        size--;
        return node.getInfo();
    }
    public T add(T item){
        LLNode<T> newNode = new LLNode(item);
        while(node.getLink() != null){
            node = node.getLink();
        }
        node.setLink(newNode);
        size++;
        return item;
    }
}
