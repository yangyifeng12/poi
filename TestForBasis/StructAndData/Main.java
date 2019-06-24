package StructAndData;

import java.lang.reflect.Method;

public class Main {
	
	public static void main(String[] args) {
		int len=20;
		Array arr =new Array(len);
		for(int i=0;i<10;i++) {
			arr.addFirst(i);
		}
		System.out.println(arr);
		arr.add(0, 23);
		System.out.println(arr);
//		try {
//		/*	//加载类
//            Class<?> printClass =  Class.forName("com.test.reflct.Print");
//            //获取方法
//            Method printMethod = printClass.getMethod("print",String.class);
//            //调用
//            printMethod.invoke(printClass.newInstance(),"123");*/
//			Class<?> as = Class.forName("StructAndData.Array");
//			Method Array=as.getMethod("Capacity");
//			Array.invoke(as.newInstance());
//			System.out.println(Array.invoke(as.newInstance()));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
