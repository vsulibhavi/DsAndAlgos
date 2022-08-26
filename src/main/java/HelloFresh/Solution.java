package HelloFresh;

import java.util.HashMap;

/*

Aleks is a strawberry merchant, selling strawberries at a price of 5 EUR per 1 kilogram.
Each customer can only buy 1 KG of strawberries, but can pay with 5 EUR, 10 EUR or 20 EUR bills.
 When a customer is paying with a bill of more than 5 EUR, Aleks needs to return the change.

Given an array of customers represented with the bills with which they are paying,
your function should return true if Aleks can return change to each customer in the queue,
 or false otherwise.


 Example 1: input array is: [5, 10, 5, 20]; should return true because:
- First customer pays with 5 EUR bill, gets no change
- Second customer pays with 10 EUR bill, gets 5 EUR change
- Third customer pays with 5 EUR bill, gets no change
- Fourth customer pays with 20 EUR bill, gets 15 EUR change (10 EUR + 5 EUR bills)
Example 2: input array is: [5, 20, 5, 20]; should false because:
- First customer pays with 5 EUR bill, gets no change
- Second customer pays with 20 EUR bill, should get 15 EUR change,
but Aleks only has one 5 EUR bill. At this point Aleks cannot return the change
and our function should return false.


eg - 5 , 5 ,5, 10,  x = 20 , 10
bills - 5, 10 , 20
//should alec return 10 , 5
x = or should he return 5 5 5
 */
public class Solution {


  public static void main(String[] args) {


      System.out.println(changePossible(new int[]{5 , 5 ,5, 10}));

  }


  public static boolean changePossible(int[] custTxn){

    int[] bills = {20,10,5};
    HashMap<Integer,Integer> billToCountMap = new HashMap<>();
    billToCountMap.put(20,0);
    billToCountMap.put(10,0);
    billToCountMap.put(5,0);

    for(int i=0;i<custTxn.length;i++){

      billToCountMap.put(custTxn[i],billToCountMap.get(custTxn[i])+1);
      int changeToBeGivenBack =  custTxn[i] - 5;
      int billPointer = 0;
      while(billPointer<bills.length && changeToBeGivenBack>0){

        if(billToCountMap.get(bills[billPointer]) > 0 && (changeToBeGivenBack - bills[billPointer]) >=0 ) {
          changeToBeGivenBack = changeToBeGivenBack - bills[billPointer];
          billToCountMap.put(bills[billPointer],billToCountMap.get(bills[billPointer])-1);
        }
        else{
          billPointer++;
        }
      }
      if(changeToBeGivenBack>0)
        return false;

    }

    return true;

  }


}
