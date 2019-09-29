package a_command;

/**
 * Created by zhiqun.wang on 2019/8/19 17:54
 */
public abstract class ICommand {
    protected final Receiver receiver;

    public ICommand(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void execute();

}
