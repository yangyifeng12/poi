package Test;

import java.util.Iterator;



public class StormBoltTest {

	public static void main(String[] args) {
//		byte [] a=new byte[10];
		char [] ab= {'a','b',1,2};
		String[] asString =new String(ab).split(",");
		for(String a:asString){
			System.out.println(a);
		}
		System.out.println(ab.toString());
		String abc="asd";
		System.out.println(abc.charAt(0));
		
		String [] abd= {"a","b","1","2"};
		String[] abdString =new String(ab).split("^[0-9]*$");
		for(String abds:abdString) {
			System.out.println(abds);
		}
		
	}
}
