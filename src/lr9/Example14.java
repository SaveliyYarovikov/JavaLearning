package lr9;

public class Example14 {
    public static void m(int x) {
        int h = 10 / x;
    }
    public static void main(String[] args) throws ArithmeticException{
        try {
            int l = args.length;
            System.out.println("размер массива= " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
