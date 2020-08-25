import java.util.Scanner;
public class StartOfDay {
    public static String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public static String promptForPlanItem (String dayName, int increment){
        Scanner scan = new Scanner(System.in);
        if(increment==0){System.out.println("What are you having "+dayName+"? Entree, Side or Next");}
        else{System.out.println("What else are you having "+dayName+"? Entree, Side or Next");}
        String nextItem = scan.next() + scan.nextLine();
        return nextItem;
    }
}
