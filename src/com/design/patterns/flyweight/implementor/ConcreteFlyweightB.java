package com.design.patterns.flyweight.implementor;

import com.design.patterns.flyweight.UnsharedConcreteFlyweight;
import com.design.patterns.flyweight.abstraction.Flyweight;

/**
 * Title: 具体享元角色B<br>
 * Description: ConcreteFlyweightB<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月16日 23:28
 *
 * @author jackie.scl
 */
public class ConcreteFlyweightB implements Flyweight {
    private String key;

    public ConcreteFlyweightB(String key) {
        this.key = key;
        System.out.println("具体享元" + key + ",被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight) {
        System.out.println("具体享元" + key + ",被调用！");
        System.out.println("执行非享元方法，结果是：" + unsharedConcreteFlyweight.getInfo());
    }
}
