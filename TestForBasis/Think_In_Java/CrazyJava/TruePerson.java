package Think_In_Java.CrazyJava;

/**
 * creates by yyf on 2019-07-08 10:16
 */
public class TruePerson extends Person {
    private int s;
    public int truePerson (){
//        super.info();
        this.s=age;
        return s;
    }

    public static void main(String[] args) {
        TruePerson a=new TruePerson();
        a.truePerson();
        System.out.println( a instanceof Person);//比较实例是否是当前类的实例
    }
}
