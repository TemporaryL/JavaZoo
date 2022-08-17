package Animals;

import Enums.Environment;
import Enums.FoodType;
import Enums.Type;

public class Camel extends Animal {
    public Camel(String description) {
        this.setType(Type.Mammal);
        this.setEnvironment(Environment.Deserts);
        this.setFoodType(FoodType.Plants);
        this.setDescription(description);
    }
}
