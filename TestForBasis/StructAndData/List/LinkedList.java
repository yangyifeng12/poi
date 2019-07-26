package StructAndData.List;

/**
 * creates by yyf on 2019-07-26 09:39
 */
public class LinkedList<E> {

    private class Node{
        public E e;
        private Node next;

        public Node(E e,Node next){
            this.e=e;
            this.next=next;
        }

        public  Node(E e){
            this(e,null);
        }

        public Node() {
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }

    }

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = null;
        size = 0;
    }

    //获取链表中的元素个数
    public int getSize(){
        return size;
    }

    //返回链表是否为空
    public boolean isEmpty(){
        return size ==0;
    }


    //在链表中的index(0-based)位置添加新的元素e（不是常规操作，联系用）
    public void add(int index,E e){
        if(index<0 ||index >size){
            throw new IllegalArgumentException("Add failed. Illegal index");
        }
        Node prev =dummyHead;
           for(int i = 0 ;i<index-1;i++){
               prev=prev.next;
               prev.next =new Node(e,prev.next);
               size++;
           }
    }

    //在链表表头添加新的元素e
    public void addFirst(E e){
        add(0,e);
    }
    //在链表末尾添加新的元素e
    public void addLast(E e){
        add(size,e);
    }
    //在链表中查看是否有元素e
    public boolean contaions(E e){
        Node cur=dummyHead.next;
        while (cur !=null){
            if(cur.e.equals(e)){
                return true;
            }
                cur = cur.next;
        }
            return false;
    }
    @Override
    public String toString() {
        StringBuilder res=new StringBuilder();
        for(Node cur =dummyHead.next ;cur !=null ;cur=cur.next){
            res.append(cur +"->");
            res.append("NULL");
        }
        return res.toString();
    }
}
