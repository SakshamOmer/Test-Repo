public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " is : " + isEven(i));
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
