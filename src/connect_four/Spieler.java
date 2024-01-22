package connect_four;

public class Spieler {
   private  String playerName;
   private int number;

  public Spieler(String playerName, int number) {
    this.playerName = playerName;
    this.number = number;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
