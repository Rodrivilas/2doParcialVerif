package testLogoutEJERCICIO6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoist.HomePage;
import pagesTodoist.LoginPage;
import pagesTodoist.UserMenu;


public class LogOutTest extends BaseTodoist {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    UserMenu userMenu = new UserMenu();
    String email = "rodriviladegut@gmail.com";
    String password = "12345678";

    @Test
    public void verifyLoginTodoLy() throws InterruptedException {
        homePage.loginButton.click();
        loginPage.email.setText(email);
        loginPage.password.setText(password);
        loginPage.loginSubmit.click();
        Thread.sleep(2000);
        Assertions.assertTrue(userMenu.userImg.isControlDisplayed(), "ERROR, no se pudo hacer el login");

        userMenu.userImg.click();
        Thread.sleep(2000);
        userMenu.logoutButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(homePage.loginButton.isControlDisplayed(), "ERROR, no se pudo hacer el logout");
    }
}
