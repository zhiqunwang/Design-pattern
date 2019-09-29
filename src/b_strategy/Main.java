package b_strategy;

/**
 * Created by zhiqun.wang on 2019/8/19 22:16
 *
 * 策略模式：定义一组算法，将每个算法都封装起来，并且使他们之前可以互换。
 *
 */
public class Main {

    public static void main(String[] args) {
        //申明一个具体策略 将算法封装成具体对象
        IStrategy iStrategy = new  ConCreateStrategy1();

        Context context = new Context(iStrategy);

        context.execute();
    }


}
