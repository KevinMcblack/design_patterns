package creational.abstractfactory;

import creational.abstractfactory.app.Application;
import creational.abstractfactory.factories.GUIFactory;
import creational.abstractfactory.factories.MacOSFactory;
import creational.abstractfactory.factories.WindowsFactory;

/**
 * Title: <br>
 * Description: 程序配置
 * Demo class. Everything comes together here.<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}