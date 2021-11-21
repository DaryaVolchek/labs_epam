package vegetables;

import models.VegetableTypes;

public class Vegetable {

    private final String title;
    private final float calorieContent;
    private final float weight;
    private final VegetableTypes type;

    public Vegetable(String title, float calorieContent, float weight, VegetableTypes type) {
        this.title = title;
        this.calorieContent = calorieContent;
        this.weight = weight;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public float getCalorieContent() {
        return (weight*calorieContent)/100;
    }

    public float getWeight() {
        return weight;
    }

    public VegetableTypes getType() {
        return type;
    }

    public float getThisCalorieContent(){
        return calorieContent;
    }

    @Override
    public String toString() {
        return "Салат {" +
                "Овощ ='" + title + '\'' +
                ", калорийность=" + calorieContent + " на 100 г" +
                ", вес=" + weight + " г" +
                ", тип овоща=" + type +
                '}';
    }
}


