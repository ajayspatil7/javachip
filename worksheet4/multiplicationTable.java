package worksheet4;
import java.util.Scanner;


public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number to get the table :");
        int num= scanner.nextInt();
        System.out.print("Number of terms do you need : ");
        int term=scanner.nextInt();
        for (int i=1;i<=term;i++){
            System.out.println(num +"x"+i+"="+(num*i));
    }
    }
}
