import java.util.Scanner;

class Bar {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String  ch = ""; //bar width
        int num    = 0;  //length

      
        System.out.print("What character do you want your bar made of? ");
        ch  = sc.next();
        System.out.print("How long do you want your bar? ");
        num = sc.nextInt();
        System.out.println("");
        System.out.println("Here's your bar!");
        System.out.println("");
        
       
        for (int i = 0; i < num; i++) {
            System.out.print(ch);
        }
    }
}
