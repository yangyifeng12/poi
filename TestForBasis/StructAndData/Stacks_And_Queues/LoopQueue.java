package StructAndData.Stacks_And_Queues;



/**
 * front队首 tail队尾
 * size 元素个数
 * @param <E>
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front, tail;
    private int size;

    /**
     *
     * @param capacity 因为tail!=front所以会浪费一个容量，所以创建数组的时候要多创建一个
     */
    public LoopQueue(int capacity){
        data=(E[])new Object[capacity+1];
        front=0;
        tail=0;
        size=0;
    }
    public LoopQueue(){
        this(10);
    }
    public int getCapacity(){
        return data.length-1;
    }

    @Override
    public boolean isEmpty(){
        return front==tail;
    }
    @Override
    public int getSize(){
        return size;
    }
    //入队列
    @Override
    public void enqueue(E e) {
//        LoopQueue<E> array=new LoopQueue<>();
        if(tail +1%data.length ==front){
            resize(getCapacity()*2);
        }
    }
    private void resize(int newCapaticy){

        E[] newData=(E[])new Object[newCapaticy +1];
        for(int i=0;i<size;i++){
            newData[i]=data[i];
        }
    }
    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }

//    public static void main(String[] args) {
//        LoopQueue<Object> a=new LoopQueue<>();
//        for(Object aa:a.data){
//            System.out.println(aa);
//        }
//    }



}
