package Animals;

import Enums.Environment;
import Enums.FoodType;
import Enums.Type;

public class Penguin extends Animal {
    public Penguin(String description) {
        this.setType(Type.Bird);
        this.setEnvironment(Environment.Arctic);
        this.setFoodType(FoodType.Fish);
        this.setDescription(description);
    }
}
