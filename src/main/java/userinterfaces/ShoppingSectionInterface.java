package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingSectionInterface extends PageObject {
    public static final Target WOMEN_SECTION_BUTTON = Target.the("Women shopping section").
            located(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
    public static final Target SELECT_IMG = Target.the("Select an article").
            located(By.xpath("(//a[contains(@href,'http://automationpractice.com/index.php?id_product=1&controller=product')])[6]"));
}
