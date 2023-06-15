
/*
	8. Вводится строка слов, разделенных пробелами.
	Найти самое длинное слово и вывести его на экран.
	Случай, когда самых длинных слов может быть несколько, не обрабатывать.
*/

package Task_2_8;
	
import java.util.Scanner;
	
public class Task_2_8 {
	
	public static void main(String[] args) {
	
	System.out.println("---------------------------------------------");
	System.out.println("ПРОГРАММА : ОПРЕДЕЛЕНИЕ САМОГО ДЛИННОГО СЛОВА");
	System.out.println("---------------------------------------------");
	
	Scanner scanner = new Scanner(System.in);
	
	// Ввод строки
	System.out.println("-----------------");
	System.out.println("Введение строки :");
	System.out.println("-------------------------");
	System.out.print("Введите данные......... :  ");
	
	String line = scanner.nextLine();
	
	Task_2_8_res Input = new Task_2_8_res();
	
	// Вывод на печать начальной строки
	System.out.println("-------------------------------------------------------------------------------");
	System.out.println("Вывод на печать начальной строки : " + line);
	System.out.println("-------------------------------------------------------------------------------");
	
	// ОПРЕДЕЛЕНИЕ САМОГО ДЛИННОГО СЛОВА И ВЫВОД ЕГО НА ПЕЧАТЬ
	int size = Input.long_word(line);
	
	// Вывод на печать длины самого длинного слова
	System.out.println("-------------------------------------------");
	System.out.println("Длина самого длинного слова в строке : " + size);
	System.out.println("-------------------------------------------");
	
	
	// ВЫВОД НА ПЕЧАТЬ САМЫХ ДЛИННЫХ СЛОВ
	Input.Print_word(line);
	
	scanner.close();
	
	}

}
