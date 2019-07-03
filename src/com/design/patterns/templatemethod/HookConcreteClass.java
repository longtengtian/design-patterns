package com.design.patterns.templatemethod;

/**
 * Title: 含钩子方法的具体子类<br>
 * Description: HookConcreteClass<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月03日 22:38
 *
 * @author jackie.scl
 */
public class HookConcreteClass extends HookAbstractClass {

    @Override
    public void abstractMethodA() {
        System.out.println("抽象方法A实现重写调用！");
    }

    @Override
    public void abstractMethodB() {
        System.out.println("抽象方法B实现重写调用！");
    }

    @Override
    public boolean hookMethodB() {
        return false;
    }

}
