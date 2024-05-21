package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(double weight) {
        super("Gold", 0);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        double baseValue = 0;
        return baseValue + (weight * 100);

    }
}
