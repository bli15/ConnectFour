import java.util.*;

public class fourGame{
  Scanner input = new Scanner(System.in);
  public fourGame(){
  }
  int[][] g = new int[6][7];
  private String playerTurn = "Red";
  private String lastPlayer = "";
  
  public void createGame(){
    
    for (int row = 0; row < 6; row ++){
      for (int col = 0; col < 7; col ++){
        g[row][col] = 0;
      }
    }
    System.out.println("Connect Four to Win!");  
  }
  
  public void game(){
    if (playerTurn.equals("Red")){
      System.out.println("Red player choose where to go!");
      showBoard();
      int temp = input.nextInt();
      lastPlayer = "Red";
      playerTurn = "Black";
      dropPiece(temp, "Red", 0);
    }
    if (playerTurn.equals("Black")){
      System.out.println("Black player choose where to go!");
      showBoard();
      int temp = input.nextInt();
      lastPlayer = "Black";
      playerTurn = "Red";
      dropPiece(temp, "Black", 0);
    }
  }
  public boolean win(){
    int inARow = 0;
    for (int row = 0; row < 6; row++){  
      for (int col = 0; col < 7; col ++){
        if (g[row][col] == 1){
          inARow++;
        }
        if (g[row][col] == 0 || g[row][col] == 2){
          inARow = 0;
        }
        if (inARow == 4) return true;
      }
    }
    for (int row = 0; row < 6; row++){  
      for (int col = 0; col < 7; col ++){
         if (g[row][col] == 2){
          inARow++;
        }
        if (g[row][col] == 1 || g[row][col] == 0){
          inARow = 0;
        }
        if (inARow == 4) return true;
      }
      }
            return false;
  }
      
      public void dropPiece(int column, String player, int row){
        if (g[5-row][6-column] == 0){
          if (player.equals("Red")){
            g[5-row][6-column] = 1;
          }
          if (player.equals("Black")){
            g[5-row][6-column] = 2;
          }
        }
        else if (row > 4) {
          System.out.println("There's no more space!"); 
          playerTurn = lastPlayer;
        }
        else {
          dropPiece(column, player, row+1);  
        }
      }
      
      
      
      public void showBoard(){
        for(int i = 0; i < 6; i++)
        {
          for(int j = 0; j < 7; j++)
          {
            System.out.printf("|"+ g[i][j]+"| ");
          }
          System.out.println();
        }
      }
    }
    
