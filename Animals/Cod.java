package Animals;

import Enums.Environment;
import Enums.FoodType;
import Enums.Type;

public class Cod extends Animal {
    public Cod(String description) {
        this.setType(Type.Fish);
        this.setEnvironment(Environment.Ocean);
        this.setFoodType(FoodType.Fish);
        this.setDescription(description);
    }
}
