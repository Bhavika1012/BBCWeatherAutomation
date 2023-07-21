package couk.weather.bbc.cucumber;

import com.cucumber.listener.Reporter;
import couk.weather.bbc.propertyreader.PropertyReader;
import couk.weather.bbc.utility.Utility;
import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

//Hook responsible for opening and closing browser
public class Hooks extends Utility {
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After //Close browser after the scenario
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
       // closeBrowser();


    }
}

