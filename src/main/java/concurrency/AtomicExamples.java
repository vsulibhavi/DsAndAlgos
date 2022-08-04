package concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExamples {

  public static void main(String[] args) {

    int intialValue = 10;
    AtomicInteger atomicInteger = new AtomicInteger(intialValue);

    atomicInteger.compareAndSet(intialValue,12);
    atomicInteger.compareAndExchange(intialValue,11); // these are supported by the machine instructions

  }
}
