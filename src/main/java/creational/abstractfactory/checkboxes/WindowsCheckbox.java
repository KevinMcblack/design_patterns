package creational.abstractfactory.checkboxes;

/**
 * Title: <br>
 * Description:
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is another variant of a checkbox.<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}