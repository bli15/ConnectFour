import java.util.Scanner;
public class fourDriver{
  
  public static void main (String[] args){
    
    Scanner input = new Scanner(System.in);
    
    fourGame game = new fourGame();
    while (true){  
    String reply;
    System.out.println("Would you like to create a new game? (Yes or No)");
    reply = input.next();
    if (reply.equals("yes") || reply.equals("Yes")){
      game.createGame();
      break;
    }
    
    if (reply.equals("no") || reply.equals("No")){
      System.out.println("Okay, just say when you want to play");
    }
    }
    while (game.win() == false)
    game.game();
  }
}