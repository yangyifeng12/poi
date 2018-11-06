package TypeTest;
/*
 * finalize方法
 * gc垃圾回收机制
 */
public class FinalizeTest {
	private int id;
	public FinalizeTest(int id) {  
	    this.id = id;  
	    System.out.println("Cake Object " + id + "is created");  
	  }  

	public void finalize() throws Throwable {
		super.finalize();
		System.out.println("Cake Object " + id + "is disposed");
	}
	public static void main(String[] args) {
		FinalizeTest c1=new FinalizeTest(1);
		FinalizeTest c2=new FinalizeTest(2);
		FinalizeTest c3=new FinalizeTest(3);
		
		c2=c3=null;
		System.gc();
		/*
		 * Cake Object 1is created
			Cake Object 2is created
			Cake Object 3is created
			Cake Object 3is disposed
			Cake Object 2is disposed
		 */
	}
}
