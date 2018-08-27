package DataType;
/*
 * writer:yyf time:2018/08/16
 */
public class BaozhuangType {
	//byte字节 char字符
	byte a = 68;
	char b = 'A';
	/* 访问控制修饰符
	 *                        
	 *                          本类       子类  	  本包其他类  	其他包其他类 
			public	              公有          √      √        √         √   
			private	               私有	 √      ×   	 ×	      ×             类和接口不能声明为 private
			protected     受保护      √  	  	√	     √	      ×（子类也可以访问）
			不写(default)  默认         √	    √	     √	      ×（子类在其他包中不可以问）
	 */
	private int privates;
	  		int defaults;
	protected int protecteds;
	public int getPrivates() {
		return privates;
	}
	public void setPrivates(int privates) {
		this.privates = privates;
	}
	public int getDefaults() {
		return defaults;
	}
	public void setDefaults(int defaults) {
		this.defaults = defaults;
	}
	public int getProtecteds() {
		return protecteds;
	}
	public void setProtecteds(int protecteds) {
		this.protecteds = protecteds;
	}
	
}
