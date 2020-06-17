package creational.abstractfactory.buttons;

/**
 * Title: <br>
 * Description:
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is a MacOS variant of a button.<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
