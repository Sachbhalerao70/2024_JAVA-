import java.util.Scanner;
public class userData {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String x;
        System.out.println("Enter Username");
        x=obj.nextLine();
        System.out.println("Username is :-"+x);
        // Reverase String code
        String xx=new StringBuilder(x).reverse().toString();
        System.out.println(xx);

        
    }
    
}
