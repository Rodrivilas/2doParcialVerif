package testRecycleBin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoly.LeftRecycleBinSection;
import pagesTodoly.LoginModal;
import pagesTodoly.MainPage;
import pagesTodoly.RecyclePopUp;

public class RecycleBinTest extends BaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftRecycleBinSection leftRecycleBinSection= new LeftRecycleBinSection();
    RecyclePopUp recyclePopUp=new RecyclePopUp();

    @Test
    public void verifyRecycleBinTodoLy(){
        mainPage.loginImage.click();
        loginModal.email.setText("rodriviladegut@gmail.com");
        loginModal.password.setText("12345");
        loginModal.loginButton.click();

        leftRecycleBinSection.recycleButton.click();
        leftRecycleBinSection.recycleOptionsButton.click();
        leftRecycleBinSection.emptyRecycle.click();

        Assertions.assertTrue(recyclePopUp.recyclePopUp.isControlDisplayed());

    }

}


