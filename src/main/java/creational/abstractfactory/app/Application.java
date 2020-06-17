package creational.abstractfactory.app;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkboxes.Checkbox;
import creational.abstractfactory.factories.GUIFactory;

/**
 * Title: <br>
 * Description: 客户端代码
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
