import java.util.*;

public class Rock_Paper_Scissors {
    
    public static void main(String []args) {
        
        Scanner keyboard = new Scanner(System.in); 
        Random choice = new Random();

        int rand;
        int selector;
        String play;
        char p;

        
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println(" *****  ROCK ** PAPER ** SCISSORS ***** ");
        System.out.println("****************************************");
        System.out.println("****************************************");
       do {
            System.out.println("Lets play, Select a choice");
            System.out.print("1. Rock\n2. Paper\n3. Scissors\n\nchoice: ");
            selector = keyboard.nextInt();
            rand = 1 + choice.nextInt(3);

            if(rand == 1){
                System.out.println("Cpmputer\tUser");
                System.out.println(rand + "\t\t" + selector);
                rock(selector, rand);
                
            }
            if(rand == 2){
                System.out.println("Cpmputer\tUser");
                System.out.println(rand + "\t\t" + selector);
                paper(selector, rand);
                
            }
            if(rand == 3){
                System.out.println("Cpmputer\tUser");
                System.out.println(rand + "\t\t" + selector);
                scissors(selector, rand);
                
            }

            System.out.print("\nPlay again(y/n): ");
            keyboard.nextLine();
            play = keyboard.nextLine();
            play = play.toUpperCase();
            p = play.charAt(0);


        } while (p == 'Y');
        if(p == 'N')
        System.out.println("Thanks for playing, come again next time");

        keyboard.close();
    }
    
    ///  METHOD CALL FOR ROCK GAME
    public static void rock(int selector, int rand) {
        if(rand == 1 && selector ==3){
            System.out.println("\n You loose, Rock smashes Scissors");
        }
        else if(rand == 1 && selector == 2){
            System.out.println("\n Hurray, You won!!, Paper wraps rock");
        }
        else 
        System.out.println("\n Tie game, Same options chosen");
    }

    ///  METHOD CALL FOR PAPER GAME
    public static void paper(int selector, int rand) {
        if(rand ==2 && selector ==1){
            System.out.println("\nYou loose, Paper wraps Rock");
        }
        else if(rand ==2 && selector == 3){
            System.out.println("\nHurray,you won!!, Scissors cuts paper");
        }
        else
        System.out.println("\nTie game, same Options chosen");
    }

    /// METHOD CALL FOR SCISSORS GAME
    public static void scissors(int selector, int rand) {
        if(rand ==3 && selector ==2){
            System.out.println("\nYou loose, Scissors cuts paper");
        }
        else if(rand == 3 && selector == 1){
            System.out.println("\nHurray,you won!!, Rock smashes scissors");
        }
        else
        System.out.println("\nTie game, same Options chosen");
    }
   

}