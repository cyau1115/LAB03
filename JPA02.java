public class Main {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 9; j++) { 
                count++;
            }
        }

        System.out.println("count的值為：" + count);
    }
}