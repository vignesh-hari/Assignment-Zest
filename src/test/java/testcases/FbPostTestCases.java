package testcases;
import actions.FbPostActions;
import org.testng.annotations.Test;
import utils.WebTestBase;

public class FbPostTestCases extends WebTestBase {

    @Test
    public void postAStatusMesage() {
        new FbPostActions(driver).postStatusMessage();
    }

}
