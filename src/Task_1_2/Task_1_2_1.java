	
// 2. Замените в строке все вхождения 'word' на 'letter'
// Работа со строкой как с массивом символов
	
package Task_1_2;
	
public class Task_1_2_1 {
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("ПРОГРАММА : ЗАМЕНА В СТРОКЕ ВСЕХ ВХОЖДЕНИЙ 'word' НА 'letter'");
		System.out.println("-------------------------------------------------------------");
		
		char [] word = new char[]
				{
				'w', 'o', 'r', 'd'
				};
				
		char [] letter = new char[]
				{
				'l', 'e', 't', 't', 'e', 'r'
				};
				
		int diff = letter.length - word.length;
		
		
		// Начальный массив символов с "word"
		char[] begin = new char[]
				{
				'w', 'o', 'r', 'd', ' ', ':', ' ',
				'd', 'i', 's', 'p', 'l', 'a', 'y', 'i', 'n', 'g', ' ',
				'w', 'o', 'r', 'd', ' ', 'c', 'o', 'u', 'n', 't', ' ',
				'i', 'n', ' ', 'm', 'i', 'c', 'r', 'o', 's', 'o', 'f', 't', ' ',
				'w', 'o', 'r', 'd'
				};
				
		// ЗАМЕНА В СТРОКЕ ВСЕХ ВХОЖДЕНИЙ 'word' НА 'letter'
		Task_1_2_1_res.array_convers(begin, diff);
		
	}
	
}
