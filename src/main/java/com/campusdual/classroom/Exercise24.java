package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Smith");
        queue.offer("Montessori");
        queue.offer("Peralta");
        queue.offer("House");
        return queue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {

        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        Queue<String> myQueue = createQueue();

        System.out.println("Imprimiendo y vaciando la cola:");
        printAndEmptyQueue(myQueue);
    }

}
