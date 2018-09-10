package ConditionControl;

public class Test {
	//静态变量必须是全局变量，不能是局部变量
	public static  int[] numbers= {10,20,30,40};
	//静态方法不能使用类的非静态变量
	public static void aa() {
		System.out.println("静态方法");
	}
	
	/*
	 * break跳出当前循环，下面的循环也不往下面走了
	 * continue跳出当前循环，继续循环下面的
	 */
	public static void main(String[] args) {
		//break
			for(int ones :numbers) {
				if(ones==30) {
					break;
				}
				System.out.println(ones);
			}
			System.out.println("上面为break演示");//结果为10,20
		//continue
			for(int ones1 :numbers) {
				if(ones1==30) {
					continue;
				}
				System.out.println(ones1);
			}
			System.out.println("上面为continue演示");//结果为10,20,40
	}
}
