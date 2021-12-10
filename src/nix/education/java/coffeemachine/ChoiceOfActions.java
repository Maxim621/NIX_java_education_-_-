package nix.education.java.coffeemachine;

import java.util.Scanner;

public class ChoiceOfActions {
    private int availWater = 400;
    private int availMilk = 540;
    private int availBeans = 120;
    private int availMoney = 550;
    private int availCups = 9;

    Scanner scanner = new Scanner(System.in);

    protected void action(String option) {

        ChoiceOfActions information = new ChoiceOfActions();

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            option = scanner.nextLine();

            if (option.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int coffeeSelection = scanner.nextInt();

                switch (coffeeSelection) {
                        case 1:
                            espresso(availWater, availMilk, availBeans, availCups, availMoney);
                            break;
                        case 2:
                            latte(availWater, availMilk, availBeans, availCups, availMoney);
                            break;
                        case 3:
                            cappuccino(availWater, availMilk, availBeans, availCups, availMoney);
                            break;
                        default:
                            System.out.println("Unacceptable value, enter \"1\", \"2\" or \"3\"");
                            break;
                    }
                }

            if (option.equals("fill")) {
                fillIngredients();
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

    private void fillIngredients() {
        System.out.println("Write how many ml of water you want to add:");
        int fillWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int fillMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int fillBeans = scanner.nextInt();
        System.out.println("Write how many disposable coffee cups you want to add:");
        int fillCups = scanner.nextInt();
        controlIngredients(-fillWater, -fillMilk, -fillBeans, -fillCups, 0);
    }

    private void controlIngredients(int water, int milk, int beans, int cups, int money) {
        availWater -= water;
        availMilk -= milk;
        availBeans -= beans;
        availMoney += money;
        availCups -= cups;
    }

    private void espresso(int water, int milk, int beans, int cups, int money) {
        controlIngredients(250, 0, 16, 1, 4);
        if (availWater < 0) {
            System.out.println("Sorry, not enough water!");
            controlIngredients(-250, 0, -16, -1, -4);
        } else if (availBeans < 0) {
            System.out.println("Sorry, not enough coffee beans!");
            controlIngredients(-250, 0, -16, -1, -4);
        } else if (availCups < 0) {
            System.out.println("Sorry, not enough Cups!");
            controlIngredients(-250, 0, -16, -1, -4);
        }
    }

    private void latte(int water, int milk, int beans, int cups, int money) {
        controlIngredients(350, 75, 20, 1, 7);
        if (availWater < 0) {
            System.out.println("Sorry, not enough water!");
            controlIngredients(-350, -75, -20, -1, -7);
        } else if (availMilk < 0) {
            System.out.println("Sorry, not enough milk!");
            controlIngredients(-350, -75, -20, -1, -7);
        } else if (availBeans < 0) {
            System.out.println("Sorry, not enough coffee beans!");
            controlIngredients(-350, -75, -20, -1, -7);
        } else if (availCups < 0) {
            System.out.println("Sorry, not enough Cups!");
            controlIngredients(-350, -75, -20, -1, -7);
        }
    }

    private void cappuccino(int water, int milk, int beans, int cups, int money) {
        controlIngredients(200, 100, 12, 1, 6);
        if (availWater < 0) {
            System.out.println("Sorry, not enough water!");
            controlIngredients(-200, -100, -12, -1, -6);
        } else if (availMilk < 0) {
            System.out.println("Sorry, not enough milk!");
            controlIngredients(-200, -100, -12, -1, -6);
        } else if (availBeans < 0) {
            System.out.println("Sorry, not enough coffee beans!");
            controlIngredients(-200, -100, -12, -1, -6);
        } else if (availCups < 0) {
            System.out.println("Sorry, not enough Cups!");
            controlIngredients(-200, -100, -12, -1, -6);
        }
    }
}
