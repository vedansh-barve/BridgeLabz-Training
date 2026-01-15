package com.day8.gamebox;

public class GameBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game arcade = new ArcadeGame("Speed Racer", 9.99, 4.5);
        Game strategy = new StrategyGame("War Tactics", 14.99, 4.8);

        arcade.download();
        arcade.playDemo();

        strategy.download();
        strategy.playDemo();

        Game discountedGame = arcade.applyDiscount(20);
        System.out.println("Discounted Price: $" + discountedGame.getPrice());

        User user = new User("Alex");
        user.buyGame(arcade);
        user.buyGame(strategy);
	}

}
