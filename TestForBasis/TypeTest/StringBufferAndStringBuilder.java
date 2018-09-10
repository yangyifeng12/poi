package TypeTest;
/*
 * time:2018/09/10
 * StringBuffer和StringBuilder的区别
 * StringBuffer是线程安全,StringBuilder不安全
 */
public class StringBufferAndStringBuilder {
	public static void main(String[] args) {
		StringBuffer sBuffer=new StringBuffer("哈哈这是测试");
//		将指定的字符串追加到字符序列
		sBuffer.append("1");
		System.out.println("sBuffer的append方法:"+sBuffer);
//		将此字符串序列用其反转形式取代
		StringBuffer reverse1=sBuffer.reverse();
		System.out.println(reverse1);
//		移除此序列的子字符串中的字符
		StringBuffer delete1=sBuffer.delete(0, 1);
		System.out.println(delete1);
		
	}

}
