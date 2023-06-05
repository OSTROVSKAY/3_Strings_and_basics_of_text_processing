	
package Task_1_1;
	
public class Task_1_1_res {
	
/*
	CamelCase (с англ. — «ВерблюжийРегистр», также «ГорбатыйРегистр», «СтильВерблюда») —
	стиль написания составных слов, при котором несколько слов пишутся слитно без пробелов,
	при этом каждое слово внутри фразы пишется с прописной буквы. Стиль получил название CamelCase,
	поскольку прописные буквы внутри слова напоминают горбы верблюда (англ. Camel).
*/
/*
	Snake case (или snake_case, рус. змеиный_регистр) — стиль написания составных слов,
	при котором несколько слов разделяются символом подчеркивания (_), и не имеют пробелов в записи,
	причём каждое слово обычно пишется с маленькой буквы — «foo_bar», «hello_world» и т. д.
	Такой стиль написания используется для именования переменных и функций в исходном коде,
	и иногда для именования файлов на компьютере.
*/
	
	//ПРЕОБРАЗОВАНИЕ МАССИВА НАЗВАНИЙ ПЕРЕМЕННЫХ ИЗ CAMELCASE В SNAKECASE
	public String [] toSnakeCase (String [] camelCase) {
		
		String [] snakeCase = new String[camelCase.length];
		
		for (int i = 0; i < snakeCase.length; i++) {
			
			StringBuilder strBuilder = new StringBuilder();
			
			for (int j = 0; j < camelCase[i].length(); j++) {
				
				char letter = camelCase[i].toCharArray()[j];
				
				if (Character.isLowerCase(letter)) {
					
					strBuilder.append(letter);
					
				} else {
					
					strBuilder.append("_");
					
					strBuilder.append(Character.toLowerCase(letter));
					
				}
			}
			snakeCase[i] = strBuilder.toString();
		}
		return snakeCase;
	}
}
