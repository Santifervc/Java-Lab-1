package Reptile;

public class Crocodile extends Reptile {

    public Crocodile() {
    }

    public Crocodile(int height, int weight, String animalType, String bloodType, String skinType, String backBone,
            String eggs) {
        super(height, weight, animalType, bloodType, skinType, backBone, eggs);

    }

    public String showInfo() {
        return "Crocodile []";
    }
}
