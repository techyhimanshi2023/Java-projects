import java.util.*;
public class numberguessinggame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nm=(int)(Math.random()*100)+1;
        int guess=0;
        System.out.println("Enter a num between 1 and 100:");
        do{
            for(int trys=5; trys>=1; trys--) {
                System.out.println("you only have " + trys +" tries left");
                guess = sc.nextInt();
                if (guess < nm) {
                    System.out.println("The number is greater than " + guess + ".");
                } else if (guess > nm) {
                    System.out.println("The number is smaller than " + guess + ".");
                } else {
                    System.out.println("you got it! the number is: " + nm);
                    break;
                }

                if (trys == 1) {
                    System.out.println("Oops, Tries are over! the number is: " + nm);
                    break;
                }
            }
            break;
        }
        while(guess!=nm);
    }
}