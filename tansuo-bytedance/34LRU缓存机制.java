class Node{
    public int key,val;
    public Node next,pre;
    public Node(int x,int y){
        this.key = x;
        this.val = y;
    }
}

class DoulbeList{
    private Node head,tail;//头尾结点
    private int size;//链表元素数
    
    public DoubleList(){
        head = new Node(0,0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    
    //在链表头部添加节点
    public void addFirst(Node x){
        x.next = head.next;
        x.pre = head;
        head.next.pre = x;
        head.next = x;
        size++;
    }
    
    //删除链表中的x结点（x一定存在）
    public void remove(Node x){
        x.pre.next = x.next;
        x.next.pre = x.pre;
        size--;
    }
    
    // 删除链表中最后一个节点，并返回该节点
    public Node removeLast() {
        if (tail.prev == head)//tail是虚节点
            return null;
        Node last = tail.prev;
        remove(last);
        return last;
    }
    
    // 返回链表长度
    public int size() { return size; }
}

class LRUCache {
    private HashMap<Integer,Node> map; //key->Node(key,val)
    private DoubleList cache;// Node(k1,v1)<->Node(k2,v2)
    private int cap;//最大容量
    
    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList<>();
    }
    
    
    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        int val = map.get(key).val;
        // 利用 put 方法把该数据提前
        put(key, val);
        return val;
    }
    
    public void put(int key, int val) {
        // 先把新节点 x 做出来
        Node x = new Node(key, val);
        
        if (map.containsKey(key)) {
            // 删除旧的节点，新的插到头部
            cache.remove(map.get(key));
            cache.addFirst(x);
            // 更新 map 中对应的数据
            map.put(key, x);
        } else {
            if (cap == cache.size()) {
                // 删除链表最后一个数据
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            // 直接添加到头部
            cache.addFirst(x);
            map.put(key, x);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
