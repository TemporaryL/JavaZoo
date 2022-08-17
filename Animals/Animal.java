package Animals;

import Enums.Environment;
import Enums.FoodType;
import Enums.Type;

public class Animal {
    private Environment environment;
    private Type type;
    private FoodType foodType;
    private String description;

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("%s - %s", getName(), description);
    }
}
