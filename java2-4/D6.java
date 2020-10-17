import java.util.Scanner;

public class D6 {
    
    public static void main (String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        int numdice = 0;    
        int dieroll = 0;   
        int total   = 0;  
        String ans  = "y"; 
        while (ans.equals("y")) {
            
            System.out.print("How many D6's do you want to roll? ");
            numdice = sc.nextInt();
     
            System.out.println("");
            System.out.print("You rolled: ");
            for (int i = 0; i < numdice; i++) {
                dieroll = (int) (Math.random()*6)+1;
                total = total + dieroll;
                System.out.print(dieroll + " ");
            }

            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");

            System.out.print("Again? [y,n] ");
            ans = sc.next();
            System.out.println("");            
        }
    }
}
