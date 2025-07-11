import java.util.*;

public class gessthenumber {
    public static String nogess(double n){
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i++<3){
            System.out.println("Guess a Number");
            int num = sc.nextInt();
            if(num == n){
                return "You WIN";
            }
        }
        System.out.println();
        return "You LOSE";
    }
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        System.out.println("Guess a Number Between 1 and 10");
        System.out.println(n);

        System.out.println(nogess(n ) + " Number is " + n);
    }
}
