class Task3{
public static void main(String[] args){
  System.out.println("Updated salary  = " + Task3.getUpdatedSalary(2000, 100));

}


public static double getUpdatedSalary(double salary, double hikePercentage){
  return ((salary)* ((100+ hikePercentage)/100));
}
}