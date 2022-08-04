package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {

  static ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
  static List<Integer> integers = new ArrayList<>();

  public static void add(int a) {
    reentrantReadWriteLock.writeLock().lock();
    try {
      integers.add(a);
    } finally {
      reentrantReadWriteLock.writeLock().unlock();
    }
  }

  public static int getElement(int index) {

    reentrantReadWriteLock.readLock().lock();
    int ele =  integers.get(index);
    reentrantReadWriteLock.readLock().unlock();
    return ele;
  }


  public static void main(String[] args) {

    add(1);
    add(2);
    System.out.println(getElement(0));
    System.out.println(getElement(1));

  }
}
