package a_command;

/**
 * Created by zhiqun.wang on 2019/8/19 22:40
 */
public class ConCreateCommand1 extends ICommand {

    public ConCreateCommand1() {
        super(new ConCreateReceiver1());
    }

    @Override
    public void execute() {
        super.receiver.doSomething();;
    }
}
