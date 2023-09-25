package com.munsun.game;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game(new DefaultPlayerFabric(), new DefaultMonsterFabric());
        game.config("Толя", TypePlayer.SWORDSMAN, 1000);
        game.start(10);
    }
}
