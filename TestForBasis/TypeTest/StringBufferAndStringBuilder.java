package TypeTest;
/*
 * time:2018/09/10
 * StringBuffer和StringBuilder的区别
 * StringBuffer是线程安全,StringBuilder不安全
 */
public class StringBufferAndStringBuilder {
	public static void main(String[] args) {
		StringBuffer sBuffer=new StringBuffer("哈哈这是测试");
//	public StringBuffer append(String s)	将指定的字符串追加到字符序列
		sBuffer.append("1");
		System.out.println("sBuffer的append方法:"+sBuffer);//哈哈这是测试1
//	public StringBuffer reverse()	        将此字符串序列用其反转形式取代
		StringBuffer reverse1=sBuffer.reverse();
		System.out.println(reverse1);//试测是这哈哈
//	public delete(int start, int end)	移除此序列的子字符串中的字符
		StringBuffer delete1=sBuffer.delete(0, 1);
		System.out.println(delete1);//哈这是测试
//	public insert(int offset, int i)    将 int 参数的字符串表示形式插入此序列中。
		StringBuffer insert1=sBuffer.insert(0, 1);
		System.out.println(insert1);//1哈哈这是测试
//	replace(int start, int end, String str) 使用给定 String 中的字符替换此序列的子字符串中的字符。
		StringBuffer replace1=sBuffer.replace(0, 2, "hh");
		System.out.println(replace1);//hh这是测试
		System.out.println(sBuffer.capacity());
		StringBuilder a=new StringBuilder("");
	}

}
