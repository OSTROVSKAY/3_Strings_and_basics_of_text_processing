
/*
	5. Удалить в строке все лишние пробелы,
	то есть серии подряд идущих пробелов заменить на одиночные пробелы.
	Крайние пробелы в строке удалить.
*/
// Работа со строкой как с массивом символов
	
package Task_1_5;
	
public class Task_1_5_2 {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("ПРОГРАММА : УДАЛЕНИЕ В СТРОКЕ ВСЕХ ЛИШНИХ ПРОБЕЛОВ ( СТРОКА ЯВЛЯЕТСЯ МАССИВОМ СИМВОЛОВ )");
		System.out.println("----------------------------------------------------------------------------------------");
		
		//Ввод размера массива символов
		System.out.println("---------------------------------");
		System.out.println("Введите размер массива символов :");
		System.out.println("---------------------------------");
		
		int size = Task_1_5_2_res.InputInt();
		
		// Массив символов
		char massiv[] = Task_1_5_2_res.Inp_mass(size);
		
		//char massiv[] = { '-','-', '-', 'd', '-', '-','t','t','-','o','o','o','-','-','-','-','7', '-', '-', 'c', '-', 'j','-', 'j','-', '-'};
		
		// Расчёт длины нового массива символов
		int size1 = Task_1_5_2_res.Array_length(massiv);
		
		// Вывод массива на печать
		if (size1 > 0)
			{
			System.out.println("-------------------------");
			System.out.println("Вывод массива на печать :");
			System.out.println("-------------------------");
			
			Task_1_5_2_res.Print_mass(massiv);
			}
		
		// Объявление итогового массива символов
		
		if( size1 > 0 )
			{
			char[] massiv_end = new char[size1];
			
			// УДАЛЕНИЕ В МАССИВЕ СИМВОЛОВ ВСЕХ ЛИШНИХ ПРОБЕЛОВ
			massiv_end = Task_1_5_2_res.removing_spaces( massiv, size1);
			
			System.out.println("------------------------------------------------------------------------------------------");
			
			System.out.print("Массив символов после удаления всех лишних пробелов : ");
			System.out.print(massiv_end);
			
			System.out.println("");
			System.out.println("------------------------------------------------------------------------------------------");
		}
		
		else
			{
			System.out.println("--------------------------------------------------");
			System.out.println("Начальный массив символов содержит только пробелы");
			System.out.println("--------------------------------------------------");
			}
	}
	
}
