package adressbook;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ContactCreation {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception{
        driver = new ChromeDriver();
        driver.get("http://localhost:81/addressbook/index.php");
        login("admin", "Password1");
    }

    private void login(String username, String pass) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    @Test
    public void testMethodOne() {
        initContactCreation();
        fillContactForm(new ContactData("test3", "test4", "test5", "test4"));
        submitContactCreation();
        returnToHomePage();
    }

    private void returnToHomePage() {
        driver.findElement(By.linkText("home")).click();
    }

    private void submitContactCreation() {
        driver.findElement(By.name("submit")).click();
    }

    private void fillContactForm(ContactData contactData) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(contactData.getEmail());
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(contactData.getHome());
    }

    private void initContactCreation() {
        driver.findElement(By.linkText("add new")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
