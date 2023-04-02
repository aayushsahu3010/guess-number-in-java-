import java.util.Scanner;

public class project {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner (System.in );
        int guessnumber = 0;
        int number = (int )(Math.random()*100);
        do {
            System.out.println("Guess the number between 1 to 100 ");
            guessnumber = sc.nextInt();
             if (guessnumber==number ) {
                System.out.println(" !!! CORRECT NUMBER !!! ");
             }
             else if (guessnumber>number) {
                System.out.println(" !!! Your number is large  !!!");
             }else{
                 System.out.println(" !!! your number is small !!!");
             }

        } while (guessnumber>=0);
                 System.out.println("The number is : ");
                 System.out.println(number );
    }
}
