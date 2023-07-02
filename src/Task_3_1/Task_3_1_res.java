	
package Task_3_1;
	
import java.util.Arrays;
	
import java.util.Comparator;
	
import java.util.Scanner;
	
import java.util.stream.Collectors;
	
public class Task_3_1_res {
	
	// Ввод данных
	public static int InputInt() {
		
		int check = 1;
		int x = 0;
		
		Scanner scanner = new Scanner(System.in);
				
			do {
				System.out.print("Введите Данные :.............: " + "  ");
				String xx = scanner.nextLine();
				
				check = 1;
				
				try {
					x = Integer.parseInt(xx);
					}
					catch (NumberFormatException e) {
							
							check = 0;
							System.out.println("------------------------------------------");
							System.out.println("Данные введены не правильно. Введите снова");
							System.out.println("------------------------------------------");
							}
							
						System.out.println("----------------------------------");
						
					} while ( check == 0 );
					
			return x;
		}
	
	
	// Повтор работы программы
	public static int repeat() {
		
		int check = 0;
		
		do {
			System.out.println("Введите : 1 - Да или 0 - Нет");
			System.out.println("----------------------------");
			
			check = InputInt();
			
			if ( check < 0 | check > 1 )
				{
				System.out.println("------------------------------------------------");
				System.out.println("Введеные данные не равны 0 или 1. Введите снова.");
				System.out.println("------------------------------------------------");
				}
				
		} while ( check < 0 | check > 1 );
		
		try {
			Thread.sleep(500);
			}
			catch(InterruptedException ex)
				{
				System.out.println("-------------------------");
				System.out.println("Ошибка в работе программы");
				System.out.println("-------------------------");
				}
				
		return check;
		
	}
	
	
	// Сортировка абзацев по количеству предложений
	public static void bySentenceCount(String text) {
		
		String[] paragraphs = splitByParagraph(text);
		
		Arrays.sort(paragraphs, (paragraph1, paragraph2) ->
			
			paragraph1.split("[!?.:]+").length >= paragraph2.split("[!?.:]+").length ? 1 : -1);
			
		print2(paragraphs);
	}
	
	
	// Сортировка слов по длине в каждом предложении
	public static void byWordLength(String text) {
		
		String[] paragraphs = splitByParagraph(text);
		
		for (int i = 0; i < paragraphs.length; i++) {
			
			String[] words = splitByWord(paragraphs[i]);
			
			Arrays.sort(words, Comparator.comparingInt(String::length));
			
			String result = String.join(" ", words);
			
			print1(result);
		}
	}
	
	
	/*
	Сортировка лексем в предложении по убыванию количества
	вхождений заданного символа, а в случае равенства сортировка по алфавиту
	*/
	public static void byLexemeCount(String text, char symbol) {
		
		String[] paragraphs = splitByParagraph(text);
		
		for (String paragraph : paragraphs) {
			
			String[] words = splitByWord(paragraph);
			
			String result = Arrays.stream(words)
					
					// Сравнение слов по количеству вхождений заданного символа
					.sorted(Comparator.comparingLong((String word) -> word.chars()
							.filter(ch -> ch == symbol)
							.count())
							
							// В случае, если число вхождений заданного символа одинаковое, происходит сортировка по алфавиту
							.thenComparing(String.CASE_INSENSITIVE_ORDER)).collect(Collectors.joining(" "));
							
			print1(result);
		}
	}
	
	
	// Разделение строки на абзацы с помощью Spliter
	/*
	Метод split в Java разделяет строку на подстроки,
	используя разделитель, который определяется с помощью
	регулярного выражения.
	*/
	
	public static String[] splitByParagraph(String text) {
		
		return text.split("\n");
	}
	
	
	// Разделение строки на слова с помощью Spliter
	/*
	Метод split в Java разделяет строку на подстроки,
	используя разделитель, который определяется с помощью
	регулярного выражения.
	*/
	
	public static String[] splitByWord(String text) {
		
		return text.split(" ");
	}
	
	
	// Печать результата ( печать строки ) : PrintResult
	public static void print1(String text) {
		
		System.out.println(text);
	}
	
	// Печать результата ( печать массива строк ) : PrintResult
	public static void print2(String[] paragraphs) {
		
		for (String paragraph : paragraphs) {
			
			System.out.println(paragraph);
		}
	}
	
	
}
