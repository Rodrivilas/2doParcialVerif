package pagesTodoly;

import control.Button;
import org.openqa.selenium.By;

public class LeftRecycleBinSection {
    public Button recycleButton=new Button(By.xpath("//td[@itemid=\"-3\"]"));
    public Button recycleOptionsButton=new Button(By.xpath("//div[@itemid=\"-3\"]//img"));
    public Button emptyRecycle=new Button(By.xpath("//a[@href=\"#emptyRecycle\"]"));
}
