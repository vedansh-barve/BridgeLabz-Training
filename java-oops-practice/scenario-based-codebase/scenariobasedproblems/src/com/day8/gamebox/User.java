package com.day8.gamebox;
import java.util.*;

public class User {
	 private String username;
	 private List<Game> ownedGames;

	 public User(String username) {
		 this.username = username;
		 this.ownedGames = new ArrayList<>();
	 }

	 public void buyGame(Game game) {
		 ownedGames.add(game);
		 System.out.println(username + " purchased " + game.getTitle());
	 }

	 protected List<Game> getOwnedGames() {
		 return ownedGames;
	 }
}
