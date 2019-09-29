package b_strategy;

/**
 * Created by zhiqun.wang on 2019/8/19 22:21
 *
 * 具体策略角色
 */
public class ConCreateStrategy1 implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("策略1算法原则...");
    }
}
