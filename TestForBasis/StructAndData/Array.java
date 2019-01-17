package StructAndData;

import java.lang.reflect.Method;

/*
 * 二次封装静态数组
 * writer：yyf
 * date:2018-11-6
 */
public class Array {
	
	private int[] data;
	//size代表着第几个位置没有元素
	private int size;
	/**
	 * @param capacity 数组容量
	 */
	public Array(int capacity) {
		data = new int[capacity];
		size =0;
	}
	//无参的构造方法，默认数组的容量capacity=10
	public Array() {
		this(10);
	}
	//size代表着第几个位置没有元素
	public int getSize() {
		return size;
	}
	//返回数组的容量
	public int  Capacity() {
		return data.length;
	}
	//返回数组是否为空
	public boolean isEmpty() {
		return size==0;
	}
	 // 获取index索引位置的元素
    public int get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        return data[index];
    }

    // 修改index索引位置的元素为e
    public void set(int index, int e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        data[index] = e;
    }
	//向数组最后添加一个新的元素e
	public void addLast(int e) {
		/*Array a=new Array();
		if(size>=a.Capacity()-1) {
			throw new IllegalArgumentException("Array is full");
		}
		data[size]=e;
		size++;*/
		add(size,e);
	}
	public void addFirst(int e) {
		add(0,e);
	}
	//向数组中index的位置添加元素e
	public void add(int index,int e) {
		if(size==data.length) {
			throw new IllegalArgumentException("Array is full");
		}
		if(index <0 ||index >size) {
			throw new IllegalArgumentException("index must >0 and <size");
		}
		for(int i =size-1;i>=index;i--) {
			data[i +1]=data[i];//因为只有从后往前迁移才能让前面的不没
		}
		data[index] =e;
		size ++;
	}
	
	@Override//重载
//	@SuppressWarnings("all")抑制所有警告
	public String toString() {
		Array a=new Array();
		StringBuilder res =new StringBuilder();
		res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
		res.append('[');
		for(int i=0;i<size;i++) {
			res.append(data[i]);
			if(i!= size) {
				res.append(", ");
			}
		}
		res.append(']');
		return res.toString();
	}
	//查找数组中是否有元素e
	public boolean contains(int e) {
		for(int i=0;i<size;i++) {
			if(data[i]==e) {
				return true;
			}
		}
		return false;
	}
	//查找数组中元素e所在的索引，如果不存在元素e，则返回-1
	public int find(int e) {
		for(int i=0;i<size-1;i++) {
			if(data[i]==e) {
				return 0;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
