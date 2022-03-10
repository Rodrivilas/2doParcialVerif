package pagesTodoist;

import control.Button;
import org.openqa.selenium.By;

public class ProjectMenu {
    //UPDATE
    public Button updateButton=new Button(By.xpath("//div[text()=\"Editar proyecto\"]"));
    //DELETE
    public Button deleteButton=new Button(By.xpath("//div[text()=\"Eliminar proyecto\"]"));
    public Button confirmDelete=new Button(By.xpath("//button[text()=\"Eliminar\"]"));
}
