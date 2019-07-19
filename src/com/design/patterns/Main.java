package com.design.patterns;

import java.lang.reflect.InvocationHandler;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.design.patterns.abstractfactory.factory.abstraction.AbstractFactory;
import com.design.patterns.abstractfactory.factory.implementor.ConcreteFactoryOne;
import com.design.patterns.abstractfactory.factory.implementor.ConcreteFactoryTwo;
import com.design.patterns.adapter.adaptee.abstraction.AbstractTwoWayAdaptee;
import com.design.patterns.adapter.adaptee.implementor.AdapteeRealize;
import com.design.patterns.adapter.adapter.TwoWayAdapter;
import com.design.patterns.adapter.target.abstraction.AbstractTwoWayTarget;
import com.design.patterns.adapter.target.implementor.TargetRealize;
import com.design.patterns.bridge.abstraction.Bag;
import com.design.patterns.bridge.abstraction.HandBag;
import com.design.patterns.bridge.abstraction.Wallet;
import com.design.patterns.bridge.implementor.Blue;
import com.design.patterns.bridge.implementor.Color;
import com.design.patterns.bridge.implementor.Yellow;
import com.design.patterns.bulider.builder.AbstractBuilder;
import com.design.patterns.bulider.builder.ConcreteBuilder;
import com.design.patterns.bulider.director.Director;
import com.design.patterns.bulider.product.Product;
import com.design.patterns.command.abstraction.AbstractCommand;
import com.design.patterns.command.implementor.ConcreteCommandA;
import com.design.patterns.command.implementor.ConcreteCommandB;
import com.design.patterns.command.invoker.Invoker;
import com.design.patterns.composite.component.AbstractComponent;
import com.design.patterns.composite.component.BranchComponent;
import com.design.patterns.composite.component.LeftComponent;
import com.design.patterns.decorator.service.ComponentService;
import com.design.patterns.decorator.service.serviceImpl.ConcreteComponentServiceImpl;
import com.design.patterns.decorator.service.serviceImpl.ConcreteDecoratorAServiceImpl;
import com.design.patterns.decorator.service.serviceImpl.ConcreteDecoratorBServiceImpl;
import com.design.patterns.facade.facade.Facade;
import com.design.patterns.factorymethod.factory.implementor.ConcreteFactoryA;
import com.design.patterns.factorymethod.factory.implementor.ConcreteFactoryB;
import com.design.patterns.flyweight.UnsharedConcreteFlyweight;
import com.design.patterns.flyweight.abstraction.Flyweight;
import com.design.patterns.flyweight.factory.FlyweightFactory;
import com.design.patterns.interpreter.InterpreterContext;
import com.design.patterns.iterator.aggregate.abstraction.AbstractAggregate;
import com.design.patterns.iterator.aggregate.implementor.ConcreteAggregate;
import com.design.patterns.iterator.iterator.abstraction.AbstractIterator;
import com.design.patterns.mediator.colleague.abstraction.AbstractColleague;
import com.design.patterns.mediator.colleague.implementor.ConcreteColleagueA;
import com.design.patterns.mediator.colleague.implementor.ConcreteColleagueB;
import com.design.patterns.mediator.mediator.abstraction.AbstractMediator;
import com.design.patterns.mediator.mediator.implementor.ConcreteMediator;
import com.design.patterns.memento.Caretaker;
import com.design.patterns.memento.Memento;
import com.design.patterns.memento.Originator;
import com.design.patterns.observer.service.Observer;
import com.design.patterns.observer.service.Subject;
import com.design.patterns.observer.service.serviceImpl.ConcreteObserverA;
import com.design.patterns.observer.service.serviceImpl.ConcreteObserverB;
import com.design.patterns.observer.service.serviceImpl.ConcreteSubject;
import com.design.patterns.prototype.ProtoTypeCitation;
import com.design.patterns.proxy.DynamicProxy;
import com.design.patterns.proxy.subject.abstraction.AbstractSubject;
import com.design.patterns.proxy.subject.implementor.ProxySubject;
import com.design.patterns.proxy.subject.implementor.RealSubject;
import com.design.patterns.responsibilitychain.abstraction.AbstractHandler;
import com.design.patterns.responsibilitychain.implementor.ConcreteHandlerA;
import com.design.patterns.responsibilitychain.implementor.ConcreteHandlerB;
import com.design.patterns.simplefactory.OperationFactory;
import com.design.patterns.simplefactory.service.OperationService;
import com.design.patterns.singleton.HungrySingleton;
import com.design.patterns.singleton.LazySingleton;
import com.design.patterns.singleton.Singleton;
import com.design.patterns.state.Context;
import com.design.patterns.strategy.StrategyFactory;
import com.design.patterns.strategy.service.serviceImpl.ConcreteStrategyA;
import com.design.patterns.strategy.service.serviceImpl.ConcreteStrategyB;
import com.design.patterns.templatemethod.HookAbstractClass;
import com.design.patterns.templatemethod.HookConcreteClass;
import com.design.patterns.visitor.ObjectStructure;
import com.design.patterns.visitor.element.abstraction.AbstractElement;
import com.design.patterns.visitor.element.implementor.ConcreteElementA;
import com.design.patterns.visitor.element.implementor.ConcreteElementB;
import com.design.patterns.visitor.visitor.abstraction.AbstractVisitor;
import com.design.patterns.visitor.visitor.implementor.ConcreteVisitorA;
import com.design.patterns.visitor.visitor.implementor.ConcreteVisitorB;

public class Main {

  public static void main(String[] args) {
    System.out.println("----------------- 单例模式实现样例 start -----------------");
    singletonPatternsTest();
    System.out.println("----------------- 单例模式实现样例 end -----------------\n");

    System.out.println("----------------- 原型模式实现样例 start -----------------");
    protoTypePatternsTest();
    System.out.println("----------------- 原型模式实现样例 end -----------------\n");

    System.out.println("----------------- 工厂方法模式实现样例 start -----------------");
    factoryMethodPatternsTest();
    System.out.println("----------------- 工厂方法模式实现样例 end -----------------\n");

    System.out.println("----------------- 抽象工厂模式实现样例 start -----------------");
    abstractFactoryPatternsTest();
    System.out.println("----------------- 抽象工厂模式实现样例 end -----------------\n");

    System.out.println("----------------- 建造者模式实现样例 start -----------------");
    builderPatternsTest();
    System.out.println("----------------- 建造者模式实现样例 end -----------------\n");

    // System.out.println("----------------- 使用简单工厂模式实现的一个简单计算器 start
    // -----------------");
    // simpleFactoryPatternsTest();
    // System.out.println("----------------- 使用简单工厂模式实现的一个简单计算器 end
    // -----------------\n");

    System.out.println("----------------- 代理模式实现样例 start -----------------");
    proxyPatternsTest();
    System.out.println("----------------- 代理模式实现样例 end -----------------\n");

    System.out.println("----------------- 适配器模式实现样例 start -----------------");
    adapterPatternsTest();
    System.out.println("----------------- 适配器模式实现样例 end -----------------\n");

    System.out.println("----------------- 桥接模式实现样例 start -----------------");
    bridgePatternsTest();
    System.out.println("----------------- 桥接模式实现样例 end -----------------\n");

    System.out.println("----------------- 装饰模式实现样例 start -----------------");
    decoratorPatternsTest();
    System.out.println("----------------- 装饰模式实现样例 end -----------------\n");

    System.out.println("----------------- 外观模式实现样例 start -----------------");
    facadePatternsTest();
    System.out.println("----------------- 外观模式实现样例 end -----------------\n");

    System.out.println("----------------- 享元模式实现样例 start -----------------");
    flyweightPatternsTest();
    System.out.println("----------------- 享元模式实现样例 end -----------------\n");

    System.out.println("----------------- 组合模式实现样例 start -----------------");
    compositePatternsTest();
    System.out.println("----------------- 组合模式实现样例 end -----------------\n");

    System.out.println("----------------- 模板方法模式实现样例 start -----------------");
    templateMethodPatternsTest();
    System.out.println("----------------- 模板方法模式实现样例 end -----------------\n");

    System.out.println("----------------- 策略模式实现样例 start -----------------");
    strategyPatternsTest();
    System.out.println("----------------- 策略模式实现样例 end -----------------\n");

    System.out.println("----------------- 命令模式实现样例 start -----------------");
    commandPatternsTest();
    System.out.println("----------------- 命令模式实现样例 end -----------------\n");

    System.out.println("----------------- 责任链模式实现样例 start -----------------");
    responsibilityChainPatternsTest();
    System.out.println("----------------- 责任链模式实现样例 end -----------------\n");

    System.out.println("----------------- 状态模式实现样例 start -----------------");
    statePatternsTest();
    System.out.println("----------------- 状态模式实现样例 end -----------------\n");

    System.out.println("----------------- 观察者模式实现样例 start -----------------");
    observerPatternsTest();
    System.out.println("----------------- 观察者模式实现样例 end -----------------\n");

    System.out.println("----------------- 中介者模式实现样例 start -----------------");
    mediatorPatternsTest();
    System.out.println("----------------- 中介者模式实现样例 end -----------------\n");

    System.out.println("----------------- 迭代器模式实现样例 start -----------------");
    iteratorPatternsTest();
    System.out.println("----------------- 迭代器模式实现样例 end -----------------\n");

    System.out.println("----------------- 访问者模式实现样例 start -----------------");
    visitorPatternsTest();
    System.out.println("----------------- 访问者模式实现样例 end -----------------\n");

    System.out.println("----------------- 备忘录模式实现样例 start -----------------");
    mementoPatternsTest();
    System.out.println("----------------- 备忘录模式实现样例 end -----------------\n");

    System.out.println("----------------- 解释器模式实现样例 start -----------------");
    interpreterPatternsTest();
    System.out.println("----------------- 解释器模式实现样例 end -----------------\n");

  }

  /**
   * Title: 单例模式测试<br>
   * Description: singletonPatternsTest<br>
   * CreateDate: 2019/6/29 11:56<br>
   *
   * @return void
   * @throws Exception
   * @category @author jackie.scl
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
   * Title: 原型模式测试<br>
   * Description: protoTypePatternsTest<br>
   * CreateDate: 2019/7/11 18:44<br>
   *
   * @return void
   * @throws Exception
   * @category @author jackie.scl
   */
  public static void protoTypePatternsTest() {
    ProtoTypeCitation mingCitation = new ProtoTypeCitation("小明",
        "在2019学年第一学期中表现突出，被评为三好学生", "启明学院");
    mingCitation.display();
    try {
      ProtoTypeCitation redCitation = (ProtoTypeCitation) mingCitation.clone();
      redCitation.setName("小红");
      redCitation.setInfo("在2019学年第一学期在班级管理中表现突出,被评为优秀班干部");
      redCitation.setCollege("红学书院");
      redCitation.display();
    } catch (CloneNotSupportedException e) {
      System.out.println("复制失败");
    }

  }

  /**
   * Title: 工厂方法模式测试<br>
   * Description: factoryMethodPatternsTest<br>
   * CreateDate: 2019/6/28 18:05<br>
   *
   * @return void
   * @throws Exception
   * @category 工厂方法模式测试
   * @author jackie.scl
   */
  public static void factoryMethodPatternsTest() {
    ConcreteFactoryA concreteFactoryA = new ConcreteFactoryA();
    System.out.println("具体工厂A测试 start");
    concreteFactoryA.newProduct().productInfo();
    System.out.println("具体工厂A测试 end\n");

    ConcreteFactoryB concreteFactoryB = new ConcreteFactoryB();
    System.out.println("具体工厂B测试 start");
    concreteFactoryB.newProduct().productInfo();
    System.out.println("具体工厂B测试 end");
  }

  /**
   * Title: 抽象工厂模式测试<br>
   * Description: abstractFactoryPatternsTest<br>
   * CreateDate: 2019/7/11 19:10<br>
   *
   * @return void
   * @throws Exception
   * @category @author jackie.scl
   */
  public static void abstractFactoryPatternsTest() {
    System.out.println("具体工厂A产品 start");
    AbstractFactory concreteFactoryA = new ConcreteFactoryOne();
    concreteFactoryA.newProductA().show();
    concreteFactoryA.newProductB().test();
    System.out.println("具体工厂A产品 end\n");

    System.out.println("具体工厂B产品 start");
    AbstractFactory concreteFactoryB = new ConcreteFactoryTwo();
    concreteFactoryB.newProductA().show();
    concreteFactoryB.newProductB().test();
    System.out.println("具体工厂B产品 end");
  }

  /**
   * Title: 建造者模式测试<br>
   * Description: builderPatternsTest<br>
   * CreateDate: 2019/7/11 23:42<br>
   *
   * @return void
   * @throws Exception
   * @category @author jakcie.scl
   */
  public static void builderPatternsTest() {
    AbstractBuilder builder = new ConcreteBuilder();
    Director director = new Director(builder);
    Product product = director.construct();
    product.show();
  }

  /**
   * Title: 代理模式测试<br>
   * Description: proxyPatternsTest<br>
   * CreateDate: 2019/6/30 18:07<br>
   *
   * @return void
   * @throws Exception
   * @category @author jackie.scl
   */
  public static void proxyPatternsTest() {
    AbstractSubject realSubjectService = new RealSubject();
    InvocationHandler handler = new ProxySubject(realSubjectService);

    ClassLoader classLoader = realSubjectService.getClass().getClassLoader();
    Class<?>[] interfaces = realSubjectService.getClass().getInterfaces();
    AbstractSubject proxySubectService = DynamicProxy.newProxyInstance(classLoader, interfaces,
        handler);
    // 通过代理访问真实对象方法
    proxySubectService.request();
  }

  /**
   * Title: 适配器模式测试<br>
   * Description: adapterPatternsTest<br>
   * CreateDate: 2019/7/1 19:35<br>
   *
   * @return void
   * @throws Exception
   * @category 适配器模式测试
   * @author jackie.scl
   */
  public static void adapterPatternsTest() {
    System.out.println("目标通过双向适配器访问适配者 start");
    AbstractTwoWayAdaptee adaptee = new AdapteeRealize();
    AbstractTwoWayTarget target = new TwoWayAdapter(adaptee);
    target.request();
    System.out.println("目标通过双向适配器访问适配者 end\n");

    System.out.println("适配者通过双向适配器访问目标 start");
    target = new TargetRealize();
    adaptee = new TwoWayAdapter(target);
    adaptee.specificRequest();
    System.out.println("适配者通过双向适配器访问目标 end");
  }

  /**
   * Title: 桥接模式测试<br>
   * Description: bridgePatternsTest<br>
   * CreateDate: 2019/7/15 16:16<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void bridgePatternsTest() {
    Color yellow = new Yellow();
    Color blue = new Blue();

    System.out.println("挎包描述 start");
    Bag handBag = new HandBag();
    handBag.setColor(yellow);
    System.out.println(handBag.desc());

    handBag.setColor(blue);
    System.out.println(handBag.desc());
    System.out.println("挎包描述 end\n");

    System.out.println("钱包描述 start");
    Bag wallet = new Wallet();
    wallet.setColor(yellow);
    System.out.println(wallet.desc());

    wallet.setColor(blue);
    System.out.println(wallet.desc());
    System.out.println("钱包描述 end");
  }

  /**
   * Title: 装饰模式测试<br>
   * Description: decoratorPatternsTest<br>
   * CreateDate: 2019/7/2 18:49<br>
   *
   * @return void
   * @throws Exception
   * @category 装饰模式测试
   * @author jackie.scl
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
   * Title: 外观模式测试<br>
   * Description: facadePatternsTest<br>
   * CreateDate: 2019/7/15 16:37<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void facadePatternsTest() {
    Facade facade = new Facade();
    facade.method();
  }

  /**
   * Title: 享元模式测试<br>
   * Description: flyweightPatternsTest<br>
   * CreateDate: 2019/7/16 23:41<br>
   *
   * @return void
   * @throws Exception
   * @category
   * @author jackie.scl
   */
  public static void flyweightPatternsTest() {
    System.out.println("享元对象初始化 start");
    FlyweightFactory flyweightFactory = new FlyweightFactory();
    System.out.println("享元对象初始化 end\n");

    System.out.println("获取享元对象 start");
    // 获取具体享元对象A
    Flyweight concreteFlyweightA = flyweightFactory.getFlyweight("concreteFlyweightA");
    // 获取具体享元对象B
    Flyweight concreteFlyweightB = flyweightFactory.getFlyweight("concreteFlyweightB");
    // 获取具体享元对象C
    Flyweight concreteFlyweightC = flyweightFactory.getFlyweight("concreteFlyweightC");
    System.out.println("获取享元对象 end\n");

    System.out.println("执行享元对象方法 start");
    concreteFlyweightA.operation(new UnsharedConcreteFlyweight("concreteFlyweightA"));
    concreteFlyweightB.operation(new UnsharedConcreteFlyweight("concreteFlyweightB"));
    System.out.println("执行享元对象方法 end");
  }

  /**
   * Title: 组合模式测试<br>
   * Description: compositePatternsTest<br>
   * CreateDate: 2019/7/17 18:48<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void compositePatternsTest() {
    // 创建树枝A
    AbstractComponent branchComponentA = new BranchComponent();
    // 创建树枝B
    AbstractComponent branchComponentB = new BranchComponent();
    // 创建树叶1
    AbstractComponent leaf1 = new LeftComponent("1");
    // 创建树叶2
    AbstractComponent leaf2 = new LeftComponent("2");
    // 创建树叶3
    AbstractComponent leaf3 = new LeftComponent("3");
    // 树枝A添加树叶1，并添加树枝B为子树枝
    branchComponentA.add(leaf1);
    branchComponentA.add(branchComponentB);

    // 树枝A添加树叶2，树叶3
    branchComponentB.add(leaf2);
    branchComponentB.add(leaf3);

    // 调用树枝A operation
    branchComponentA.operation();
  }

  /**
   * Title: 模板方法模式测试<br>
   * Description: templateMethodPatternsTest<br>
   * CreateDate: 2019/7/3 22:45<br>
   *
   * @return void
   * @throws Exception
   * @category @author jackie.scl
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
   * @return void
   * @throws Exception
   * @category @author jackie.scl
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
   * Title: 命令模式测试<br>
   * Description: commandPatternsTest<br>
   * CreateDate: 2019/7/17 19:04<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void commandPatternsTest() {
    AbstractCommand concreteCommandA = new ConcreteCommandA();
    AbstractCommand concreteCommandB = new ConcreteCommandB();
    // 创建具体命令A的调用者
    Invoker invokerA = new Invoker(concreteCommandA);
    // 创建具体命令B的调用者
    Invoker invokerB = new Invoker(concreteCommandB);

    System.out.println("调用者请求具体命令A start");
    invokerA.call();
    System.out.println("调用者请求具体命令A end\n");

    System.out.println("调用者请求具体命令B start");
    invokerB.call();
    System.out.println("调用者请求具体命令A end");

  }

  /**
   * Title: 责任链模式测试<br>
   * Description: responsibilityChainPatternsTest<br>
   * CreateDate: 2019/7/17 19:09<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void responsibilityChainPatternsTest() {
    AbstractHandler concreteHandlerA = new ConcreteHandlerA();
    AbstractHandler concreteHandlerB = new ConcreteHandlerB();
    // 形成concreteHandlerA->concreteHandlerB责任链
    concreteHandlerA.setNextHandler(concreteHandlerB);

    System.out.println("请求chooseA处理 start");
    concreteHandlerA.handlerRequest("chooseA");
    System.out.println("请求chooseA处理 end\n");

    System.out.println("请求chooseB处理 start");
    concreteHandlerA.handlerRequest("chooseB");
    System.out.println("请求chooseB处理 end\n");

    System.out.println("请求chooseC处理 start");
    concreteHandlerA.handlerRequest("chooseC");
    System.out.println("请求chooseC处理 end");
  }

  /**
   * Title: 状态模式测试<br>
   * Description: statePatternsTest<br>
   * CreateDate: 2019/7/17 20:13<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void statePatternsTest() {
    Context context = new Context();
    context.Handle();
    context.Handle();
    context.Handle();
    context.Handle();
  }

  /**
   * Title: 观察者模板测试<br>
   * Description: observerPatternsTest<br>
   * CreateDate: 2019/7/4 19:13<br>
   *
   * @return void
   * @throws Exception
   * @category @author jackie.scl
   */
  public static void observerPatternsTest() {
    // 目标获取
    Subject subject = new ConcreteSubject();
    // 观察者获取
    Observer observerA = new ConcreteObserverA();
    Observer observerB = new ConcreteObserverB();
    // 观察者新增
    subject.addObserver(observerA);
    subject.addObserver(observerB);
    // 通知目标添加了的观察者
    subject.notifyObserver();
  }

  /**
   * Title: 中介者模式测试<br>
   * Description: mediatorPatternsTest<br>
   * CreateDate: 2019/7/17 21:16<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void mediatorPatternsTest() {
    AbstractMediator concreteMediator = new ConcreteMediator();
    AbstractColleague concreteColleagueA = new ConcreteColleagueA();
    AbstractColleague concreteColleagueB = new ConcreteColleagueB();
    // 具体中介者注册具体同事A、具体同事B的信息
    concreteMediator.register(concreteColleagueA);
    concreteMediator.register(concreteColleagueB);

    System.out.println("具体同事A请求 start");
    concreteColleagueA.send();
    System.out.println("具体同事A请求 end\n");

    System.out.println("具体同事B请求 start");
    concreteColleagueB.send();
    System.out.println("具体同事B请求 end");
  }

  /**
   * Title: 迭代器模式测试<br>
   * Description: iteratorPatternsTest<br>
   * CreateDate: 2019/7/18 10:01<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void iteratorPatternsTest() {
    AbstractAggregate concreteAggregate = new ConcreteAggregate();
    concreteAggregate.add("韦博英语");
    concreteAggregate.add("嗨英语");
    concreteAggregate.add("开心豆");
    System.out.print("聚合的内容有：");
    AbstractIterator iterator = concreteAggregate.getIterator();
    while (iterator.hasNext()) {
      Object ob = iterator.next();
      System.out.print(ob.toString() + "\t");
    }
    Object ob = iterator.first();
    System.out.println("\nFirst：" + ob.toString());

  }

  /**
   * Title: 访问者模式测试<br>
   * Description: visitorPatternsTest<br>
   * CreateDate: 2019/7/18 18:44<br>
   *
   * @category 访问者模式测试
   * @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void visitorPatternsTest() {
    ObjectStructure objectStructure = new ObjectStructure();
    AbstractElement concreteElementA = new ConcreteElementA();
    AbstractElement concreteElementB = new ConcreteElementB();
    AbstractVisitor concreteVisitorA = new ConcreteVisitorA();
    AbstractVisitor concreteVisitorB = new ConcreteVisitorB();

    // 对象结构添加具体元素
    objectStructure.add(concreteElementA);
    objectStructure.add(concreteElementB);

    // 对象结构接受具体访问者访问
    System.out.println("具体访问者A访问 start");
    objectStructure.accept(concreteVisitorA);
    System.out.println("具体访问者A访问 end\n");

    System.out.println("具体访问者B访问 start");
    objectStructure.accept(concreteVisitorB);
    System.out.println("具体访问者B访问 end");
  }

  /**
   * Title: 备忘录模式测试<br>
   * Description: mementoPatternsTest<br>
   * CreateDate: 2019/7/19 19:13<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void mementoPatternsTest() {
    // 新增管理者
    Caretaker caretaker = new Caretaker();
    // 新增发起人
    Originator originator = new Originator();
    // 创建备忘录stateOne
    Memento memento = originator.createMemento("stateOne");
    System.out.println("初始备忘录状态：" + memento.getState());

    // 管理者保存备忘录
    caretaker.setMemento(memento);

    // 发起人变更状态
    originator.setState("stateTwo");
    System.out.println("变更状态：" + originator.getState());

    // 发起人恢复到保存的备忘录状态
    originator.restoreMemento(caretaker.getMemento());
    System.out.println("恢复状态：" + originator.getState());
  }

  /**
   * Title: 解释器模式测试<br>
   * Description: interpreterPatternsTest<br>
   * CreateDate: 2019/7/19 14:03<br>
   *
   * @category @author jackie.scl
   * @return void
   * @exception Exception
   */
  public static void interpreterPatternsTest() {
    InterpreterContext bus = new InterpreterContext();
    bus.freeRide("韶关的老人");
    bus.freeRide("韶关的年轻人");
    bus.freeRide("广州的妇女");
    bus.freeRide("广州的儿童");
    bus.freeRide("山东的儿童");
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
