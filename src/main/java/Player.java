public class Player {
    public String playerName;
    public int level;

    // Constructor with name only (sets level to 1)
    public Player(String name) {
        this.playerName = name;
        this.level = 1;
    }

    // Constructor with name and level
    public Player(String name, int level) {
        this.playerName = name;
        this.level = level;
    }
}