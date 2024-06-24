package org.example;

public class Safe {

    public void checkSafe(boolean correctCode, boolean authenticationStatus, boolean trapStatus, int timeRemaining) {
        if (correctCode) {
            if (authenticationStatus) {
                if (!trapStatus) {
                    if (timeRemaining == 10) {
                        System.out.println("The safe is open.");
                    }
                    else {
                        System.out.println("The safe is closed. time remaining not equal to 10.");
                    }
                }
                else {
                    System.out.println("The safe is close.trapStatus is true");
                }
            }else {
                System.out.println("The safe is close.authenticationStatus is false");
            }
        }else {
            System.out.println("The safe is close.correctCode is false");
        }
    }
}
