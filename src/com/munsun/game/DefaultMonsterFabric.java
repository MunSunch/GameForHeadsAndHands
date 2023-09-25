package com.munsun.game;

public class DefaultMonsterFabric implements MonsterFabricMethod {
    @Override
    public Monster create(TypeMonster type) {
        switch (type) {
            case BEGINNER: return createBeginnerMonster();
            case INTERMEDIATE: return  createIntermediateMonster();
            case HIGH: return  createHighMonster();
            default: return  createBoss();
        }
    }

    private Monster createBoss() {
        return new Monster(TypeMonster.BOSS.getName(),
                TypeMonster.BOSS.getValueAttack(),
                TypeMonster.BOSS.getValueDefence(),
                TypeMonster.BOSS.getHealth(),
                TypeMonster.BOSS.getMinDamage(),
                TypeMonster.BOSS.getMaxDamage(),
                TypeMonster.BOSS.getAttackSystem());
    }

    private Monster createHighMonster() {
        return new Monster(TypeMonster.HIGH.getName(),
                TypeMonster.HIGH.getValueAttack(),
                TypeMonster.HIGH.getValueDefence(),
                TypeMonster.HIGH.getHealth(),
                TypeMonster.HIGH.getMinDamage(),
                TypeMonster.HIGH.getMaxDamage(),
                TypeMonster.HIGH.getAttackSystem());
    }

    private Monster createIntermediateMonster() {
        return new Monster(TypeMonster.INTERMEDIATE.getName(),
                TypeMonster.INTERMEDIATE.getValueAttack(),
                TypeMonster.INTERMEDIATE.getValueDefence(),
                TypeMonster.INTERMEDIATE.getHealth(),
                TypeMonster.INTERMEDIATE.getMinDamage(),
                TypeMonster.INTERMEDIATE.getMaxDamage(),
                TypeMonster.INTERMEDIATE.getAttackSystem());
    }

    private Monster createBeginnerMonster() {
        return new Monster(TypeMonster.BEGINNER.getName(),
                TypeMonster.BEGINNER.getValueAttack(),
                TypeMonster.BEGINNER.getValueDefence(),
                TypeMonster.BEGINNER.getHealth(),
                TypeMonster.BEGINNER.getMinDamage(),
                TypeMonster.BEGINNER.getMaxDamage(),
                TypeMonster.BEGINNER.getAttackSystem());
    }
}