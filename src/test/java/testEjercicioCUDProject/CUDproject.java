package testEjercicioCUDProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pagesTodoist.*;

public class CUDproject extends BaseTodoist {
    HomePage homePage= new HomePage();
    LoginPage loginPage= new LoginPage();
    LeftProjectList leftProjectList=new LeftProjectList();
    ProjectModal projectModal=new ProjectModal();
    ProjectMenu projectMenu=new ProjectMenu();

    @Test
    public void verifyCUDProject() throws InterruptedException {
        homePage.loginButton.click();
        loginPage.email.setText("rodriviladegut@gmail.com");
        loginPage.password.setText("12345678");
        loginPage.loginSubmit.click();
        //CREATE
        String nombre="RodriV";
        leftProjectList.addProject.click();
        projectModal.projectName.setText(nombre);
        projectModal.submitProject.click();
        Assertions.assertTrue(leftProjectList.lastListItem.isControlDisplayed(),"Error, no se creo el proyecto");
        Thread.sleep(2000);
        //UPDATE
        nombre="RodriVUpdate";
        leftProjectList.lastListItem.click();
        leftProjectList.projectMenuButton.click();
        projectMenu.updateButton.click();
        projectModal.updateName.clearSetText(nombre);
        projectModal.submitProject.click();
        Assertions.assertEquals(nombre,leftProjectList.lastName.getTextControl(),"xd");
        Thread.sleep(2000);
        //DELETE
        leftProjectList.lastListItem.click();
        leftProjectList.projectMenuButton.click();
        projectMenu.deleteButton.click();
        projectMenu.confirmDelete.click();
        Assertions.assertFalse(nombre.equals(leftProjectList.lastName.getTextControl()));
        Thread.sleep(2000);
    }
}
