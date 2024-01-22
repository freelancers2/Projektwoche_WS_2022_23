package solitar;

import java.util.Scanner;

public class Solitaire {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    GameBoard board = new GameBoard(5); // 5*5 board
    board.startGame();
    board.outputGameBoard();

    // Game loop
    int fromX = -1;
    int fromY = -1;
    int toX = -1;
    int toY = -1;

    boolean correctMove = false;

    do{
      System.out.println("Enter Y to play or N to stop the game:");
      String endGame = input.next();
      if(endGame.equalsIgnoreCase("N")){
        break;
      }
      System.out.println("Select your next move source and destination:");
      System.out.println("Enter source row  ( a number between 0 and 5");
      fromX = input.nextInt();
      System.out.println("Enter source column  ( a number between 0 and 5");
      fromY = input.nextInt();
      System.out.println("Enter destination row  ( a number between 0 and 5");
      toX = input.nextInt();
      System.out.println("Enter destination column  ( a number between 0 and 5");
      toY = input.nextInt();

      correctMove = board.move(fromX,fromY,toX,  toY );

      if(!correctMove){
        System.out.println("Invalid move , try again !!");
      }
      board.outputGameBoard();


    }while(true);

  }
}
