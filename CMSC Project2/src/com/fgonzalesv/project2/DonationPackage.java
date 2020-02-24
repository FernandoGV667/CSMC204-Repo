package com.fgonzalesv.project2;

public class DonationPackage {
    private String description;
    private int weight;

    public DonationPackage(String description, int weight) {
        this.description=description;
        this.weight=weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHeavy(){
        return this.weight >= 20;
    }
}
