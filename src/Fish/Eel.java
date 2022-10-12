package Fish;

public class Eel extends Fish {

    private String electricity;

    public Eel() {
    }

    public Eel(int height, int weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills,
            String electricity) {
        super(height, weight, animalType, bloodType, liveInWater, hasGills);
    }

    public String showInfo() {
        return "Eel []";
    }
}
