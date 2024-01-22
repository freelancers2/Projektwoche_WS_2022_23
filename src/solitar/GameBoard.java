package solitar;

public class GameBoard {
 // Attribute
  private boolean[][] board;
  private int size;

  // Constructor

  public GameBoard(int size) {
    this.size = size;
    this.board = new boolean[size][size];
  }

  public void startGame(){
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        this.board[i][j] = true; // Peg present
      }
    }

    this.board[size/2][size/2] = false; // Empty space

  }

public void outputGameBoard(){
  for (int i = 0; i < size; i++) {
    for (int j = 0; j < size; j++) {
      System.out.print(board[i][j] ? '#':' ');
    }
    System.out.println();
  }

}


public boolean move(int fromX, int fromY, int toX, int toY){
   // Check fromX, fromY , toX, toY is inside the board
   if(
       toX >= size || toY >= size || toX < 0 || toY < 0
       ||
       fromX >= size || fromY >= size || fromX < 0 || fromY < 0
   ) {
     return false;
   }
  // Check  toX, toY is empty space 'false' and  fromX, fromY is peg '#'
  if(board[fromX][fromY] && !board[toX][toY]){
    // Check if the move is exactly two elements (horizontally or vertically ):
    if((fromX == toX && Math.abs(fromY -toY ) == 2) ||(fromY == toY && Math.abs(fromX -toX ) == 2) ){
      // Check if jumped over element is a peg
      int jumpedX = (fromX + toX) / 2 ;
      int jumpedY = (fromY + toY) / 2;
      if(board[jumpedX][jumpedY]){
        // Perform a move
        board[fromX][fromY] = false;
        board[jumpedX][jumpedY] = false;
        board[toX][toY] = true;
        return true;
      }
    }



  }
return  false;

}
}
