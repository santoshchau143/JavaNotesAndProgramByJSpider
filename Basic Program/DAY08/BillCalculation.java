class BillCalculation{
 public static void bill(){
    String userName = "Santosh Chaudhary";
    double unitCharge = 5;
    double totalUnit = 25;
    System.out.println("Name of User  : " + userName);
    System.out.println("Charge per unit : "+ unitCharge);
    System.out.println("Total unit : "+ totalUnit);
    System.out.println("Total Charge per unit : "+ unitCharge*totalUnit) ;
 
 }

public static void main(String[] args){
  BillCalculation.bill();

 }
}
 