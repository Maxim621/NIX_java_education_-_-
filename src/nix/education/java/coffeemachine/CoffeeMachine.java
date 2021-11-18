package nix.education.java.coffeemachine;

import java.util.Scanner;

public class CoffeeMachine extends AmountOfCoffee {
    public static void main(String[] args) {
        ChoiceOfActions check = new ChoiceOfActions();
        String restore = new String();
        check.action(restore);
    }
}
