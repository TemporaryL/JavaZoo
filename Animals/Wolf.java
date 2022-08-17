package Animals;

import Enums.Environment;
import Enums.FoodType;
import Enums.Type;

public class Wolf extends Animal {
    public Wolf(String description) {
        this.setType(Type.Mammal);
        this.setEnvironment(Environment.Forest);
        this.setFoodType(FoodType.Meat);
        this.setDescription(description);
    }
}
