package Logic;

public class VideoGame {
    int code;
    int num_players;
    String title;
    String console;
    String category;

    public VideoGame() {
    }

    public VideoGame(int code, String title, String console, int num_players, String category) {
        this.code = code;
        this.title = title;
        this.console = console;
        this.num_players = num_players;
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNum_players() {
        return num_players;
    }

    public void setNum_players(int num_players) {
        this.num_players = num_players;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "code=" + code +
                ", num_players=" + num_players +
                ", title='" + title + '\'' +
                ", console='" + console + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
