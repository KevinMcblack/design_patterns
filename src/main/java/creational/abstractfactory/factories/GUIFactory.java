package creational.abstractfactory.factories;

import creational.abstractfactory.buttons.Button;
import creational.abstractfactory.checkboxes.Checkbox;

/**
 * Title: <br>
 * Description:抽象工厂
 * Abstract factory knows about all (abstract) product types.<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}