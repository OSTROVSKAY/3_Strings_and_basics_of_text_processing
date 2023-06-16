	
package Task_3_1;
	
import java.util.Arrays;
	
import java.util.Comparator;
	
import java.util.stream.Collectors;
	
public class Task_3_1_res {
	
	// Сортировка абзацев по количеству предложений
	public void bySentenceCount(String text) {
		
		String[] paragraphs = splitByParagraph(text);
		
		Arrays.sort(paragraphs, (paragraph1, paragraph2) ->
		
			paragraph1.split("[!?.:]+").length >= paragraph2.split("[!?.:]+").length ? 1 : -1);
		
		print2(paragraphs);
	}
	
	
	// Сортировка слов по длине в каждом предложении
	public void byWordLength(String text) {
		
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
	public void byLexemeCount(String text, char symbol) {
		
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
	public String[] splitByParagraph(String text) {
		
		return text.split("\n");
	}
	
	
	// Разделение строки на слова с помощью Spliter
	/*
	Метод split в Java разделяет строку на подстроки,
	используя разделитель, который определяется с помощью
	регулярного выражения.
	*/
	public String[] splitByWord(String text) {
		
		return text.split(" ");
	}
	
	
	// Печать результата ( печать строки ) : PrintResult
	public void print1(String text) {
		
		System.out.println(text);
	}
	
	// Печать результата ( печать массива строк ) : PrintResult
	public void print2(String[] paragraphs) {
		
		for (String paragraph : paragraphs) {
			
			System.out.println(paragraph);
		}
	}
	
}
