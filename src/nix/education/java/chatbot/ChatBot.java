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
    }
}
