	
/*
	4. С помощью функции копирования и операции конкатенации
	составить из частей слова “информатика” слово “торт”
*/
	
package Task_2_4;
	
public class Task_2_4 {
	
	public static void main(String[] args) {
	
	System.out.println("-----------------------------------------------------");
	System.out.println("ПРОГРАММА : СОСТАВЛЕНИЕ СЛОВА ИЗ ЧАСТЕЙ ДРУГОГО СЛОВА");
	System.out.println("-----------------------------------------------------");
	
	String word1 = "информатика";
	
	System.out.println("-----------------------------------------------------");
	System.out.println("НАЧАЛЬНОЕ СЛОВО : " + word1);
	System.out.println("-----------------------------------------------------");
	
	// СОСТАВЛЕНИЕ СЛОВА ИЗ ЧАСТЕЙ ДРУГОГО СЛОВА
	
	String word2 = Task_2_4_res.build_word(word1);
	
	System.out.println("-----------------------------------------------------");
	System.out.println("СЛОВО, СОСТАВЛЕННОЕ ИЗ ЧАСТЕЙ ДРУГОГО СЛОВА : " + word2);
	System.out.println("-----------------------------------------------------");
	
	}
	
}
