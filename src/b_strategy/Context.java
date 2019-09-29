package b_strategy;

/**
 * Created by zhiqun.wang on 2019/8/19 22:23
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void execute(){
        iStrategy.doSomething();
    }

}
