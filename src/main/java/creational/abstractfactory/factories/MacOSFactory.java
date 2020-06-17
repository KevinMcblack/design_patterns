package creational.abstractfactory.factories;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.buttons.MacOSButton;
import creational.abstractfactory.checkboxes.Checkbox;
import creational.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Title: <br>
 * Description:具体工厂 (mac­OS)
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety. <br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}