package com.design.patterns.bulider.director;

import com.design.patterns.bulider.builder.AbstractBuilder;
import com.design.patterns.bulider.product.Product;

/**
 * Title: 指挥者<br>
 * Description: Director<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 23:38
 *
 * @author jackie.scl
 */
public class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
