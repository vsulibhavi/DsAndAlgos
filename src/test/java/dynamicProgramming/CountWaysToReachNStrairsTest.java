package dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountWaysToReachNStrairsTest {

    @Test
    public void countRecursion() {

        System.out.println(CountWaysToReachNStrairs.cachedCountRecursion(240));
    }

    @Test
    public void countDp(){

        System.out.println(CountWaysToReachNStrairs.countDp(240));
    }
}