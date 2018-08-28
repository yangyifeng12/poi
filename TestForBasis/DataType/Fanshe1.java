package DataType;

import java.lang.reflect.Field;

public class Fanshe1 {
	public static void main(String[] args) throws Exception {
//	2、通过反射获取构造方法并使用：
		String url="DataType.TransientTest";
		Class clazz=Class.forName(url);
		Field[] fieldArray=clazz.getDeclaredFields();
		for(Field f:fieldArray) {
			System.out.println("字段为"+f);
		}
	}
	
}
