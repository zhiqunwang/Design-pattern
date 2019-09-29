package a_command;

/**
 * Created by zhiqun.wang on 2019/8/19 22:44
 */
public class Invoker {
    private ICommand iCommand;

    public void setICommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void action(){
        this.iCommand.execute();
    }


}
