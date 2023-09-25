package com.munsun.game;

public class Test {
    public static void main(String[] args) {
        Game game = new Game(new DefaultPlayerFabric(), new DefaultMonsterFabric());
        game.config("Толя", TypePlayer.ARCHER);
        game.start(10);
    }
}
