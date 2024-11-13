package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Jyanken_Chapter26 Jyanken = new Jyanken_Chapter26();
		
		System.out.println("自分のジャンケンの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Jyanken.getMyChoice();
		Jyanken.getRandom();
		Jyanken.playGame();
	}

}
