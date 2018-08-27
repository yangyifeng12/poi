package DataType;
/*
 * 访问修饰符
 *  访问控制修饰符
*                        
*                          本类       子类  	  本包其他类  	其他包其他类 
			public	              公有          √      √        √         √   
			private	               私有	 √      ×   	 ×	      ×             类和接口不能声明为 private
			protected     受保护      √  	  	√	     √	      ×（子类也可以访问）
			不写(default)  默认         √	    √	     √	      ×（子类在其他包中不可以问）
	 
 * 1.线程
    1.1 synchronized 修饰符
  		synchronized关键字声明的方法同一时间只能被一个线程访问
  		synchronized修饰符可以应用于四个访问修饰符
    1.2 volatile 修饰符
		volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。
		这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
		一个 volatile 对象引用可能是 null。
 */
public class TransientTest {
	private String a;
	private int age;
	//无参的构造方法
	public TransientTest() {
		// TODO Auto-generated constructor stub
		
		System.out.println("执行了无参的构造方法");
	}
	//有参的构造方法
	public TransientTest(String a) {
		this(11,a);//写这个会执行执行了有参int age,String a的构造方法(因为调用了那个构造方法)
		System.out.println("执行了有参String a的构造方法");
	}
	public TransientTest(int age,String a) {
		this.age=age;
		this.a=a;
		System.out.println("执行了有参int age,String a的构造方法");
	}
	
	//写完toString方法就能输出的时候直接对象/对象.toString把所有属性输出出来
	@Override
	public String toString() {
		return "TransientTest [a=" + a + ", age=" + age + "]";
	}
	
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		//获取对象
//		TransientTest.class.getClass();//没有运行实例
		
		TransientTest ab=new TransientTest();//不写参数相当于调用了无参的构造方法(无参额构造方法默认执行,先执行)
		TransientTest ab1=new TransientTest("李四");
		TransientTest ab2=new TransientTest(11,"王五");//写参数相当于调用了有参的构造方法
		
//		ab.getClass();//类的实例已经得到
		
		ab.setA("yyf");
		System.out.println(ab);
		/* 先执行无参的构造方法，后输出要输出的结果
		 * 运行结果：
		 * 	执行了无参的构造方法
		 * 	TransientTest [a=yyf, age=0]
		 */
		
		System.out.println(ab1);
		/*执行了有参int age,String a的构造方法
                        执行了有参String a的构造方法
          TransientTest [a=李四, age=11]*/
		System.out.println(ab2);
		/* 执行了有参int age,String a的构造方法
		 * TransientTest [a=王五, age=11] */
		
		//测试三元表达式
		int result=0;
	   result=(ab.getA().equals("abc"))?1:0;//如果括号里面的成立则返回1，否则返回0 
	   System.out.println("测试三元表达式：相当于简写了if else"+result);
	   	
	}
}
