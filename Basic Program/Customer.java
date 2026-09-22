class Customer{

String name;
String id;
int age;
long phoneNumber;

public static void main(String[] args){

// Object 1 
Customer obj = new Customer();

obj.name = "Santosh";
obj.id = "C123";
obj.age = 22;
obj.phoneNumber = 9140882176L;
System.out.println("Name of Customer : " + obj.name);
System.out.println("ID of Customer : " +obj.id);
System.out.println("Age of Customer : " +obj.age);
System.out.println("Mobile number of Customer : " +obj.phoneNumber);
System.out.println();

// Object 2 
Customer obj2 = new Customer();

obj2.name = "Aryan";
obj2.id = "C163";
obj2.age = 23;
obj2.phoneNumber = 9140882176L;
System.out.println("Name of Customer : " + obj2.name);
System.out.println("ID of Customer : " +obj2.id);
System.out.println("Age of Customer : " +obj2.age);
System.out.println("Mobile number of Customer : " +obj2.phoneNumber);

}
}