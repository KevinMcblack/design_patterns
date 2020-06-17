package creational.abstractfactory.buttons;

/**
 * Title: <br>
 * Description:第一个产品层次结构
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.<p>
 * This is the common interface for buttons family.<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public interface Button {
    void paint();
}