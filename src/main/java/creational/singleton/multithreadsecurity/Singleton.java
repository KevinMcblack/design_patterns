package creational.singleton.multithreadsecurity;

/**
 * Title: <br>
 * Description: 采用延迟加载的线程安全单例
 * 为了解决这个问题， 你必须在创建首个单例对象时对线程进行同步。<br>
 * Company: wondersgroup.com <br>
 *
 * @author 王李懋
 * @version 1.0
 */
public final class Singleton {
    /**
     * 双重检查加锁（double-checked locking) DCL
     * Description:The field must be declared volatile so that double check lock would work correctly.
     * 原因：
     * 实例化对象，实际上可以分解成以下三个步骤：
     * 1.分配内存空间
     * 2.初始化对象
     * 3.将对象指向刚分配的内存空间
     * 但是有些编译器为了性能的原因，可能会将第二步和第三步进行重排序，顺序就成了：
     * 1.分配内存空间
     * 2.将对象指向刚分配的内存空间
     * 3.初始化对象
     *
     * 使用了volatile关键字后，重排序被禁止，所有的写（write）操作都将发生在读（read）操作之前。
     */
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
