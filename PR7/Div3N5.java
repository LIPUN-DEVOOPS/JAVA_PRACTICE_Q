import java.util.Scanner;
public class Div3N5{
      public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your NUmber ");
            int n=sc.nextInt();
            
            for(int i=1;i<=n;i++){
                  if(i%3==0 && i%5==0){
                        System.out.println(i);
                  }

            }
      }
}