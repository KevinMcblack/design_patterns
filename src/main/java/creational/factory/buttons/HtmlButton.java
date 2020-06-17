package creational.factory.buttons;

/**
 * Title: <br>
 * Description:具体产品
 * HTML button implementation.<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}