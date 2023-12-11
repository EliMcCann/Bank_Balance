import java.util.Scanner;

public class BankBalance2 
{
    public static void main(String[] args) 
    {
         //Variables and Constants
        double balance;
        int response;
        int year = 1;
        final double INT_RATE = 0.03;
        Scanner keyboard = new Scanner(System.in);

        //Input Phase
        System.out.print("Please enter your initial bank balance >> ");
        balance = keyboard.nextDouble();
        //Processing and Output Phases 
        do
        {
           balance = balance + (balance * INT_RATE);
           double roundBal = (double) Math.round(balance * 100d) / 100d;
           System.out.println("After year " + year + " at " + INT_RATE + " interest rate, your balance is $" + roundBal);
           year = year + 1;   
           System.out.println("Do you want to see the balance at the end of another year?");
           System.out.print("Enter 1 for YES or any other number for NO >> ");
           response = keyboard.nextInt();

        } while(response == 1); // End of DO... WHILE loop

        System.out.println("\nExiting program, have a great day!");

    }
}