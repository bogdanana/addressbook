package adressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {
    private ChromeDriver driver;

    public NavigationHelper(ChromeDriver driver) {
        this.driver = driver;
    }

    public void goToGroups() {
      driver.findElement(By.linkText("groups")).click();
    }

    public void returnToHomePage() {
        driver.findElement(By.linkText("home")).click();
    }
}
