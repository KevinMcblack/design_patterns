package creational.abstractfactory.factories;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.buttons.WindowsButton;
import creational.abstractfactory.checkboxes.Checkbox;
import creational.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Title: <br>
 * Description:具体工厂 （Windows）
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}