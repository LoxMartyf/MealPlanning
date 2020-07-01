import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] knownDishes = {
                "Ribs",
                "Burger Bowls"};
        Scanner scan = new Scanner(System.in);
        System.out.println("What are you having this week?");
        String nextDish = scan.next() + scan.nextLine();
        if (Arrays.stream(knownDishes).anyMatch(nextDish::equals)){
            MealPlan newPlan = new MealPlan(nextDish);
            System.out.println(newPlan);
    }
        else{
            System.out.println("Doesn't match anything. Here's the known list of dishes:");
            for(int i=0; i<=knownDishes.length-1;i++){
                System.out.println(knownDishes[i]);
            }
            String nextDish2 = scan.next() + scan.nextLine();
        }
    }
}
