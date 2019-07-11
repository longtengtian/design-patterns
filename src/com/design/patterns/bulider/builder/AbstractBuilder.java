package com.design.patterns.bulider.builder;

import com.design.patterns.bulider.product.Product;

/**
 * Title: 抽象建造者<br>
 * Description: AbstractBuilder<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 23:34
 *
 * @author jackie.scl
 */
public abstract class AbstractBuilder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    //返回产品对象
    public Product getResult() {
        return product;
    }
}
