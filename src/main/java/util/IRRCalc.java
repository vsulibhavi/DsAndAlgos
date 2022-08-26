package util;

public class IRRCalc {

  public static void main(String[] args) {

    double dcfIncome5 = 0;
    double dcfIncome8 = 0;
    double initialRent = 30000;
     for(int i=0;i<30;i++){

       initialRent  = initialRent * 1.11;
       System.out.println(initialRent);
       dcfIncome5 = dcfIncome5 + initialRent;

     }
     System.out.println(dcfIncome5);

  }
}
