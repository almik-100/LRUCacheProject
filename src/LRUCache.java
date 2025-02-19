import java.util.HashMap;

public class LRUCache{
    private final Node head;
    private final Node tail;


    private final HashMap<Integer,Node>cache =new HashMap<>();
    private final int capacity;

    public LRUCache(int capacity){
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;



    }
    public void addToFront(Node node){
        node.next=head.next;
        head.next.prev=node;
        node.prev=head;
        head.next=node;
    }
    public void removeNode(Node node){
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }

    public void moveToFront(Node node){
        removeNode(node);
        addToFront(node);
    }

    public int get(int key){
        if(!cache.containsKey(key)){
            return -1;
        }
        Node node =cache.get(key);
        moveToFront(node);
        return node.value;
    }

    public void put(int key,int value){
        if (cache.containsKey(key)){
            Node node=cache.get(key);
            node.value=value;
            moveToFront(node);
        }else{
            Node newNode =new Node(key,value);
            cache.put(key,newNode);
            addToFront(newNode);

            if(cache.size()>capacity){
                Node leastNode=tail.prev;
                removeNode(leastNode);
                cache.remove(leastNode.key);
            }

        }

    }





 }