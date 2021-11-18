package nix.education.java.coffeemachine;
import java.util.Scanner;

public class AmountOfCoffee {
    protected void amount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int quantity = scanner.nextInt();
        System.out.println("For " + quantity + " cups of coffee you will need:");
        int water = quantity * 200;
        System.out.println(water + " ml of water");
        int milk = quantity * 50;
        System.out.println(milk + " ml of milk");
        int beans = quantity * 15;
        System.out.println(beans + " g of coffee beans\n");
    }
}
