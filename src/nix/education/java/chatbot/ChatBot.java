package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        System.out.println("Hello! My name is Jarvis.\nI was created in 2021.\nPlease, remind me your name.");


        while (true) {
            response = scanner.nextLine();
            if (response.equals("Maxim")) {
                System.out.println("What a great name you have, Maxim!");
                break;
            }
        }

        System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");

        int age = 0;
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        while (true) {
            response = scanner.nextLine();
            if (response.equals("")) {
                age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
                System.out.println("Your age is " + age + ";" + " that's a good time to start programming!");
                break;
            }
        }
    }
}
