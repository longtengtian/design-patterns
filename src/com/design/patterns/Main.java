package com.design.patterns;

import com.design.patterns.factorymethod.service.serviceImpl.ConcreteFactoryAServiceImpl;
import com.design.patterns.factorymethod.service.serviceImpl.ConcreteFactoryBServiceImpl;
import com.design.patterns.simplefactory.OperationFactory;
import com.design.patterns.simplefactory.service.OperationService;
import com.design.patterns.singleton.HungrySingleton;
import com.design.patterns.singleton.LazySingleton;
import com.design.patterns.singleton.Singleton;
import com.design.patterns.strategy.StrategyFactory;
import com.design.patterns.strategy.service.serviceImpl.ConcreteStrategyA;
import com.design.patterns.strategy.service.serviceImpl.ConcreteStrategyB;

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

    System.out.println("----------------- 使用简单工厂模式实现的一个简单计算器 start -----------------");
    simpleFactoryPatternsTest();
    System.out.println("----------------- 使用简单工厂模式实现的一个简单计算器 end -----------------\n");

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
    System.out.println("懒汉式单例测试 end");

    System.out.println("饿汉式单例测试 start");
    HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
    HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
    if (hungrySingleton1 == hungrySingleton2) {
      System.out.println("创建的是同一个对象！");
    } else {
      System.out.println("创建的不是同一个对象！");
    }
    System.out.println("饿汉式单例测试 end");

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
    System.out.println("具体工厂A测试 end");

    ConcreteFactoryBServiceImpl concreteFactoryBServiceImpl = new ConcreteFactoryBServiceImpl();
    System.out.println("具体工厂B测试 start");
    concreteFactoryBServiceImpl.newProduct().productInfo();
    System.out.println("具体工厂B测试 end");
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
