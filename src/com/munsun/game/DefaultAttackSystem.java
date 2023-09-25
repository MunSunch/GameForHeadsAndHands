package com.munsun.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DefaultAttackSystem implements AttackSystem{
    private Random random;
    private List<Integer> successValuesCube;

    public DefaultAttackSystem() {
        this.random = new Random();
        this.successValuesCube = new ArrayList<>();
            successValuesCube.add(5);
            successValuesCube.add(6);
    }

    @Override
    public int attack(Entity entity, Entity anotherEntity) {
        int modifierAttack = entity.getValueAttack() - anotherEntity.getValueDefence() + 1;
        boolean success = roleCube(1);
        if(modifierAttack > 0)
            success = roleCube(modifierAttack - 1);
        if(success) {
            var damage = random.nextInt(entity.getMinDamage(), entity.getMaxDamage()+1);
            var newHealthAnotherEntity = anotherEntity.getHealth() - damage;
            if(newHealthAnotherEntity > 0)
                anotherEntity.setHealth(newHealthAnotherEntity);
            else
                anotherEntity.setHealth(0);
            return damage;
        }
        return 0;
    }

    private boolean roleCube(int i) {
        int minValueCube = 1;
        int maxValueCube = 6;
        for (int j = 0; j < i; j++) {
            var currentValueCube = random.nextInt(minValueCube, maxValueCube+1);
            if(isSuccessValueCube(currentValueCube))
                return true;
        }
        return false;
    }

    private boolean isSuccessValueCube(int currentValueCube) {
        return successValuesCube.stream()
                .anyMatch(x->x==currentValueCube);
    }
}
