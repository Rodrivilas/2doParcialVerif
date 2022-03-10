package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class ProjectModal {
    //CREATE
    public TextBox projectName=new TextBox(By.id("edit_project_modal_field_name"));
    //UPDATE
    public TextBox updateName=new TextBox(By.xpath("//input[@id=\"edit_project_modal_field_name\"]"));

    public Button submitProject=new Button(By.xpath("//button[@type=\"submit\"]"));
}
