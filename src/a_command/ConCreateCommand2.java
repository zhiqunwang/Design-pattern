package a_command;

/**
 * Created by zhiqun.wang on 2019/8/19 22:43
 */
public class ConCreateCommand2 extends ICommand {

    public ConCreateCommand2() {
        super(new ConCreateReceiver2());
    }

    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
