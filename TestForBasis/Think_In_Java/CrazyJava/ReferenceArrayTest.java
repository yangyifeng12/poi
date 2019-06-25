package Think_In_Java.CrazyJava;

import Think_In_Java.CrazyJava.Person;

public class ReferenceArrayTest {
    public static void main(String[] args) {
        //定义一个students数组变量，其类型是person[]
        Person[] students;
        //执行动态初始化
        students = new Person[2];
        //创建一个Person实例，并将这个Person实例赋值给zhang变量
        Person zhang = new Person();
        //为zhang实例赋值age和height的值
        zhang.age = 15;
        zhang.height = 158;
        //创建一个Person实例，并将这个Person实例赋值给lee变量
        Person lee = new Person();
        //为lee所引用的person对象的age，height赋值
        lee.age = 16;
        lee.height = 161;
        //将zhang变量的值赋值给第一个数组元素
        students[0] = zhang;
        //将lee变量的值赋给第二个数组元素
        students[1] = lee;
        //下面两行代码的结果完全一样，因为lee和students[1]指向的是同一个Peron实例
        lee.info();
        students[1].info();
    }

}
