package Logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        List<VideoGame> videoGames = new ArrayList<>();

        VideoGame game1 = new VideoGame(1, "Final Fantasy", "Xbox", 2, "Adventure");
        VideoGame game2 = new VideoGame(1, "God of War", "Playstation", 2, "Adventure");
        VideoGame game3 = new VideoGame(1, "Age of Empires 2", "PC", 1, "Strategy");
        VideoGame game4 = new VideoGame(1, "Resident Evil 4", "PC", 2, "Horror");
        VideoGame game5 = new VideoGame(1, "Smash Brothers", "Nintendo 64", 2, "Horror");

        videoGames.add(game1);
        videoGames.add(game2);
        videoGames.add(game3);
        videoGames.add(game4);
        videoGames.add(game5);

        for (VideoGame videoGame: videoGames){
            System.out.println(videoGame.toString());
        }

        System.out.println("----BEFORE CHANGE NAMES------");

        game1.setTitle("Final Fantasy IV");
        game1.setNum_players(1);

        game2.setTitle("Worms");
        game2.setNum_players(4);

        for (VideoGame videoGame: videoGames){
            System.out.println(videoGame.toString());
        }

        System.out.println("-------NINTENDO 64---------");

        for (VideoGame videoGame: videoGames){
            if(Objects.equals(videoGame.console, "Nintendo 64")){
            System.out.println(videoGame.toString());
            }
        }
    }
}
