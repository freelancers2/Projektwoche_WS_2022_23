package connect_four;

public class Spielfeld {
private int[][] board;
private int rows = 6;
private int columns = 7;

  public Spielfeld(int rows, int columns) {
    this.rows = rows;
    this.columns = columns;
    board = new int[rows][columns];
  }

  public Spielfeld() {
    board = new int[rows][columns];
  }

  public void initializeGameBoard() {
      // all items in the board are 0 by default
  }

  public  void printBoard() {
    for (int[] row:  board) {

      for (int item: row) {
        System.out.print(item);
      }
      System.out.println();
    }
  }
public boolean addGameStone(int col, int playerNumber){
    // place the game stone in the board
    // check if the selected column is valid or full
   // place the play'sNumber in the lowest empty cell in the column
  // return true if the move is successful, false otherwise
  // check a valid column number
  return  false;

}
public boolean checkWin(int playerNumber){
    // check the four vertically
  // check the four horizontally
  // check the four diagonally ...
  // return true if any occurred
  // else false
  return  false;

}

public boolean isFullColumn(int col){
    // your code is here
    return false;
}

  public boolean isFullBoard(){
    // your code is here
    return false;
  }

  public int[][] getBoard() {
    return board;

  }

  public void setBoard(int[][] board) {
    this.board = board;
  }
}
