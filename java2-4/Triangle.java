import java.util.Scanner;

public class Triangle {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String  ch = "";
        int num    = 0;  

        
        System.out.print("What character do you want your triangle made of? ");
        ch  = sc.next();
        System.out.print("How tall do you want your triangle? ");
        num = sc.nextInt();
        System.out.println("");
        System.out.println("Here's your triangle!");
        System.out.println("");
        
        // traingle
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}
