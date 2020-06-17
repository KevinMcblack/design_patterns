package creational.factory.factory;

import creational.factory.buttons.Button;
import creational.factory.buttons.WindowsButton;

/**
 * Title: <br>
 * Description: 另一个具体创建者
 * Windows Dialog will produce Windows buttons.<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}