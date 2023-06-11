	
// 4. В строке найти количество чисел
// Работа со строкой как с массивом символов
	
package Task_1_4;
	
import java.util.Scanner;
	
public class Task_1_4_2 {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("ПРОГРАММА : РАСЧЁТ КОЛИЧЕСТВА ЧИСЕЛ В СТРОКЕ ( СТРОКА ЯВЛЯЕТСЯ МАССИВОМ СИМВОЛОВ )");
		System.out.println("----------------------------------------------------------------------------------");
		
		Task_1_4_2_res Input = new Task_1_4_2_res();
		
		//Ввод размера массива символов
		System.out.println("---------------------------------");
		System.out.println("Введите размер массива символов :");
		System.out.println("---------------------------------");
		
		int size = Input.InputInt();
		
		// Массив символов
		char massiv[] = Input.Inp_mass(size);
		
		//char massiv[] = { '8','a', 'c', 'd', ' ','7','7', '8', 'b', 'c', '3', 'j', '5', '6'};
		
		// Вывод массива на печать
		System.out.println("-------------------------");
		System.out.println("Вывод массива на печать :");
		System.out.println("-------------------------");
		
		Input.Print_mass(massiv);
		
		// РАСЧЁТ КОЛИЧЕСТВА ЧИСЕЛ В СТРОКЕ И ВЫВОД ЧИСЕЛ НА ПЕЧАТЬ
		
		int counter = Input.countNumbers (massiv);
		
		System.out.println("----------------------------------------------");
		System.out.println("Количество чисел в строке-массиве символов : " + counter);
		System.out.println("----------------------------------------------");
	}
}