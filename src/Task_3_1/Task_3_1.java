
/*
	Cоздать приложение, разбирающее текст (текст хранится в строке)
	и позволяющее выполнять с текстом три различных операции:
	отсортировать абзацы по количеству предложений; в каждом предложении
	отсортировать слова по длине; отсортировать лексемы в предложении по
	убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту
*/

package Task_3_1;
	
import java.util.Scanner;
	
public class Task_3_1 {
	
	public static void main(String[] args) {
	
	System.out.println("----------------------------------------------------");
	System.out.println("ПРОГРАММА : ПРИЛОЖЕНИЕ ДЛЯ ПРОВЕДЕНИЯ АНАЛИЗА ТЕКСТА");
	System.out.println("----------------------------------------------------");
	
	Scanner scanner = new Scanner(System.in);
	
	String text = "Amy normally hated Monday mornings, but this year was different. Kamal was in her art class and she liked Kamal. She was waiting outside the classroom when her friend Tara arrived.\n" +
				"“Hi Amy! Your mum sent me a text. You forgot your inhaler. Why don’t you turn your phone on?” Amy didn’t like technology. She never sent text messages and she hated Facebook too.\n" +
				"“Did Kamal ask you to the disco?” Tara was Amy’s best friend, and she wanted to know everything that was happening in Amy’s life. “I don’t think he likes me,” said Amy. “And I never see him alone. He’s always with Grant.” Amy and Tara didn’t like Grant.\n" +
				"“Do you know about their art project?” asked Amy. “It’s about graffiti, I think,” said Tara. “They’re working on it at the old house behind the factory.” “But that building is dangerous,” said Amy. “Aah, are you worried he’s going to get hurt?\" Tara teased. “Shut up, Tara! Hey look, here they come!”\n" +
				"Kamal and Grant arrived. “Hi Kamal!” said Tara. “Are you going to the Halloween disco tomorrow?” “Yes. Hi Amy,” Kamal said, smiling. “Do you want to come and see our paintings after school?” “I’m coming too!” Tara insisted.";
				
	int option;
	
	int check = 0;
	
	do {
		
		do {
			
			System.out.println("--------------------");
			System.out.println("Действия с текстом :");
			System.out.println("--------------------");
			
			System.out.println("1 - Сортировка абзацев по количеству предложений :");
			System.out.println("--------------------------------------------------");
			
			System.out.println("2 - Cортировка слов по длине в каждом предложении :");
			System.out.println("---------------------------------------------------");
			
			System.out.println("3 - Cортировка лексем в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту :");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			
			System.out.print("Введите номер действия с текстом : ");
			
			while (!scanner.hasNextInt()) {
				
				System.out.println("Данные введены не правильно. Введите снова : ");
				System.out.println("---------------------------------------------");
				
				System.out.print("Введите номер действия с текстом : ");
				
				scanner.next();
			}
			
			option = scanner.nextInt();
			
		} while (option < 1 || option > 3);
		
		switch (option) {
			
			case 1:
				
				System.out.println("--------------------------------------------------");
				System.out.println("1 - Сортировка абзацев по количеству предложений :");
				System.out.println("--------------------------------------------------");
				
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				Task_3_1_res.bySentenceCount(text);
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
				break;
				
			case 2:
				
				System.out.println("---------------------------------------------------");
				System.out.println("2 - Cортировка слов по длине в каждом предложении :");
				System.out.println("---------------------------------------------------");
				
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				Task_3_1_res.byWordLength(text);
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
				break;
				
			case 3:
				
				char symbol;
				
				System.out.println("--------------------------------------------------------");
				System.out.print("Введите символ, по которому будет проводится сортировка : ");
				
				while (!scanner.hasNext()) {
					
					scanner.next();
				}
				
				symbol = scanner.next().charAt(0);
				
				System.out.println("----------------------------------------------------------------------------------------------------------------------------");
				System.out.println("3 - Cортировка лексем в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту :");
				System.out.println("----------------------------------------------------------------------------------------------------------------------------");
				
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				Task_3_1_res.byLexemeCount(text, symbol);
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
				break;
			}
				
				System.out.println("-----------------------------------------------");
				System.out.println("ПРОДОЛЖИТЬ РАБОТУ ПРОГРАММЫ ?   1 - ДА. 0 - НЕТ");
				System.out.println("-----------------------------------------------");
				
				check = Task_3_1_res.repeat();
				
				
		} while ( check == 1 );
		
		scanner.close();
		
	}
	
}
