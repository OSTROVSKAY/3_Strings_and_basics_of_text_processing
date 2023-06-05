	
// 2. Замените в строке все вхождения 'word' на 'letter'
	
package Task_1_2;
	
public class Task_1_2 {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("ПРОГРАММА : ПРЕОБРАЗОВАНИЕ МАССИВА НАЗВАНИЙ ПЕРЕМЕННЫХ ИЗ camelCase И CamelCase В snake_case");
		System.out.println("--------------------------------------------------------------------------------------------");
		
		// Начальная строка с "word"
		String word = "displaying word count in microsoft word";
		
		Task_1_2_res Input = new Task_1_2_res();
		
		// Конечная строка с "letter"
		String letter = Input.changeWords(word);
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Начальная строка с 'word'  :  " + word);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Конечная строка с 'letter' :  " + letter);
		System.out.println("--------------------------------------------------------------------------------------------");
	}
	
}
