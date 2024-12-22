package kadai_026;

import java.util.HashMap; //コレクションのHashMapクラスを使用する。
import java.util.Scanner;

public class Jyanken_Chapter26 {

	/* メンバー */
	private HashMap<String,String> jankenMap; //HashMapを宣言
	
	/* メソッド */
	@SuppressWarnings({ "finally", "resource" })
	public String getMyChoice() {	//自分のじゃんけんの手を入力する
		boolean x = true;
		String input = null;
		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("");
		do {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			//入力した内容を取得する
			//input = scanner.next();
			input = scanner.nextLine();
			/*if(input == null || input.length() == 0) {
				System.out.println("じゃんけんの手が正しくありません。:" + input + "  再入力");
				input = null;
			}*/
			//正しいじゃんけんの手であるか判定する
			if(input == null || input.length() == 0) {
				System.out.println("じゃんけんの手が正しくありません。:" + input + "  再入力");
				//input = null;
			} else {
				input = input.substring(0, 1).toLowerCase();
				if( !input.equals("r") && !input.equals("s") && !input.equals("p") ) {
					System.out.println("じゃんけんの手が正しくありません。:" + input + "  再入力");
					//input = null;
				} else {
					x = false;
				}
			}
		}while(x);
		//Scannerクラスのオブジェクトをクローズする
		scanner.close();
		return input;
	}
	
	public String getRandom() {		//対戦相手のじゃんけんの手を乱数で選ぶ
		int randomInt = (int) Math.floor( Math.random() * 3);
		if(randomInt==0) return "r";
		else if(randomInt==1) return "s";
		else if(randomInt==2) return "p";
		return null;
	}
	
	public void playGame() {			//じゃんけんを行う
		this.jankenMap = new HashMap<String,String>(); //インスタンス化
		this.jankenMap.put("r", "グー");
		this.jankenMap.put("s", "チョキ");
		this.jankenMap.put("p", "パー");
		String you = getMyChoice();
		String oppo = getRandom();
		System.out.println("自分の手は" + this.jankenMap.get(you) +",対戦相手の手は" +  this.jankenMap.get(oppo));
		if(you.equals("r")) {
			if(oppo.equals("s"))System.out.println("自分の勝ちです");
			if(oppo.equals("p"))System.out.println("自分の負けです");
		}else if(you.equals("s")) {
			if(oppo.equals("r"))System.out.println("自分の負けです");
			if(oppo.equals("p"))System.out.println("自分の勝ちです");
		}else if(you.equals("p")) {
			if(oppo.equals("r"))System.out.println("自分の勝ちです");
			if(oppo.equals("s"))System.out.println("自分の負けです");
		}
		if( you.equals(oppo) ) {
			System.out.println("あいこです");
		}
	}
	
	
}
