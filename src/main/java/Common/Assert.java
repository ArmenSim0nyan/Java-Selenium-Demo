package Common;

import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class Assert {
    public void contain(String main, String part) {
        assertTrue(main.contains(part));
    }

    public void displayed(WebElement element) {
        assertTrue(element.isDisplayed());
    }
}
