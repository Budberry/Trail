import java.util.Scanner;

public class javaPractice1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {

            String s1 = sc.next();
            int x = sc.nextInt();

            System.out.print("");
            System.out.print(s1);
            for (int j = s1.length(); j < 16; j++) {
                System.out.print(" ");
            }
            if (x >= 10 && x < 100) {
                System.out.println("0" + x);
            }

            else if (x <= 9) {
                System.out.println("00" + x);
            } else {
                System.out.println(x);
            }

        }
        System.out.println("================================");
        sc.close();
    }

}
