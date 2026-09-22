// Task 2 -> Check the given number is even or not.
// ---------------------------------------------------

class Task2
{
 public static void main(String[] args)
{
 Task2 obj = new Task2();

// We can also store the value or we can directly call 

 //int number = 5;


 if( obj.isEven(5)){
   System.out.print("Given number is even");
  //System.out.print("Given number " +number + " is even number "); 
}
else{
  System.out.print("Given number is even");

 //System.out.print("Given number " + number + " is odd number");
}
}

 public boolean isEven(int num)
{
 if(num%2 == 1)
{
 return false;
}else{ 
 return true;
}
 
}
}