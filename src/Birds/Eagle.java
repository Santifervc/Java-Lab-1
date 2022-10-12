package Birds;

public class Eagle extends Birds {

    public Eagle() {
    }

    public Eagle(int height, int weight, String animalType, String bloodType, boolean animalsWithFeathers,
            boolean canFly) {
        super(height, weight, animalType, bloodType, animalsWithFeathers, canFly);
    }

    public String showInfo() {
        return "Eagle []";
    }

}
