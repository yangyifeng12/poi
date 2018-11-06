package StructAndData;
/*
 * 二次封装数组
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
	//向数组最后添加一个新的元素e
	public void addLast(int e) {
		Array a=new Array();
		if(size>=a.Capacity()-1) {
			throw new IllegalArgumentException("Array is full");
		}
		data[size]=e;
		size++;
	}
	//向数组中index的位置添加元素e
	public void add(int index,int e) {
		Array a=new Array();
		if(size>=a.Capacity()-1) {
			throw new IllegalArgumentException("Array is full");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
