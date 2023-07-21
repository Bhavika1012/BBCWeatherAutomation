package couk.weather.bbc.pages;

import couk.weather.bbc.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeatherPage extends Utility {
    private static final Logger log = LogManager.getLogger(WeatherPage.class.getName());
    public WeatherPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "ls-c-search__input-label")
    WebElement searchInputFieldElement;

    public void enterCityNameInSearchField(String cityName){
        System.out.println(cityName);
        sendTextToElement(searchInputFieldElement, "cityName");
    }


}
