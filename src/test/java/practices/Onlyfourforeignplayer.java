package practices;

import java.io.File;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;


@Test

public class Onlyfourforeignplayer {
	
	String playingElevenSheet;
    File teamSheet;

    @BeforeClass
    public void loadTeamSheet() {
        playingElevenSheet = System.getProperty("team");
        if(playingElevenSheet == null)
            playingElevenSheet="TeamRCB";
        teamSheet = new File("src/test/resources/testData/" + playingElevenSheet+".json");
    }

    @Test
    public void verifyWicketKeeperCount() {
        List<String> roles = JsonPath.from(teamSheet).getList("player.role");
        int wiketkeeperCount = 0;
        for (String role : roles) {
            if (role.equalsIgnoreCase("Wicket-keeper"))
                wiketkeeperCount++;
        }
        Assert.assertTrue(wiketkeeperCount > 0, "This team doesn't have any wicket-keeper");
    }

    @Test
    public void verifyForeignPlayersCount() {
        List<String> players = JsonPath.from(teamSheet).getList("player.country");
        int foreignerCount = 0;
        for (String player : players) {
            if (!player.equalsIgnoreCase("India"))
                foreignerCount++;
        }
        Assert.assertTrue(foreignerCount < 5, "This team has more than 4 foreign Players");
    }
}
