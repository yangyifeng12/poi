package Think_In_Java.CrazyJava;

public class Person {
    public  int age;//年龄
    public  double height;//身高

    public   void  info(){
        this.age=1;
        System.out.println("我的年龄是" +age +"我的身高是" +height);
    }
    public static void main(String[] args) {
        Person a=new Person();
        a.info();
    }

}
