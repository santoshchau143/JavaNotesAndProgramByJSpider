import java.util.*;

public class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("This Application provide table of any Number");
        System.out.print("Enter the Number : ");
        int Number = sc.nextInt();
        System.out.println("Table of the " + Number );
        for(int i = 1; i<=10; i++){
           System.out.println(" " + Number + " * " + i + " = " + Number*i);
       }
}
} 