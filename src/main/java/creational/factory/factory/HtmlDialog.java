package creational.factory.factory;

import creational.factory.buttons.Button;
import creational.factory.buttons.HtmlButton;

/**
 * Title: <br>
 * Description: 具体创建者
 * HTML Dialog will produce HTML buttons.<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
