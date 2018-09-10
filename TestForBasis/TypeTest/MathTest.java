package TypeTest;
/*
 * java中的自动装箱与拆箱
 * 简单一点说，装箱就是自动将基本数据类型转换为包装器类型；拆箱就是自动将包装器类型转换为基本数据类型。
 */
public class MathTest {
	
	public static void main(String[] args) {
		Math.min(1, 2);
		/*
        Integer i1 = 128;  // 装箱，相当于 Integer.valueOf(128);
        int t = i1; //相当于 i1.intValue() 拆箱
        System.out.println(t);
        */
//		Character ch = new Character('a');
		
	}
}
