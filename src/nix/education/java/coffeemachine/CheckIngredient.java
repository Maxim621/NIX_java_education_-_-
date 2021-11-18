package nix.education.java.coffeemachine;

import java.util.Scanner;

public class CheckIngredient extends AmountOfCoffee{
    @Override
    protected void amount()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cup = scanner.nextInt();

        int requireWater = water / (cup * 200);
        int requireMilk = milk / (cup * 50);
        int requireBeans = beans / (cup * 15);
        int require = 0;

        if (requireWater == 1 && requireMilk == 1 && requireBeans == 1)
            require = cup;

        for (int i = 0; i <= require; i++) {
            if (requireWater >= cup && requireMilk >= cup && requireBeans >= cup) {
                requireWater--;
                requireMilk--;
                requireBeans--;
                require++;
            }
        }

        if (require == cup)
            System.out.println("Yes, I can make that amount of coffee\n");
        else if (require > cup)
            System.out.println("Yes, I can make that amount of coffee (and even " + --require + " more than that)\n");
        else
            System.out.println("No, I can make only " + require + " cups of coffee&quot\n");
    }
}
