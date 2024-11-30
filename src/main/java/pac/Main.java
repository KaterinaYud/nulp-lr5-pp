package pac;
import java.util.Scanner;
import menu.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scan = new Scanner(System.in);
        String option;
        do {
            menu.displayMenu();
            System.out.print("Зробіть вибір: ");
            option = scan.next();
            menu.selectOption(option);
        } while (!option.equals("0"));
        scan.close();
    }
}
