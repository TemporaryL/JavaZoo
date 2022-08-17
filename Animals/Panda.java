package Animals;

import Enums.Environment;
import Enums.FoodType;
import Enums.Type;

public class Panda extends Animal {
    public Panda(String description) {
        this.setType(Type.Mammal);
        this.setEnvironment(Environment.Forest);
        this.setFoodType(FoodType.Plants);
        this.setDescription(description);
    }
}
