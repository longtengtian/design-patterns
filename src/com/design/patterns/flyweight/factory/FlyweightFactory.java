package com.design.patterns.flyweight.factory;

import com.design.patterns.flyweight.abstraction.Flyweight;
import com.design.patterns.flyweight.implementor.ConcreteFlyweightA;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: 享元工厂角色<br>
 * Description: FlyweightFactory<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月16日 23:29
 *
 * @author jackie.scl
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public FlyweightFactory() {
        flyweights.put("concreteFlyweightA", new ConcreteFlyweightA("concreteFlyweightA"));
        flyweights.put("concreteFlyweightB", new ConcreteFlyweightA("concreteFlyweightB"));
    }

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = (Flyweight) flyweights.get(key);
        if (null == flyweight) {
            System.out.println("具体享元" + key + "不存在，请尽快添加对应实例！");
            return flyweight;
        }
        System.out.println("具体享元" + key + "已经存在，被成功获取！");
        return flyweight;
    }
}
