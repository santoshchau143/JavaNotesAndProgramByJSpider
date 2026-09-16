import java.util.*;

public class Sum1toN{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number 1+2+3+....+ N = " );
      int N = sc.nextInt();
      int result = (N * (N+1))/2;
      System.out.print("Sum of 1 + 2 + 3 + ......+ " + N + " = " + result);
}
}
      