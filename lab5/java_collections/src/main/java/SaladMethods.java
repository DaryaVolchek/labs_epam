import vegetables.Vegetable;

import java.util.Comparator;
import java.util.List;

public class SaladMethods {

    private final List<Vegetable> vegetables;

    public SaladMethods(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public double getTotalCalorieContent(){
        return vegetables.stream().mapToDouble(Vegetable::getCalorieContent).sum();
    }

    public double getTotalWeight(){
        return vegetables.stream().mapToDouble(Vegetable::getWeight).sum();
    }

    public void sortByWeight(){
        vegetables.sort(Comparator.comparingDouble(Vegetable::getWeight));
    }

    public void getVegetablesWithRangeOfCalorieContent(int minCalorieContent, int maxCalorieContent){
        vegetables.stream().filter(vegetable -> vegetable.getThisCalorieContent() >= minCalorieContent
        && vegetable.getThisCalorieContent() <= maxCalorieContent).forEach(System.out::println);
    }

    public List<Vegetable> getVegetables(){
        return vegetables;
    }
}
