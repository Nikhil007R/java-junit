package com.bridgelabz;

public class Performance {
    public static void longRunningTask() {
        try {
            Thread.sleep(3000); // Simulates a long-running operation
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}