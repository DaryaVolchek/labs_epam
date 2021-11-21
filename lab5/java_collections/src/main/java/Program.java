import models.VegetableTypes;
import vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    static List<Vegetable> vegetables = Arrays.asList(
        new Vegetable("морковь", 33, 35, VegetableTypes.ROOTS),
        new Vegetable("томат", 19, 50, VegetableTypes.FRUITS),
        new Vegetable("капуста", 29, 90, VegetableTypes.GREENS),
        new Vegetable("перец", 27, 23, VegetableTypes.FRUITS),
        new Vegetable("огурец", 15, 40, VegetableTypes.FRUITS),
        new Vegetable("свекла", 48, 15, VegetableTypes.ROOTS),
        new Vegetable("укроп", 25, 10, VegetableTypes.GREENS),
        new Vegetable("горох", 72, 30, VegetableTypes.FRUITS),
        new Vegetable("фасоль", 32, 24, VegetableTypes.FRUITS)
    );

    public static void main(String[] args) {
        SaladMethods salad = new SaladMethods(vegetables);
        System.out.println("Общая калорийность салата массой " + salad.getTotalWeight()
                + " = " + salad.getTotalCalorieContent() + " калорий");
        System.out.println("\nОтсортированные по весу овощи в салате: ");
        salad.sortByWeight();
        salad.getVegetables().forEach(System.out::println);
        System.out.println("\nОвощи калорийностью от 20 до 40: ");
        salad.getVegetablesWithRangeOfCalorieContent(20, 40);
    }

}
