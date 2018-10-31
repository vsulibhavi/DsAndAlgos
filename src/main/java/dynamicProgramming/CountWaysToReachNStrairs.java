package dynamicProgramming;

import java.time.LocalDate;
import java.util.HashMap;

public class CountWaysToReachNStrairs {

    static HashMap<Integer,Long> integerLongHashMap = new HashMap<>();

    public static Long countRecursion(int nthStair){


        if(nthStair == 0) return 0L;
        if(nthStair == 1 ) return 1L;
        if(nthStair == 2) return 2L;
            return  cachedCountRecursion(nthStair-1) + cachedCountRecursion(nthStair-2);

    }

    public static Long cachedCountRecursion(int nthStair){

        if(integerLongHashMap.get(nthStair) == null)
        {
            integerLongHashMap.put(nthStair,countRecursion(nthStair));
        }

            return integerLongHashMap.get(nthStair);


    }

    public static Long countDp(int nthStair){

        long[] countDp = new long[nthStair+10];
        countDp[0] =0;
        countDp[1]  = 1;
        countDp[2] = 2;

        if(nthStair == 0) return 0L;
        if (nthStair ==1 ) return 1L;
        if(nthStair ==2) return 2L;
        int i=3;
        for(i=3;i<=nthStair;i++){
            countDp[i] = countDp[i-1] + countDp[i-2];
        }

        return countDp[i];
    }

}
