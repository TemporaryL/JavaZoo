package Animals;

import Enums.Environment;
import Enums.FoodType;
import Enums.Type;

public class Seal extends Animal {
    public Seal(String description) {
        this.setType(Type.Mammal);
        this.setEnvironment(Environment.Arctic);
        this.setFoodType(FoodType.Fish);
        this.setDescription(description);
    }
}
