	
// 2. Замените в строке все вхождения 'word' на 'letter'
	
package Task_1_2;
	
public class Task_1_2 {
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("ПРОГРАММА : ЗАМЕНА В СТРОКЕ ВСЕХ ВХОЖДЕНИЙ 'word' НА 'letter'");
		System.out.println("-------------------------------------------------------------");
		
		// Начальная строка с "word"
		String word = "word : displaying word count in microsoft word";
		
		// Конечная строка с "letter"
		String letter = Task_1_2_res.changeWords(word);
		
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("НАЧАЛЬНАЯ СТРОКА С 'word'  :  " + word);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("КОНЕЧНАЯ СТРОКА С 'letter' :  " + letter);
		System.out.println("------------------------------------------------------------------------------------");
	}
	
}
