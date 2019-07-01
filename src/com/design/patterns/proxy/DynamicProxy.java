package com.design.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Title: DynamicProxy<br>
 * Description: DynamicProxy<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月01日 13:38
 *
 * @author jackie.scl
 */
public class DynamicProxy {

  /**
   * public static Object newProxyInstance(ClassLoader loader, Class<?>[]
   * interfaces,InvocationHandler handler) loader：
   * 一个ClassLoader对象，定义了由哪个ClassLoader对象，来对生产的代理进行加载。 interfaces：
   * 一个Interfaces数组，表示我将要给我所代理的对象提供一组什么样的接口，
   * 如果提供一组接口给它，那么该代理对象就宣称实现了该接口，从而可以调用接口中的方法。 即，查找出真是主题类的所实现的所有的接口。 handler：
   * 一个InvocationHandler对象，表示当我这个动态代理对象在调用方法时，会关联到该InvocationHandler对象。
   * 该InvocationHandler与主题类有着关联。
   */
  public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces,
      InvocationHandler handler) {
    @SuppressWarnings("unchecked")
    T t = (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    return t;
  }
}
