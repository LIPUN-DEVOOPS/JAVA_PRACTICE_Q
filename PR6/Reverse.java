import java.util.Scanner;

public class Reverse {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your number for reverse ");
            int num=sc.nextInt();
            int rem=0,rev=0;
            while(num!=0){
                  rem=num%10;
                  rev=rev*10+rem;
                  num/=10;

            }
            System.out.println("Your Reverse is "+rev);

      }
      
}
