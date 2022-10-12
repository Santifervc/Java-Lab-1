package Birds;

import Animal.Animal;

public class Birds extends Animal {

    private boolean animalsWithFeathers;
    private boolean canFly;

    public Birds() {
        this.animalsWithFeathers = true;
        this.canFly = true;

    }

    public Birds(int height, int weight, String animalType, String bloodType, boolean animalsWithFeathers,
            boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.animalsWithFeathers = animalsWithFeathers;
        this.canFly = canFly;
    }

    public boolean isAnimalsWithFeathers() {
        return this.animalsWithFeathers;
    }

    public void setAnimalsWithFeathers(boolean animalsWithFeathers) {
        this.animalsWithFeathers = animalsWithFeathers;
    }

    public boolean isCanFly() {
        return this.canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

}
