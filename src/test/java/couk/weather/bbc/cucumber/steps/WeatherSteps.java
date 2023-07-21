package couk.weather.bbc.cucumber.steps;

import couk.weather.bbc.pages.WeatherPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class WeatherSteps {
    @Given("^I am on the BBC website page$")
    public void iAmOnTheBBCWebsitePage() {

    }

    @When("^I enter city name in \"([^\"]*)\" in search bar$")
    public void iEnterCityNameInInSearchBar(String cityName) {
        new WeatherPage().enterCityNameInSearchField(cityName);
    }


}
