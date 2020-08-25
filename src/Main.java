import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mealInteger;
        ArrayList<String> allMeals = new ArrayList<String>();
        String nextItem;
        System.out.println("Let's get started.");
        for(int i=0; i<=6;i++){ //For all weekdays
            mealInteger=0; //First reset the meal integer counter
            nextItem="Default";//First set nextItem to a default value
            //While (maybe use the other version that doesn't have to run once) nextItem isn't "Next"
            nextItem=StartOfDay.promptForPlanItem(StartOfDay.days[i],mealInteger);//Grab nextItem for meal integer value
            allMeals.add(nextItem);//Add nextItem to allMeals
            //End while loop
        };
        System.out.println("Here's your total list of items for this week:");
        for(int i=0;i<=allMeals.size()-1;i++){
            System.out.println(allMeals.get(i));
        };
}}
