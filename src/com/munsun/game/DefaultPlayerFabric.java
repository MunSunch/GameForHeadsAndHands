package com.munsun.game;

public class DefaultPlayerFabric implements PlayerFabricMethod {
    @Override
    public Player create(String name, TypePlayer typePlayer) {
        switch(typePlayer) {
            case ARCHER: return createArcher(name);
            case SWORDSMAN: return createSwordsman(name);
            default: return createKiller(name);
        }
    }

    private Player createArcher(String name) {
        return new Player(name,
                TypePlayer.ARCHER.getValueAttack(),
                TypePlayer.ARCHER.getValueDefence(),
                TypePlayer.ARCHER.getHealth(),
                TypePlayer.ARCHER.getMinDamage(),
                TypePlayer.ARCHER.getMaxDamage(),
                TypePlayer.ARCHER.getAttackSystem(),
                TypePlayer.ARCHER.getCountHealing(),
                TypePlayer.ARCHER.getCoefficientHealing());
    }

    private Player createSwordsman(String name) {
        return new Player(name,
                TypePlayer.SWORDSMAN.getValueAttack(),
                TypePlayer.SWORDSMAN.getValueDefence(),
                TypePlayer.SWORDSMAN.getHealth(),
                TypePlayer.SWORDSMAN.getMinDamage(),
                TypePlayer.SWORDSMAN.getMaxDamage(),
                TypePlayer.SWORDSMAN.getAttackSystem(),
                TypePlayer.SWORDSMAN.getCountHealing(),
                TypePlayer.SWORDSMAN.getCoefficientHealing());
    }

    private Player createKiller(String name) {
        return new Player(name,
                TypePlayer.KILLER.getValueAttack(),
                TypePlayer.KILLER.getValueDefence(),
                TypePlayer.KILLER.getHealth(),
                TypePlayer.KILLER.getMinDamage(),
                TypePlayer.KILLER.getMaxDamage(),
                TypePlayer.KILLER.getAttackSystem(),
                TypePlayer.KILLER.getCountHealing(),
                TypePlayer.KILLER.getCoefficientHealing());
    }
}
