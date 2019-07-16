package com.design.patterns.flyweight;

/**
 * Title: 非享元角色<br>
 * Description: UnsharedConcreteFlyweight<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月16日 23:18
 *
 * @author jackie.scl
 */
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
