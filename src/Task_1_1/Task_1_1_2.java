	
// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
// Работа со строкой как с массивом символов
	
package Task_1_1;
	
public class Task_1_1_2 {
	
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("ПРОГРАММА : ПРЕОБРАЗОВАНИЕ МАССИВА НАЗВАНИЙ ПЕРЕМЕННЫХ ИЗ camelCase И CamelCase В snake_case");
		System.out.println("--------------------------------------------------------------------------------------------");
		
		// Начальный массив названий переменных в camelCase и CamelCase
		char[][] begin = new char[][] {
			
			{ 'H', 'u', 'm', 'p', 'B', 'a', 'c', 'k', 'N', 'o', 't', 'a', 't', 'i', 'o', 'n' },
			{ 'g', 'e', 't', 'C', 'h', 'a', 'r', 's' },
			{ 'B', 'a', 'c', 'k', 'C', 'o', 'l', 'o', 'r' },
			{ 'c', 'h', 'a', 'r', 'A', 't' },
			{ 'C', 'a', 'm', 'e', 'l', 'C', 'a', 's', 'e' },
			{ 'e', 'q', 'u', 'a', 'l', 's', 'I', 'g', 'n', 'o', 'r', 'e', 'C', 'a', 's', 'e' },
			{ 'C', 'a', 'm', 'e', 'l', 'H', 'u', 'm', 'p', 'e', 'd', 'W', 'o', 'r', 'd' },
			{ 't', 'o', 'L', 'o', 'w', 'e', 'r', 'C', 'a', 's', 'e' },
			{ 'M', 'i', 'x', 'e', 'd', 'C', 'a', 's', 'e' },
			{ 't', 'o', 'U', 'p', 'p', 'e', 'r', 'C', 'a', 's', 'e' },
			{ 'W', 'o', 'r', 'd', 's', 'S', 't', 'r', 'u', 'n', 'g', 'T', 'o', 'g', 'e', 't', 'h', 'e', 'r' },
			{ 'm', 'i', 'x', 'e', 'd', 'C', 'a', 's', 'e' },
			{ 'W', 'o', 'r', 'd', 's', 'R', 'u', 'n', 'T', 'o', 'g', 'e', 't', 'h', 'e', 'r' },
			{ 't', 'o', 'C', 'h', 'a', 'r', 'A', 'r', 'r', 'a', 'y' },
			{ 'W', 'o', 'r', 'd', 'C', 'a', 's', 'e' },
			{ 'b', 'a', 'c', 'k', 'C', 'o', 'l', 'o', 'r' }
		};
		
		Task_1_1_2_res Input = new Task_1_1_2_res();
		
		//ПРЕОБРАЗОВАНИЕ МАССИВА НАЗВАНИЙ ПЕРЕМЕННЫХ ИЗ camelCase И CamelCase В snake_case
		char[][] result = Input.array_convers(begin);
		
		// ПЕЧАТЬ ИТОГОВОГО МАССИВА
		Input.Print(begin, result);
		
	}
}