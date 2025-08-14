
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(AllureJunit5.class)
public class simpleTest {

    @Test
    @Description("Test login functionality")
    public void loginTest(){
        OpenLoginPage();
        enterUsername("user");
        enterPassword("pass");
        clickLogin();
        assertTrue(true,"Login successful");
    }

    @Step("Open login page")
    public void OpenLoginPage(){
        System.out.println("Opening login page...");
    }

    @Step("Enter username: {username}")
    public void enterUsername(String username) {
        System.out.println("Entering username: " + username);
    }

    @Step("Enter password: {password}")
    public void enterPassword(String password) {
        System.out.println("Entering password: " + password);
    }

    @Step("Click login button")
    public void clickLogin() {
        System.out.println("Clicking login...");
    }
}
