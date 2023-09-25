package com.munsun.game;

public enum TypePlayer {
    ARCHER(14,
            4,
            15,
            16,
            26,
            new DefaultAttackSystem(),
            4,
            0.3),
    SWORDSMAN(13,
            18,
            15,
            15,
            16,
            new DefaultAttackSystem(),
            4,
            0.3),
    KILLER(19,
            6,
            9,
            19,
            22,
            new DefaultAttackSystem(),
            4,
            0.3);

    private int valueAttack;
    private int valueDefence;
    private int health;
    private int minDamage;
    private int maxDamage;
    private AttackSystem attackSystem;
    private int countHealing;
    private double coefficientHealing;

    TypePlayer(int valueAttack, int valueDefence, int health, int minDamage, int maxDamage, AttackSystem attackSystem, int countHealing, double coefficientHealing) {
        this.valueAttack = valueAttack;
        this.valueDefence = valueDefence;
        this.health = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attackSystem = attackSystem;
        this.countHealing = countHealing;
        this.coefficientHealing = coefficientHealing;
    }

    public int getValueAttack() {
        return valueAttack;
    }

    public int getValueDefence() {
        return valueDefence;
    }

    public int getHealth() {
        return health;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public AttackSystem getAttackSystem() {
        return attackSystem;
    }

    public int getCountHealing() {
        return countHealing;
    }

    public double getCoefficientHealing() {
        return coefficientHealing;
    }
}
