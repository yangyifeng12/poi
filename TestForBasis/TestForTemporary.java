public class TestForTemporary {
    static String texts="a,b,c";
    public synchronized static void main(String[] args) {
        System.out.println(texts.indexOf(',',4));
    }
}
