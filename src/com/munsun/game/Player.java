package com.munsun.game;

public class Player extends Entity {
    private int countHealing;
    private double coefficientHealing;

    public Player(String name, int valueAttack, int valueDefence, int health, int minDamage, int maxDamage, AttackSystem attackSystem, int countHealing, double coefficientHealing) {
        super(name, valueAttack, valueDefence, health, minDamage, maxDamage, attackSystem);
        this.countHealing = countHealing;
        this.coefficientHealing = coefficientHealing;
    }

    public int healingYourself() {
        if(countHealing != 0) {
            var oldHealth = getHealth();
            int newHealth = (int)(getHealth() * (coefficientHealing+1));
            setHealth(newHealth);
            countHealing--;
            return newHealth-oldHealth;
        }
        return 0;
    }

    public int getCountHealing() {
        return countHealing;
    }

    public void setCountHealing(int countHealing) {
        this.countHealing = countHealing;
    }

    public double getCoefficientHealing() {
        return coefficientHealing;
    }

    public void setCoefficientHealing(double coefficientHealing) {
        this.coefficientHealing = coefficientHealing;
    }
}
