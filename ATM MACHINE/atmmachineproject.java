import java.util.Scanner;

class ATM{
     float balance;
     int pin=5657;
    

        public void checkpin(){
             System.out.println("enter the valid pin");
             Scanner sc= new Scanner(System.in);
             int enteredpin= sc.nextInt();
                if(enteredpin==pin){
                    menu();
                }
                else{
                    System.out.println("Invalid pin");
                    checkpin();
                }
            
            }

              public void menu(){
                System.out.println("please select a Service");
                 System.out.println("1.Check your balance");
                 System.out.println("2.Deposit");
                 System.out.println("3.Withdrawl");
                 System.out.println("4.Exit");

                 Scanner sc= new Scanner(System.in);
                 int option= sc.nextInt();
                   if (option==1) {
                    checkbalance();
                   }
                   else if (option==2) {
                    Deposit();
                   }
                   else if (option==3) {
                    Withdrawl();
                    }
                   else if (option==4) {
                      return;
                    }            
                    else{
                System.out.println("please select  the valid service ");
                menu();
                    }

              }
                 public void checkbalance(){
                     System.out.println(" Your balance:"+ balance);
                     menu();
                 }
                 public void  Deposit(){
                   
                    System.out.println("please enter the Amount");
                    Scanner sc=new Scanner(System.in);
                    float amount = sc.nextFloat();
                    System.out.println(" Amount Deposited succesfully");
                    balance=balance+amount;
                    menu();
                 }
                 public void Withdrawl(){
                    System.out.println("please enter the Amount");
                    Scanner sc=new Scanner(System.in);
                    float amount = sc.nextFloat();
                    System.out.println(" Amount withdrawl succesfully");
                    balance=balance-amount;
                      if(amount>balance){
                        System.out.println("Amount exceeded");
                      }
                    menu();
                 }
                

            }
 
 public class atmmachineproject {
    public static void main (String[]args){
    ATM at=new ATM();
    at.checkpin();
      
    }
 }