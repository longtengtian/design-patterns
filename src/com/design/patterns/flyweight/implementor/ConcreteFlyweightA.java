package com.design.patterns.flyweight.implementor;

import com.design.patterns.flyweight.UnsharedConcreteFlyweight;
import com.design.patterns.flyweight.abstraction.Flyweight;

/**
 * Title: 具体享元角色A<br>
 * Description: ConcreteFlyweightA<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月16日 23:22
 *
 * @author jackie.scl
 */
public class ConcreteFlyweightA implements Flyweight {
    private String key;

    public ConcreteFlyweightA(String key) {
        this.key = key;
        System.out.println("具体享元" + key + ",被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight) {
        System.out.println("具体享元" + key + ",被调用！");
        System.out.println("执行非享元方法，结果是：" + unsharedConcreteFlyweight.getInfo());
    }
}
