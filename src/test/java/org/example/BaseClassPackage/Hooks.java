package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();
            @Before
    public void setup(){driverFactory.openBrowser();
            }

            @After
            public void teardown(){driverFactory.closeBrowser();}
}
