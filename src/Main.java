import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] knownDishes = KnownDishes.entrees;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to add an entree or side?");
        String nextDish = scan.next() + scan.nextLine();
        if (Arrays.stream(knownDishes).anyMatch(nextDish::equals)){
            MealPlan newPlan = new MealPlan(nextDish);
            System.out.println(newPlan);
    }
        else{
            System.out.println("Doesn't match anything, please try again. Here's the known list of dishes:");
            for(int i=0; i<=knownDishes.length-1;i++){
                System.out.println(knownDishes[i]);
            }
            String nextDish2 = scan.next() + scan.nextLine();
        }
    }
}
