package com.design.patterns.bulider.product;

/**
 * Title: 产品<br>
 * Description: Product<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 23:33
 *
 * @author jackie.scl
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        //显示产品的特性
        System.out.println("显示产品的特性 start");
        System.out.println(partA);
        System.out.println(partC);
        System.out.println(partB);
        System.out.println("显示产品的特性 end");
    }
}