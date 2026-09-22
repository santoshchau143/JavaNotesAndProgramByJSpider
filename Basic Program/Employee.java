class Employee{

static String companyName = "TestYantra.pvt.ltd";
String name;
String id;
int age;
long phoneNumber;

public static void main(String[] args){

// Object 1 
Employee obj = new Employee();

// address of memory in heap memory

System.out.println(obj);

obj.name = "Santosh";
obj.id = "C123";
obj.age = 22;
obj.phoneNumber = 9140882176L;

//System.out.println("Company Name : " + companyName);

// or for company name 
// Always write this way for unique by using className

System.out.println("Company Name : " + Employee.companyName);
System.out.println("ID of Employee : " +obj.id);
System.out.println("Name of Employee : " + obj.name);
System.out.println("Age of Employee : " +obj.age);
System.out.println("Mobile number of Employee: " +obj.phoneNumber); 

}
}
