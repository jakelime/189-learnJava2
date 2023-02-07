import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Game {

    private String arena;
    private LocalDate date;

    public Game(String arena) {
        // set the arena
        // set the date equal to the current date
        this.arena = arena;
        this.date = LocalDate.now();
    }

    public void begin(Team home, Team away) {

        String formattedDate = this.date.format(DateTimeFormatter.ofPattern("yyy-MM-dd"));

        System.out.println(
                "\n - This matchup takes place at the " + this.arena + " arena on " + "<" + formattedDate + ">" + "." +
                        "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n" +
                        "\n - The starting lineup for the home team is: at point guard, " + home.getPlayer("POINT_GUARD")
                        + "; at shooting guard, " + home.getPlayer("SHOOTING_GUARD") + "; at small forward, "
                        + home.getPlayer("SMALL_FORWARD") + "; at power forward, " + home.getPlayer("POWER_FORWARD") + "; and at center, "
                        + home.getPlayer("CENTER") + ".\n" +
                        "\n - The starting lineup for the visiting team is: at point guard, " + "<AWAY_POINT_GUARD>"
                        + "; at shooting guard, " + "<AWAY_SHOOTING_GUARD>" + "; at small forward, "
                        + "<AWAY_SMALL_FORWARD>" + "; at power forward, " + "<AWAY_POWER_FORWARD>" + "; and at center, "
                        + "<AWAY_CENTER>" + ".\n" +
                        "\n - Let's give a warm round of applause for both teams as they take the court!");
    }

}
