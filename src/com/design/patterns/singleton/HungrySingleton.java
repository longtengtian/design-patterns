package com.design.patterns.singleton;

/**
 * Title: HungrySingleton<br>
 * Description: HungrySingleton<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月29日 11:40
 *
 * @author jackie.scl
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
