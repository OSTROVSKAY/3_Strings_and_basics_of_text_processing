	
// 3. В строке найти количество цифр
// Работа со строкой как с массивом символов
	
package Task_1_3;
	
import java.io.IOException;
	
public class Task_1_3_2 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("-------------------------------------------");
		System.out.println("ПРОГРАММА : РАСЧЁТ КОЛИЧЕСТВА ЦИФР В СТРОКЕ");
		System.out.println("-------------------------------------------");
		
		int check = 0;
		
		do {
			
			//Ввод размера массива символов
			System.out.println("----------------------------------");
			System.out.println("Введите размер массива символов : ");
			System.out.println("----------------------------------");
			
			int size = Task_1_3_2_res.InputInt();
			
			// Массив символов
			char massiv[] = Task_1_3_2_res.Inp_mass(size);
			
			// Вывод массива на печать
			System.out.println("--------------------------");
			System.out.println("Вывод массива на печать : ");
			System.out.println("--------------------------");
			
			Task_1_3_2_res.Print_mass(massiv);
			
			// РАСЧЁТ КОЛИЧЕСТВА ЦИФР В СТРОКЕ
			int count = Task_1_3_2_res.num_dig(massiv);
			
			System.out.println("Количество цифр в строке : " + count);
			System.out.println("-------------------------------");
			
			System.out.println("-----------------------------------------------");
			System.out.println("ПРОДОЛЖИТЬ РАБОТУ ПРОГРАММЫ ?   1 - ДА. 0 - НЕТ");
			System.out.println("-----------------------------------------------");
			
			check = Task_1_3_2_res.repeat();
			
		} while ( check == 1 );
		
		System.out.println("-------------------------------");
		
	}
	
}
