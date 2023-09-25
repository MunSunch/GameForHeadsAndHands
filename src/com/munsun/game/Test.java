package com.munsun.game;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game(new DefaultPlayerFabric(), new DefaultMonsterFabric());
        long pause = (args.length == 2)
                ? Game.DEFAULT_PAUSE_SECOND
                : Long.parseLong(args[2]);
        game.config(args[0], TypePlayer.valueOf(args[1]), pause);
        game.start(10);
    }
}
