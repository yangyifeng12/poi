package DataType;

import java.lang.reflect.Field;

/*
 * 复习反射
 * writer：yyf;time：2018/08/27
 */
public class Fanshe {

	public static void main(String[] args) {
//		1、获取Class对象的三种方式
//		 1.1 Object ——> getClass();
//		 1.2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
//		 1.3 通过Class类的静态方法：forName（String  className）(常用)
		//第一种方法获取class对象(都创建完对象了还反射什么，所以不推荐)
		TransientTest a=new TransientTest();
		Class newA=a.getClass();
		System.out.println(newA.getName());
		//第二种(需要导入类的包依赖性太强)
		Class newB=TransientTest.class;
		System.out.println(newA==newB);
		System.out.println(newB.getClass());//class java.lang.Class
		//第三种(推荐)
		String url="DataType.TransientTest";
		try {
			Class newC=Class.forName(url);
			System.out.println(newA==newC);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
