class Task1
{

 // n -> Number, k-> Target number 
public static void check(int n, int k){



 if((n%10) == k){
   System.out.println("Yes target value found\n"); 
}else{
  System.out.println("No target value found");

}
}
public static void main(String[] args)
{
  Task1.check(27, 7);
  Task1.check(29, 3);

}
}