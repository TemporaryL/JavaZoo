package Animals;

import Enums.Environment;
import Enums.FoodType;
import Enums.Type;

public class Leopard extends Animal {
    public Leopard(String description) {
        this.setType(Type.Mammal);
        this.setEnvironment(Environment.Jungle);
        this.setFoodType(FoodType.Meat);
        this.setDescription(description);
    }
}
