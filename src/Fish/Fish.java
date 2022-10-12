package Fish;

import Animal.Animal;

public class Fish extends Animal {

    private boolean liveInWater;
    private boolean hasGills;

    public Fish() {
        this.liveInWater = true;
        this.hasGills = true;
    }

    public Fish(int height, int weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills) {
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;

    }

    public boolean isLiveInWater() {
        return this.liveInWater;
    }

    public void setLiveInWater(boolean liveInWater) {
        this.liveInWater = liveInWater;
    }

    public boolean isHasGills() {
        return this.hasGills;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }

}
