package com.design.patterns.singleton;

/**
 * Title: 静态内部类单例(不仅能确保线程安全也能保证Singleton类的唯一性)<br>
 * Description: Singleton<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月29日 11:44
 *
 * @author jackie.scl
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }
}
