class BankCustomer{
static String bankName ="ICICI Bank";
String  customerName;
long accountNumber;
String bankAddress;
String ifscCode;
double bankBalance;

public static void main(String[] args){

// Object 1 
BankCustomer obj = new BankCustomer();


obj.customerName = "Santosh";
obj.accountNumber = 12774054254L;
obj.bankAddress = "ICICI Bank, Sector-5, Noida, Uttar Pradesh";
obj.ifscCode = "ICICI38384";
obj.bankBalance = 484348.46;
System.out.println("Bank name : " + BankCustomer.bankName);
System.out.println("Name of Customer : " + obj.customerName);
System.out.println("Account Number of Customer : " +obj.accountNumber);
System.out.println("Bank Address : " +obj.bankAddress);
System.out.println("IFSC code : " +obj.ifscCode);
System.out.println("Bank balance: " + obj.bankBalance);
}
}