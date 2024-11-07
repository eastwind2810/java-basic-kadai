package kadai_021;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary_Chapter21 {
	HashMap<String,String> dic = new HashMap<String,String>();
	
	{
		dic.put("apple", "りんご");
        dic.put("peach", "桃");
        dic.put("banana", "バナナ");
        dic.put("lemon", "レモン");
        dic.put("pear", "梨");
        dic.put("kiwi", "キウィ");
        dic.put("strawberry", "いちご");
        dic.put("grape", "ぶどう");
        dic.put("muscat", "マスカット");
        dic.put("cherry", "さくらんぼ");
	}
	
	
	public void Dictionary() {
		Scanner scanner = new Scanner(System.in);
		while(true){
			String English = scanner.nextLine();
			switch(English) {
				case "apple" -> System.out.println( English +"の意味は"+ dic.get(English));
				case "peach" -> System.out.println( English +"の意味は"+ dic.get(English));
				case "banana" -> System.out.println( English +"の意味は"+ dic.get(English));
				case "lemon" -> System.out.println( English +"の意味は"+ dic.get(English));
				case "pear" -> System.out.println( English +"の意味は"+ dic.get(English));
				case "kiwi" -> System.out.println( English +"の意味は"+ dic.get(English));
				case "strawberry" -> System.out.println( English +"の意味は"+ dic.get(English));
				case "grape" -> System.out.println( English +"の意味は"+ dic.get(English));
				case "muscat" -> System.out.println( English +"の意味は"+ dic.get(English));
				case "charry" -> System.out.println( English +"の意味は"+ dic.get(English));
				default -> System.out.println(English +"は辞書に存在しません");
			}
			 if (!dic.containsKey(English)) {
	                break;
			}
		}
		scanner.close();
	}
}	