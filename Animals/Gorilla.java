package Animals;

import Enums.Environment;
import Enums.FoodType;
import Enums.Type;

public class Gorilla extends Animal {
    public Gorilla(String description) {
        this.setType(Type.Mammal);
        this.setEnvironment(Environment.Jungle);
        this.setFoodType(FoodType.FruitAndVegetables);
        this.setDescription(description);
    }
}
