package nix.education.java.coffeemachine;

import java.util.Scanner;

public class ChoiceOfActions {
    protected void action(String option) {
        int availWater = 400;
        int availMilk = 540;
        int availBeans = 120;
        int availMoney = 550;
        int availCups = 9;

        Scanner scanner = new Scanner(System.in);
        ChoiceOfActions information = new ChoiceOfActions();

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            option = scanner.nextLine();

            if (option.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int coffeeSelection = scanner.nextInt();

                switch (coffeeSelection) {
                    case 1:
                        availWater = availWater - 250;
                        availBeans = availBeans - 16;
                        availMoney = availMoney + 4;
                        availCups = availCups - 1;
                        if (availWater < 0) {
                            System.out.println("Sorry, not enough water!");
                            availBeans = availBeans + 16;
                            availMoney = availMoney - 4;
                            availCups = availCups + 1;
                        } else if (availBeans < 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            availWater = availWater + 250;
                            availMoney = availMoney - 4;
                            availCups = availCups + 1;
                        } else if (availCups < 0) {
                            System.out.println("Sorry, not enough Cups!");
                            availWater = availWater + 250;
                            availBeans = availBeans + 16;
                            availMoney = availMoney - 4;
                        }
                        break;
                    case 2:
                        availWater = availWater - 350;
                        availMilk = availMilk - 75;
                        availBeans = availBeans - 20;
                        availMoney = availMoney + 7;
                        availCups = availCups - 1;
                        if (availWater < 0) {
                            System.out.println("Sorry, not enough water!");
                            availMilk = availMilk + 75;
                            availBeans = availBeans + 20;
                            availMoney = availMoney - 7;
                            availCups = availCups + 1;
                        } else if (availMilk < 0) {
                            System.out.println("Sorry, not enough milk!");
                            availWater = availWater + 350;
                            availBeans = availBeans + 20;
                            availMoney = availMoney - 7;
                            availCups = availCups + 1;
                        } else if (availBeans < 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            availWater = availWater + 350;
                            availMilk = availMilk + 75;
                            availMoney = availMoney - 7;
                            availCups = availCups + 1;
                        } else if (availCups < 0) {
                            System.out.println("Sorry, not enough Cups!");
                            availWater = availWater + 350;
                            availMilk = availMilk + 75;
                            availBeans = availBeans + 20;
                            availMoney = availMoney - 7;
                        }
                        break;
                    case 3:
                        availWater = availWater - 200;
                        availMilk = availMilk - 100;
                        availBeans = availBeans - 12;
                        availMoney = availMoney + 6;
                        availCups = availCups - 1;
                        if (availWater < 0) {
                            System.out.println("Sorry, not enough water!");
                            availMilk = availMilk + 100;
                            availBeans = availBeans + 12;
                            availMoney = availMoney - 6;
                            availCups = availCups + 1;
                        } else if (availMilk < 0) {
                            System.out.println("Sorry, not enough milk!");
                            availWater = availWater + 200;
                            availBeans = availBeans + 12;
                            availMoney = availMoney - 6;
                            availCups = availCups + 1;
                        } else if (availBeans < 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            availWater = availWater + 200;
                            availMilk = availMilk + 100;
                            availMoney = availMoney - 6;
                            availCups = availCups + 1;
                        } else if (availCups < 0) {
                            System.out.println("Sorry, not enough Cups!");
                            availWater = availWater + 200;
                            availMilk = availMilk + 100;
                            availBeans = availBeans + 12;
                            availMoney = availMoney - 6;
                        }
                        break;
                    default:
                        System.out.println("Unacceptable value, enter \"1\", \"2\" or \"3\"");
                        break;
                }
            }

            if (option.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int fillWater = scanner.nextInt();
                availWater = availWater + fillWater;
                System.out.println("Write how many ml of milk you want to add:");
                int fillMilk = scanner.nextInt();
                availMilk = availMilk + fillMilk;
                System.out.println("Write how many grams of coffee beans you want to add:");
                int fillBeans = scanner.nextInt();
                availBeans = availBeans + fillBeans;
                System.out.println("Write how many disposable coffee cups you want to add:");
                int fillCups = scanner.nextInt();
                availCups = availCups + fillCups;
            }

            if (option.equals("take")) {
                if (availMoney == 0)
                    System.out.println("Sorry, I have no money(");
                else
                    System.out.println("I gave you " + availMoney);
                availMoney = 0;
            }

            if (option.equals("remaining")) {
                information.info(availWater, availMilk, availBeans, availCups, availMoney);
            }

            if (option.equals("exit")) {
                break;
            }
        }
    }

   private void info(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money\n");
    }
}
