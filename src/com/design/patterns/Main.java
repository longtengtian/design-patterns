package com.design.patterns;

import com.design.patterns.adapter.service.TwoWayAdapteeService;
import com.design.patterns.adapter.service.TwoWayTargetService;
import com.design.patterns.adapter.service.serviceImpl.AdapteeRealizeServiceImpl;
import com.design.patterns.adapter.service.serviceImpl.TargetRealizeServiceImpl;
import com.design.patterns.adapter.service.serviceImpl.TwoWayAdapterServiceImpl;
import com.design.patterns.decorator.service.ComponentService;
import com.design.patterns.decorator.service.serviceImpl.ConcreteComponentServiceImpl;
import com.design.patterns.decorator.service.serviceImpl.ConcreteDecoratorAServiceImpl;
import com.design.patterns.decorator.service.serviceImpl.ConcreteDecoratorBServiceImpl;
import com.design.patterns.factorymethod.service.serviceImpl.ConcreteFactoryAServiceImpl;
import com.design.patterns.factorymethod.service.serviceImpl.ConcreteFactoryBServiceImpl;
import com.design.patterns.proxy.DynamicProxy;
import com.design.patterns.proxy.service.SubjectService;
import com.design.patterns.proxy.service.serviceImpl.ProxySubjectServiceImpl;
import com.design.patterns.proxy.service.serviceImpl.RealSubjectServiceImpl;
import com.design.patterns.simplefactory.OperationFactory;
import com.design.patterns.simplefactory.service.OperationService;
import com.design.patterns.singleton.HungrySingleton;
import com.design.patterns.singleton.LazySingleton;
import com.design.patterns.singleton.Singleton;
import com.design.patterns.strategy.StrategyFactory;
import com.design.patterns.strategy.service.serviceImpl.ConcreteStrategyA;
import com.design.patterns.strategy.service.serviceImpl.ConcreteStrategyB;
import com.design.patterns.templatemethod.HookAbstractClass;
import com.design.patterns.templatemethod.HookConcreteClass;

import java.lang.reflect.InvocationHandler;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    System.out.println("----------------- 单例模式实现样例 start -----------------");
    singletonPatternsTest();
    System.out.println("----------------- 单例模式实现样例 end -----------------\n");

    System.out.println("----------------- 工厂方法模式实现样例 start -----------------");
    factoryMethodPatternsTest();
    System.out.println("----------------- 工厂方法模式实现样例 end -----------------\n");

//    System.out.println("----------------- 使用简单工厂模式实现的一个简单计算器 start -----------------");
//    simpleFactoryPatternsTest();
//    System.out.println("----------------- 使用简单工厂模式实现的一个简单计算器 end -----------------\n");

    System.out.println("----------------- 代理模式实现样例 start -----------------");
    proxyPatternsTest();
    System.out.println("----------------- 代理模式实现样例 end -----------------\n");

    System.out.println("----------------- 适配器模式实现样例 start -----------------");
    adapterPatternsTest();
    System.out.println("----------------- 适配器模式实现样例 end -----------------\n");

    System.out.println("----------------- 装饰模式实现样例 start -----------------");
    decoratorPatternsTest();
    System.out.println("----------------- 装饰模式实现样例 end -----------------\n");

    System.out.println("----------------- 模板方法模式实现样例 start -----------------");
    templateMethodPatternsTest();
    System.out.println("----------------- 模板方法模式实现样例 end -----------------\n");

    System.out.println("----------------- 策略模式实现样例 start -----------------");
    strategyPatternsTest();
    System.out.println("----------------- 策略模式实现样例 end -----------------\n");
  }

  /**
   * Title: 单例模式测试<br>
   * Description: singletonPatternsTest<br>
   * CreateDate: 2019/6/29 11:56<br>
   *
   * @return void
   * @throws Exception
   * @category
   * @author jackie.scl
   */
  public static void singletonPatternsTest() {
    System.out.println("懒汉式单例测试 start");
    LazySingleton lazySingleton1 = LazySingleton.getInstance();
    LazySingleton lazySingleton2 = LazySingleton.getInstance();
    if (lazySingleton1 == lazySingleton2) {
      System.out.println("创建的是同一个对象！");
    } else {
      System.out.println("创建的不是同一个对象！");
    }
    System.out.println("懒汉式单例测试 end\n");

    System.out.println("饿汉式单例测试 start");
    HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
    HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
    if (hungrySingleton1 == hungrySingleton2) {
      System.out.println("创建的是同一个对象！");
    } else {
      System.out.println("创建的不是同一个对象！");
    }
    System.out.println("饿汉式单例测试 end\n");

    System.out.println("静态内部类生成单例测试 start");
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    if (singleton1 == singleton2) {
      System.out.println("创建的是同一个对象！");
    } else {
      System.out.println("创建的不是同一个对象！");
    }
    System.out.println("静态内部类生成单例测试 end");
  }

  /**
   * Title: 工厂方法模式测试<br>
   * Description: factoryMethodPatternsTest<br>
   * CreateDate: 2019/6/28 18:05<br>
   *
   * @category 工厂方法模式测试
   * @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void factoryMethodPatternsTest() {
    ConcreteFactoryAServiceImpl concreteFactoryAServiceImpl = new ConcreteFactoryAServiceImpl();
    System.out.println("具体工厂A测试 start");
    concreteFactoryAServiceImpl.newProduct().productInfo();
    System.out.println("具体工厂A测试 end\n");

    ConcreteFactoryBServiceImpl concreteFactoryBServiceImpl = new ConcreteFactoryBServiceImpl();
    System.out.println("具体工厂B测试 start");
    concreteFactoryBServiceImpl.newProduct().productInfo();
    System.out.println("具体工厂B测试 end");
  }

  /**
   * Title: 代理模式测试<br>
   * Description: proxyPatternsTest<br>
   * CreateDate: 2019/6/30 18:07<br>
   *
   * @return void
   * @throws Exception
   * @category
   * @author jackie.scl
   */
  public static void proxyPatternsTest() {
    SubjectService realSubjectService = new RealSubjectServiceImpl();
    InvocationHandler handler = new ProxySubjectServiceImpl(realSubjectService);

    ClassLoader classLoader = realSubjectService.getClass().getClassLoader();
    Class<?>[] interfaces = realSubjectService.getClass().getInterfaces();
    SubjectService proxySubectService = DynamicProxy.newProxyInstance(classLoader, interfaces,
        handler);
    // 通过代理访问真实对象方法
    proxySubectService.request();
  }

  /**
   * Title: 适配器模式测试<br>
   * Description: adapterPatternsTest<br>
   * CreateDate: 2019/7/1 19:35<br>
   *
   * @category 适配器模式测试
   * @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void adapterPatternsTest() {
    System.out.println("目标通过双向适配器访问适配者 start");
    TwoWayAdapteeService adapteeService = new AdapteeRealizeServiceImpl();
    TwoWayTargetService targetService = new TwoWayAdapterServiceImpl(adapteeService);
    targetService.request();
    System.out.println("目标通过双向适配器访问适配者 end\n");
    System.out.println("适配者通过双向适配器访问目标 start");
    targetService = new TargetRealizeServiceImpl();
    adapteeService = new TwoWayAdapterServiceImpl(targetService);
    adapteeService.specificRequest();
    System.out.println("适配者通过双向适配器访问目标 end");
  }

  /**
   * Title: 装饰模式测试<br>
   * Description: decoratorPatternsTest<br>
   * CreateDate: 2019/7/2 18:49<br>
   *
   * @category 装饰模式测试
   * @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void decoratorPatternsTest() {
    System.out.println("具体构件实现方法调用 start");
    ComponentService componentService = new ConcreteComponentServiceImpl();
    componentService.operation();
    System.out.println("具体构件实现方法调用 end\n");

    System.out.println("具体装饰A实现方法调用 start");
    ComponentService decoratorAService = new ConcreteDecoratorAServiceImpl(componentService);
    decoratorAService.operation();
    System.out.println("具体装饰A实现方法调用 end\n");

    System.out.println("具体装饰B实现方法调用 start");
    ComponentService decoratorBService = new ConcreteDecoratorBServiceImpl(componentService);
    decoratorBService.operation();
    System.out.println("具体装饰B实现方法调用 end");
  }

  /**
   * Title: 模板方法模式测试<br>
   * Description: templateMethodPatternsTest<br>
   * CreateDate: 2019/7/3 22:45<br>
   *
   * @return void
   * @throws Exception
   * @category
   * @author jackie.scl
   */
  public static void templateMethodPatternsTest() {
    HookAbstractClass hookAbstractClass = new HookConcreteClass();
    // 模板方法
    hookAbstractClass.templateMethod();
  }

  /**
   * Title: 策略模式测试<br>
   * Description: strategyPatternsTest<br>
   * CreateDate: 2019/6/26 19:15<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void strategyPatternsTest() {
    StrategyFactory strategyFactory = new StrategyFactory();
    // 初始化策略
    strategyFactory.put("concreteStrategyA", new ConcreteStrategyA());
    strategyFactory.put("concreteStrategyB", new ConcreteStrategyB());
    // 调用策略A实现
    strategyFactory.strategyMethod("concreteStrategyA");
    // 调用策略B实现
    strategyFactory.strategyMethod("concreteStrategyB");
    // 调用不存在策略
    // strategyFactory.strategyMethod("concreteStrategy");
  }

  /**
   * Title: 简单工厂模式测试<br>
   * Description: simpleFactoryPatternsTest<br>
   * CreateDate: 2019/6/17 18:43<br>
   *
   * @return void
   * @throws Exception
   * @category 简单工厂模式测试
   * @author jackie.scl
   */
  public static void simpleFactoryPatternsTest() {
    System.out.println("请输入第一个数字:");
    Scanner scanner = new Scanner(System.in);
    String num1 = scanner.nextLine();
    System.out.println("请输入运算符(+-*/):");
    String oper = scanner.nextLine();
    System.out.println("请输入第二个数字:");
    String num2 = scanner.nextLine();
    // 通过工厂获取运算类
    OperationService operationService = OperationFactory.getOperationService(oper);
    if (operationService != null) {
      if (isDouble(num1) && isDouble(num2)) {
        double result = operationService.getResult(Double.parseDouble(num1), Double.parseDouble(
            num2));
        System.out.println("结果是:" + result);
      } else {
        System.out.println("请输入正确的运算符!");
      }
    }
  }

  // 判断浮点数（double和float）
  private static boolean isDouble(String str) {
    if (null == str || "".equals(str)) {
      return false;
    }
    Pattern pattern = Pattern.compile("^[0-9]+(.[0-9]+)?$");// 数字,包括整数和浮点
    return pattern.matcher(str).matches();
  }
}
