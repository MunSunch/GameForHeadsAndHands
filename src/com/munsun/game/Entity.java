package com.munsun.game;

public abstract class Entity {
    private String name;
    private int valueAttack;
    private int valueDefence;
    private int health;
    private int minDamage;
    private int maxDamage;
    private AttackSystem attackSystem;

    public Entity(String name, int valueAttack, int valueDefence, int health, int minDamage, int maxDamage, AttackSystem attackSystem) {
        this.name = name;
        this.valueAttack = valueAttack;
        this.valueDefence = valueDefence;
        this.health = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attackSystem = attackSystem;
    }

    public int attack(Entity entity) {
        return attackSystem.attack(this, entity);
    }

    public boolean isLive() {
        return health > 0;
    }

    public void setHealth(int health) {
        if(health < 0)
            throw new IllegalArgumentException();
        this.health = health;
    }

    public void setValueAttack(int valueAttack) {
        if(!checkNewValueAttackOrDefence(valueAttack))
            throw new IllegalArgumentException();
        this.valueAttack = valueAttack;
    }

    public void setValueDefence(int valueDefence) {
        if(!checkNewValueAttackOrDefence(valueAttack))
            throw new IllegalArgumentException();
        this.valueDefence = valueDefence;
    }

    private boolean checkNewValueAttackOrDefence(int newValue) {
        return newValue>0 && newValue<=30;
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

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void setAttackSystem(AttackSystem attackSystem) {
        this.attackSystem = attackSystem;
    }

    public String getName() {
        return name;
    }
}
