package com.design.patterns.templatemethod;

/**
 * Title: 含钩子方法的抽象类<br>
 * Description: HookAbstractClass<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月03日 22:28
 *
 * @author jackie.scl
 */
public abstract class HookAbstractClass {
    /**
     * Title: 模板方法<br>
     * Description: TemplateMethod<br>
     * CreateDate: 2019/7/3 22:30<br>
     *
     * @return void
     * @throws Exception
     * @category
     * @author jackie.scl
     */
    public void templateMethod() {
        abstractMethodA();
        hookMethodA();
        if (hookMethodB()) {
            specificMethod();
        }
        abstractMethodB();
    }

    /**
     * Title: 具体方法<br>
     * Description: specificMethod<br>
     * CreateDate: 2019/7/3 22:31<br>
     *
     * @return void
     * @throws Exception
     * @category
     * @author jackie.scl
     */
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    /**
     * Title: 钩子方法A<br>
     * Description: hookMethodA<br>
     * CreateDate: 2019/7/3 22:32<br>
     *
     * @return void
     * @throws Exception
     * @category
     * @author jackie.scl
     */
    public void hookMethodA() {
        System.out.println("默认方法处理！");
    }

    /**
     * Title: 钩子方法B<br>
     * Description: hookMethodB<br>
     * CreateDate: 2019/7/3 22:34<br>
     *
     * @return boolean
     * @throws Exception
     * @category
     * @author jackie.scl
     */
    public boolean hookMethodB() {
        return true;
    }

    public abstract void abstractMethodA(); //抽象方法A

    public abstract void abstractMethodB(); //抽象方法B
}
