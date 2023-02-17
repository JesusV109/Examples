package lab4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyArrayList {
private static final int ITERATIONS = 100000;
private static final int N = 1000;

public static void main(String[] args) {
    Random random = new Random();
    List<Integer> arrayList = new ArrayList<>(N);
    List<Integer> linkedList = new LinkedList<>();
    long startTime, endTime, totalTime;

    // Add one element to ArrayList
    startTime = System.nanoTime();
    for (int i = 0; i < ITERATIONS; i++) {
        arrayList.add(random.nextInt());
    }
    endTime = System.nanoTime();
   

    // Add one element to LinkedList
    startTime = System.nanoTime();
    for (int i = 0; i < ITERATIONS; i++) {
        linkedList.add(random.nextInt());
    }
    endTime = System.nanoTime();
    totalTime = endTime - startTime;
    System.out.println("Time taken to add one element to LinkedList: " + totalTime + " nanoseconds");

    // Add to front in ArrayList
    startTime = System.nanoTime();
    for (int i = 0; i < ITERATIONS; i++) {
        arrayList.add(0, random.nextInt());
    }
    endTime = System.nanoTime();
    totalTime = endTime - startTime;
    System.out.println("Time taken to add to front in ArrayList: " + totalTime + " nanoseconds");

    // Add to front in LinkedList
    startTime = System.nanoTime();
    for (int i = 0; i < ITERATIONS; i++) {
        linkedList.add(0, random.nextInt());
    }
    endTime = System.nanoTime();
    totalTime = endTime - startTime;
    System.out.println("Time taken to add to front in LinkedList: " + totalTime + " nanoseconds");

    // Delete one element from ArrayList
    startTime = System.nanoTime();
    for (int i = 0; i < ITERATIONS; i++) {
        arrayList.remove(arrayList.size() - 1);
    }
    endTime = System.nanoTime();
    totalTime = endTime - startTime;
    System.out.println("Time taken to delete one element from ArrayList: " + totalTime + " nanoseconds");

    // Delete one element from LinkedList
    startTime = System.nanoTime();
    for (int i = 0; i < ITERATIONS; i++) {
        linkedList.remove(linkedList.size() - 1);
    }
    endTime = System.nanoTime();
    totalTime = endTime - startTime;
    System.out.println("Time taken to delete one element from LinkedList: " + totalTime + " nanoseconds");

}
}

