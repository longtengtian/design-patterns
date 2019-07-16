package com.design.patterns.flyweight.abstraction;

import com.design.patterns.flyweight.UnsharedConcreteFlyweight;

/**
 * Title: 抽象享元角色<br>
 * Description: Flyweight<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月16日 23:20
 *
 * @author jackie.scl
 */
public interface Flyweight {
    public void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight);
}
