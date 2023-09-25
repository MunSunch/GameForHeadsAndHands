package com.munsun.game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Entity> monsters;
    private Player player;
    private MonsterFabricMethod monsterFabric;
    private PlayerFabricMethod playerFabric;
    private long pauseSecond;
    public static final long DEFAULT_PAUSE_SECOND = 500;

    public Game(PlayerFabricMethod playerFabric, MonsterFabricMethod monsterFabric) {
        this.monsters = new ArrayList<>();
        this.monsterFabric = monsterFabric;
        this.playerFabric = playerFabric;
    }

    public void config(String namePlayer, TypePlayer typePlayer) {
        config(namePlayer, typePlayer, DEFAULT_PAUSE_SECOND);
    }

    public void config(String namePlayer, TypePlayer typePlayer, long pauseSecondBetweenLevel) {
        this.player = this.playerFabric.create(namePlayer, typePlayer);
        this.pauseSecond = pauseSecondBetweenLevel;
    }

    public void start(int countMonster) throws InterruptedException {
        addMonsters(countMonster);
        int countDefeatedMonsters = 0;
        for (int i = 0; i < monsters.size() && player.isLive(); i++) {
            System.out.println("==================================");
            System.out.println("Уровень " + (i+1));
            var currentMonster = monsters.get(i);
            System.out.printf("Здоровье: игрок=%d, монстр=%d\n", player.getHealth(), currentMonster.getHealth());

            while(player.isLive() && currentMonster.isLive()) {
                var valueAttackPlayer = player.attack(currentMonster);
                System.out.printf("Игрок '%s' атакует монстра '%s' на %d\n", player.getName(), currentMonster.getName(), valueAttackPlayer);

                if(!currentMonster.isLive())
                    break;

                var valueAttackMonster = currentMonster.attack(player);
                System.out.printf("Монстр '%s' атакует игрока '%s' на %d\n", currentMonster.getName(), player.getName(), valueAttackMonster);

                System.out.printf("Игрок '%s' излечивает себя на %d\n", player.getName(), player.healingYourself());
            }
            if(!currentMonster.isLive()) {
                System.out.println("Монстр повержен...");
                countDefeatedMonsters++;
            }
            Thread.sleep(pauseSecond);
        }
        System.out.println("==================================");
        if(countDefeatedMonsters == countMonster)
            System.out.println("Победа!");
        else
            System.out.printf("Неудача! Кол-во побежденных монстров: %d/%d", countDefeatedMonsters, countMonster);
    }

    private void addMonsters(int countMonster) {
        for (int i = 0; i < countMonster/3; i++) {
            monsters.add(monsterFabric.create(TypeMonster.BEGINNER));
        }
        for (int i = 0; i < countMonster/3; i++) {
            monsters.add(monsterFabric.create(TypeMonster.INTERMEDIATE));
        }
        for (int i = 0; i < countMonster/3; i++) {
            monsters.add(monsterFabric.create(TypeMonster.HIGH));
        }
        monsters.add(monsterFabric.create(TypeMonster.BOSS));
    }
}
