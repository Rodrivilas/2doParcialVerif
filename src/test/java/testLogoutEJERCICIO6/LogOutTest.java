package testLogoutEJERCICIO6;


import org.junit.jupiter.api.Test;
import pagesTodoist.HomePage;
import pagesTodoist.LoginPage;

public class LogOutTest extends BaseTodoist {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    String email = "rodriviladegut@gmail.com";
    String password = "12345678";

    @Test
    public void verifyLoginTodoLy() throws InterruptedException {
        homePage.loginButton.click();
        loginPage.email.setText(email);
        loginPage.password.setText(password);
        loginPage.loginSubmit.click();


        Thread.sleep(2000);

    }
}
