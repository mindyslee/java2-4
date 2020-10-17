import java.util.Scanner;

class GuessingGame {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = (int) (Math.random()*100) + 1;  
        int guess  = 0;  
        int tries  = 0;  

        System.out.println("I picked a random number between 1 and 100. Try to guess it! ");

        while (guess != target) {
            System.out.print("What's your guess? ");
            guess = sc.nextInt();
            tries++;
            
            if (guess < target) {
                System.out.println("Too low");
            } else if (guess > target) {
                System.out.println("Too high");
            }
        }
        
        System.out.println("You guessed my number! Nice!  Only took you like " + tries + " tries.");
    }
}
