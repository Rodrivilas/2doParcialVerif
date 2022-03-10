package pages;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class LeftProjectList {
    //CREATE
    public Button addProject= new Button(By.xpath("//button[@class=\"adder_icon\"]"));

    //UPDATE & DELETE last item
    public Label lastListItem=new Label(By.xpath("//div[@class=\"reactist collapse collapse--entered\"]//li[last()]"));
    public Button projectMenuButton=new Button(By.xpath("//div[@class=\"reactist collapse collapse--entered\"]//li[last()]//button"));

    public Label lastName=new Label(By.xpath("//li[last()]//div[@data-sidebar-list-item]//span[text()]"));

}
