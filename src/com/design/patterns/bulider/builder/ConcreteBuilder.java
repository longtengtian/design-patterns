package com.design.patterns.bulider.builder;

/**
 * Title: 具体建造者<br>
 * Description: ConcreteBuilder<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 23:36
 *
 * @author jackie.scl
 */
public class ConcreteBuilder extends AbstractBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
