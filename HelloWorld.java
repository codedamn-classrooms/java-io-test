// Your First Program
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<cases;i++) {
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println(num * 3);
        }
    }
}
