package com.munsun.game;

public class Monster extends Entity{
    public Monster(String name, int valueAttack, int valueDefence, int health, int minDamage, int maxDamage, AttackSystem attackSystem) {
        super(name, valueAttack, valueDefence, health, minDamage, maxDamage, attackSystem);
    }
}
