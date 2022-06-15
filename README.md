# smart-design-pattern
设计模式（Design pattern）代表了最佳的实践，通常被有经验的面向对象的软件开发人员所采用。设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。本仓库将对23种设计模式进行结合开发用例进行讲解和代码实战！

### 设计原则

1. 开闭原则： 对扩展开放，对修改关闭
2. 里氏转换原则： 子类继承父类，单独完全可以运行
3. 依赖倒转原则： 引用一个对象，如果这个对象有底层类型，直接引用底层类型
4. 接口隔离原则： 每一个接口应该是一种角色
5. 合成/聚合复用原则： 新的对象应使用一些已有的对象，使之成为新对象的一部分
6. 迪米特原则： 一个对象应对其他对象有尽可能少的了解

## 设计模式分类

### 创建型模式

创建型模式，就是创建对象的模式，抽象了实例化的过程。它帮助一个系统独立于如何创建、组合和表示它的那些对象。关注的是对象的创建，创建型模式将创建对象的过程进行了抽象，也可以理解为将创建对象的过程进行了封装，作为客户程序仅仅需要去使用对象，而不再关系创建对象过程中的逻辑。

社会化的分工越来越细，自然在软件设计方面也是如此，因此对象的创建和对象的使用分开也就成为了必然趋势。因为对象的创建会消耗掉系统的很多资源，所以单独对对象的创建进行研究，从而能够高效地创建对象就是创建型模式要探讨的问题。这里有6个具体的创建型模式可供研究，它们分别是：

- 简单工厂模式（Simple Factory）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-factory)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/113814270)

- 工厂方法模式（Factory Method）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-factory)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/113814270)

- 抽象工厂模式（Abstract Factory）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-factory)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/113814270)

- 创建者模式（Builder）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-builder)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/121555185)

- 原型模式（Prototype）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-prototype)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/113815301)

- 单例模式（Singleton

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-singleton)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/113809709)

### 结构型模式

结构型模式是为解决怎样组装现有的类，设计它们的交互方式，从而达到实现一定的功能目的。结构型模式包容了对很多问题的解决。例如：扩展性（外观、组成、代理、装饰）、封装（适配器、桥接）。

在解决了对象的创建问题之后，对象的组成以及对象之间的依赖关系就成了开发人员关注的焦点，因为如何设计对象的结构、继承和依赖关系会影响到后续程序的维护性、代码的健壮性、耦合性等。对象结构的设计很容易体现出设计人员水平的高低，这里有7个具体的结构型模式可供研究，它们分别是：

- 外观模式/门面模式（Facade门面模式）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-facade)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/120977105)

- 适配器模式（Adapter）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-adapter)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/120958525)

- 代理模式（Proxy）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-proxy)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/121078763)

- 装饰模式（Decorator）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-decorate)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/120948356)

- 桥梁模式/桥接模式（Bridge）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-bridging)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/120906458)

- 组合模式（Composite）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-combination)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/121694610)

- 享元模式（Flyweight）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-flyweight)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/120996504)

### 行为型模式

行为型模式涉及到算法和对象间职责的分配，行为模式描述了对象和类的模式，以及它们之间的通信模式，行为模式刻划了在程序运行时难以跟踪的复杂的控制流可分为行为类模式和行为对象模式。1. 行为类模式使用继承机制在类间分派行为。2. 行为对象模式使用对象聚合来分配行为。一些行为对象模式描述了一组对等的对象怎样相互协作以完成其中任何一个对象都无法单独完成的任务。

在对象的结构和对象的创建问题都解决了之后，就剩下对象的行为问题了，如果对象的行为设计的好，那么对象的行为就会更清晰，它们之间的协作效率就会提高，这里有11个具体的行为型模式可供研究，它们分别是：

- 模板方法模式（Template Method）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-template)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/121158230)

- 观察者模式（Observer）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-observation)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/121119279)

- 状态模式（State）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-state)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/121243973)

- 策略模式（Strategy）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-strategy)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/121152362)

- 职责链模式（Chain of Responsibility）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-chain)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/121099713)
  
- 管道模式（Pipeline Pattern）

  [源码地址](https://github.com/Jacklinsir/smart-design-pattern/tree/main/smart-dp-pipeline)

  [文章地址](https://blog.csdn.net/qq_21077715/article/details/125293748)

- 命令模式（Command）

- 访问者模式（Visitor）

- 调停者模式（Mediator）

- 备忘录模式（Memento）

- 迭代器模式（Iterator）

- 解释器模式（Interpreter）

## 三者之间的区别和联系

> 创建型模式提供生存环境，结构型模式提供生存理由，行为型模式提供如何生存。

1. 创建型模式为其他两种模式使用提供了环境。
2. 结构型模式侧重于接口的使用，它做的一切工作都是对象或是类之间的交互，提供一个门。
3. 行为型模式顾名思义，侧重于具体行为，所以概念中才会出现职责分配和算法通信等内容。
