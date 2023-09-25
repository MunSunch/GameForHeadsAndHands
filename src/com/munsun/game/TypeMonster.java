package com.munsun.game;

public enum TypeMonster {
    BEGINNER("Камень", 5, 0, 8, 1, 5, new DefaultAttackSystem()),
    INTERMEDIATE("Скала", 10, 4, 12, 3, 6, new DefaultAttackSystem()),
    HIGH("Импостер", 16, 4, 22, 4, 14, new DefaultAttackSystem()),
    BOSS("Азазело", 30, 10, 40, 10, 20, new DefaultAttackSystem());

    private String name;
    private int valueAttack;
    private int valueDefence;
    private int health;
    private int minDamage;
    private int maxDamage;
    private AttackSystem attackSystem;

    TypeMonster(String name, int valueAttack, int valueDefence, int health, int minDamage, int maxDamage, AttackSystem attackSystem) {
        this.name = name;
        this.valueAttack = valueAttack;
        this.valueDefence = valueDefence;
        this.health = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.attackSystem = attackSystem;
    }

    public String getName() {
        return name;
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
}
