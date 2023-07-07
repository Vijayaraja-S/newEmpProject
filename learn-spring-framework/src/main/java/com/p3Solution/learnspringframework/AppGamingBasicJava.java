package com.p3Solution.learnspringframework;

import com.p3Solution.learnspringframework.game.GameRunner;
import com.p3Solution.learnspringframework.game.Marrio;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var Marrio = new Marrio();
		var GameRunner= new GameRunner(Marrio);
		GameRunner.run();

	}

}
