package testEjercicioRecuperatorio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserMenu;

public class LoginTest extends BaseTodoist {
    HomePage homePage= new HomePage();
    LoginPage loginPage= new LoginPage();
    UserMenu userMenu = new UserMenu();

    @Test
    public void verifyLoginTodoist()throws InterruptedException{
        homePage.loginButton.click();
        loginPage.email.setText("rodriviladegut@gmail.com");
        loginPage.password.setText("12345678");
        loginPage.loginSubmit.click();
        Assertions.assertTrue(userMenu.userImg.isControlDisplayed(),
                "ERROR no se pudo hacer el login");
        Thread.sleep(2000);
    }

}


