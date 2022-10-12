package Reptile;

import Animal.Animal;

public class Reptile extends Animal {

    private String skinType;
    private String backBone;
    private String eggs;

    public Reptile() {
        this.skinType = "";
        this.backBone = "";
        this.eggs = "";
    }

    public Reptile(int height, int weight, String animalType, String bloodType, String skinType, String backBone,
            String eggs) {
        super(height, height, animalType, bloodType);
        this.skinType = skinType;
        this.backBone = backBone;
        this.eggs = eggs;
    }

    public String getSkinType() {
        return this.skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getBackBone() {
        return this.backBone;
    }

    public void setBackBone(String backBone) {
        this.backBone = backBone;
    }

    public String getEggs() {
        return this.eggs;
    }

    public void setEggs(String eggs) {
        this.eggs = eggs;
    }

}
