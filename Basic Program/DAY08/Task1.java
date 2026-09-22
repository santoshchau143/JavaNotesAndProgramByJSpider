// By using static in method 

/* class Task1{
public static void main(String[] args){
  Task1.add();
}

public static void add(){
 int a = 10;
 int b = 39;
 int result = a+ b;
 System.out.println("Addition of two number is :" +result);
}
}*/

// without using static -> needs to create a object

class Task1{
public static void main(String[] args){
  Task1 obj = new Task1();
  obj.add();
}

public void add(){
 int a = 10;
 int b = 33;
 int result = a+ b;
 System.out.println("Addition of two number is :" +result);
}
}