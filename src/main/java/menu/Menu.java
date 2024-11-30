package menu;
import commands.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {
    private Map<String, MenuItem> menuItems;
    public Menu() {
        menuItems = new LinkedHashMap<>();
        menuItems.put("1", new MenuItem("Додати квітку", new AddFlowerCommand()));
        menuItems.put("2", new MenuItem("Редагувати квітку", new EditFlowerCommand()));
        menuItems.put("3", new MenuItem("Видалити квітку", new DeleteFlowerCommand()));
        menuItems.put("4", new MenuItem("Додати квітку до букета", new AddBouquetCommand()));
        menuItems.put("5", new MenuItem("Видалити квітку з букета", new DeleteBouquetCommand()));
        menuItems.put("6", new MenuItem("Розрахувати ціну", new PriceCommand()));
        menuItems.put("7", new MenuItem("Обрати аксесуар", new ChooseAccessoryCommand()));
        menuItems.put("8", new MenuItem("Сортувати за свіжістю", new SortFreshnessCommand()));
        menuItems.put("9", new MenuItem("Знайти за стеблом", new SearchStemCommand()));
        menuItems.put("0", new MenuItem("Вихід з програми", null));
    }

    public void displayMenu() {
        for (Map.Entry<String, MenuItem> entry : menuItems.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().getDescription());
        }
    }

    public void selectOption(String option) {
        MenuItem menuItem = menuItems.get(option);
        if (menuItem != null) {
            if (option.equals("0")) {
                System.out.println("Вихід з програми.");
            } else {
                menuItem.execute();
            }
        } else {
            System.out.println("Некоректний вибір, спробуйте знову.");
        }
    }
}



