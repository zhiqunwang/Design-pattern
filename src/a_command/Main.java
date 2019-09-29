package a_command;

/**
 * Created by zhiqun.wang on 2019/8/19 22:47
 * 命令模式
 *
 */
public class Main {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setICommand(new ConCreateCommand1());
        invoker.action();
    }
}
