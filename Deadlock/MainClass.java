package Deadlock;

import javax.management.DescriptorAccess;

public class MainClass {
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        deadLock.m1();
    }
}
