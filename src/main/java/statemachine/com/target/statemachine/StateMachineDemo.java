package com.target.statemachine;

import java.util.Scanner;

public class StateMachineDemo {

    public static void main(String[] args) {
        System.out.println("***  Welcome to State Machine ***");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        StateMachine stateMachine = new StateMachine();

        while (true) {
            System.out.println(">");
            String input = scanner.nextLine();
            stateMachine.setInputEvent(input);
            stateMachine.preProcess();
            stateMachine.process();
            stateMachine.postProcess();
        }

    }

}
