package lr9;

public class Example9 {
    public static int m() {
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        int a = m();
        System.out.println(a);
    }

}
