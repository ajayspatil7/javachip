package classwork_3;
import java.util.Scanner;

public class RetailManagement {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter bill amount: ");
            double amt = sc.nextInt();

            double bill = discount(amt);
            System.out.println("For bill amount "+amt+", after discount the bill total is "+bill);
        }
        public static double discount(double amt)
        {
            if(amt >= 1000)
            {
                return amt-(0.05*amt);
            }
            else if(amt >= 500 && amt < 1000)
            {
                return amt-(0.02*amt);
            }
            else
            {
                return amt-(0.01*amt);
            }
        }
    }

