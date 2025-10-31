package LabActivity;

import java.util.Scanner;

public class LabActivity1_DFA {

    private enum State {
        q0, q1, q2
    }

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n---DFA String Acceptance Checker---");
            System.out.println("Enter a sample binary strings (or type 'exit' to quit): ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program terminated.");
                break;
            }

            if (!isValidBinaryString(input)) {
                System.out.println("Error: Invalid input!");
                continue;
            }
            boolean accepted = simulateDFA(input);
            System.out.println("\nOutput: " + (accepted ? "Accepted" : "Rejected"));
        }
        scan.close();
    }

    private static boolean isValidBinaryString(String input) {
        if ((input == null) || input.isEmpty()) {
            return false;
        }
        return input.matches("[01]+");
    }
    private static boolean simulateDFA(String input){
        State currentState = State.q0;

        for(int i = 0; i < input.length(); i++){
            char symbol = input.charAt(i);
            State previousState = currentState;

            currentState = transition(currentState, symbol);
        }
        return currentState == State.q2;
    }
    private static State transition(State current, char symbol){
        switch (current){
            case q0, q2:
                if (symbol == '0'){
                    return State.q1;
                }else{
                    return  State.q0;
                }
            case q1:
                if (symbol == '0'){
                    return  State.q1;
                }else {
                    return State.q2;
                }
            default:
                return State.q0;
        }
    }
}

