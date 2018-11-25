package dic;

import java.util.Scanner;

public class DictionaryTest {
	
	private static Scanner input = new Scanner(System.in);
	private static DictionaryManager dm = new DictionaryManager();

	public static void main(String[] args) {
		
		dm.init();
		
		while(true){
			displayMainMenu();
			System.out.print("硫붾돱?좏깮: ");
			int num = input.nextInt();
			switch(num){
				case 1: addWordMenu();
					break;
				case 2: searchWordMenu();
					break;
				case 3: deleteWordMenu();
					break; 
				case 4: dm.fileWrite();
					System.exit(0);
				default: System.out.println("硫붾돱?좏깮 ?ㅻ쪟!");
			}//switch
		}//while
	}
	
	public static void displayMainMenu(){
		System.out.println("[---Java Dictionary---]");
		System.out.println("1. ?ъ쟾?깅줉");
		System.out.println("2. ?⑥뼱寃??);
		System.out.println("3. ?⑥뼱??젣");
		System.out.println("4. 醫낅즺");
		System.out.println("-----------------------");
	}
	
	public static void addWordMenu(){
		input.nextLine();
		System.out.print("?⑥뼱?낅젰: ");
		String word = input.nextLine();
		System.out.print("?ㅻ챸湲 ?낅젰: ");
		String description = input.nextLine();
		dm.addWord(word, description);
	}
	
	public static void searchWordMenu(){
		input.nextLine();
		System.out.print("寃?됰떒?댁엯?? ");
		String word = input.nextLine();
		String description = dm.searchWord(word);
		System.out.println("-- 寃?됯껐怨?--");
		System.out.println(description);		
	}
	
	public static void deleteWordMenu(){
		input.nextLine();
		System.out.print("??젣?⑥뼱?낅젰: ");
		String word = input.nextLine();
		boolean result = dm.deleteWord(word);
		if(result) 
			System.out.println("??젣?섏뿀?듬땲??");
		else
			System.out.println("?깅줉?섏? ?딆? ?⑥뼱?낅땲??");
	}

}