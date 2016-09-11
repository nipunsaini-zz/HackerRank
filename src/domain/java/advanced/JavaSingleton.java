package domain.java.advanced;

class Singleton{

    public String str;
    private static Singleton obj;

    static {
        obj = new Singleton();
    }

    private Singleton() {

    }

    public static Singleton getSingleInstance() {
        return obj;
    }

}

public class JavaSingleton {
    public static void main(String[] args) {
        //implemented in hidden by HackerRank
    }
}
