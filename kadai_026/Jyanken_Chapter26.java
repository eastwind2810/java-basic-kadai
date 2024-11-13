package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	String input;
	String enemy;
	
	Scanner MyChoice = new Scanner(System.in);
	public void getMyChoice() {		
		this.input = MyChoice.nextLine();
		while(!(input.equals("r")) && !(input.equals("s")) && !(input.equals("p"))) {
			switch(input){
				case "r", "s" , "p" -> MyChoice.close();
				default -> {
					System.out.println("正しいジャンケンの手を入力してください");
					this.input=MyChoice.nextLine();
				}
			}
		}
	}
	
	public void getRandom() {
		int enemyHand = (int) Math.floor(Math.random() * 3);
		
		String[] em = { "r" ,"s" , "p" };
		
		this.enemy = em[enemyHand];
	}
	public void playGame() {
		HashMap<String,String> Jyanken = new HashMap<String,String>();
		Jyanken.put("r", "グー");
		Jyanken.put("s", "チョキ");
		Jyanken.put("p", "パー");
		
		System.out.println("自分の手は" + Jyanken.get(input) + ",対戦相手の手は"+ Jyanken.get(enemy) );
		
		//あいこの場合に表示する
		
		if(input.equals(enemy)) {
			System.out.println("あいこです");
		}
		//自分が勝ちになる場合
		
		else if(input.equals("r") && enemy.equals("s")) {
			System.out.println("自分の勝ちです");
		}
		else if(input.equals("s") && enemy.equals("p")) {
			System.out.println("自分の勝ちです");
		}
		else if(input.equals("p") && enemy.equals("r")) {
			System.out.println("自分の勝ちです");
		}
		//相手が勝ちになる場合
		
		else if(input.equals("r") && enemy.equals("p")) {
			System.out.println("対戦相手の勝ちです");
		}
		else if(input.equals("s") && enemy.equals("r")) {
			System.out.println("対戦相手の勝ちです");
		}
		else if(input.equals("p") && enemy.equals("s")) {
			System.out.println("対戦相手の勝ちです");
		}
	}
}