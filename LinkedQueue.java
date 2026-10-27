public class LinkedQueue<T> implements QueueInterface<T>{
    private int front;
    private LLNode<T> node;
    private int size;
    public LinkedQueue(){
        front = 0;
        node = new LLNode(null);
        size = 0;
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
    public T add(T item){
        while(node.getLink() != null){
            
        }
    }
}
