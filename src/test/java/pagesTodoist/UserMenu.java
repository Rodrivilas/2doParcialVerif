package pagesTodoist;

import control.Button;
import control.Image;
import org.openqa.selenium.By;

public class UserMenu {
    public Image userImg=new Image(By.xpath("//img[@class=\"user_avatar big settings_avatar\"]"));
    public Button logoutButton = new Button(By.xpath("//button[position() = 2]//span[@class=\"user_menu_label\"]"));
}
