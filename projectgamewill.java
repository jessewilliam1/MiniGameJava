/*Este game foi criado para aplicar o conhecimento e as habilidades adquiridas
  em estrutura de dados e logica de programação na linguagem de programação Java.*/

//O código foi feito e comentado em inglês para minha adaptação ao idioma 

// Commands to import the classes we're going to use


/*import to shorten long commands*/		   import java.io.PrintStream;
/*import to receive user data*/			     import java.util.Scanner;
/*import to invoke our random number*/	 import java.util.Random;


// Basic structure of a code in the Java programming language

public class projectgamewill {

	public static void main(String[] args) {
		
			//Imports invoked
		
		PrintStream show = System.out;
		Scanner scan = new Scanner(System.in);
		Random  generator = new Random ();
		
			//Declaration of variables
		
		int option ;
		int choose_computer;
		int choose_usuary;
		
			//Data,input and output
	
			//Here the user inserts the data requested for the machine
		
		show.println("Hello , Tell me your name, pls!!");
		String name; 
		name = scan.nextLine();
		show.println("Nice to meet you , your name is very beautiful ,"+ name +"!!");
		show.println(name + ", Do you want to play with me?");
		show.println("Tell me the number you chose!!\n1->sim \n2->Não");
		option = scan.nextInt();
		
			//Data structure 
		
			//Conditional Structure
		
		if(option==2) {
			show.println(" Too bad, you're for the next time!! :(");
			}else if (option==1) {
				show.println("Ok, this is the game :3");
				show.println(" I'm going to choose a number between 0 and 10 ");
				show.println("And I'm not going to show you");
				show.println("if you guess what it is");
				show.println("You win");
				}
		
		choose_computer= generator.nextInt(11);
		show.println("OK,"+name+". I chose!!");
		show.println("Now,try to guess!!");
		 
			// Do -> Repetitive Structure	
		
		do {
			choose_usuary = scan.nextInt();
			if(choose_usuary != choose_computer){
				show.println("Wrong answer");
			}else {
				show.println("Congratulations, this is the right number");
			}
		
			//While -> Repetitive Structure	
		
		}while(choose_computer != choose_usuary );
		
    //Closing scan import
		scan.close();
		
	}
	
}
	

	

