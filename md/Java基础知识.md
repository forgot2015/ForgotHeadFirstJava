## Java基础知识

### [基础概念](#基础概念)
### [Java关键字](#Java关键字)
### [高级特性](#高级特性)
### [进阶](#进阶)
### [命名与开发规范](#命名与开发规范)
### [代码设计原则](#代码设计原则)
### [常用缩写](#常用缩写)

# 基础概念
- 类：类是一个模板，它描述一类对象的行为和状态
- 对象. 对象是类的一个实例.有状态和行为
- 变量类型. 实例变量,局部变量,类变量(静态变量),成员变量(非静态变量)
- 方法
- 继承：子类继承父类之后，将拥有父类的一些公开方法和变量，java类只能继承一个父类
- 封装：设置类中域的访问权限，给外部类提供统一的访问接口，提高数据的安全性
- 多态：结合继承，重载等来使用，根据不同的参数，调用不同的处理方法
- 接口：其中的方法默认是public abstract,变量默认是public static final，方法只能写方法体，不能写具体的方法实现。java可以实现多接口
- 抽象类：与接口类似，但子类只能继承一个抽象类，抽象类可以包含非抽象方法和参数，而包含抽象方法的类需要转为抽象类
- 方法重载：根据传入的不同参数，调用不同方法。 方法名必须同，传入参数必须不同，访问权限可修改，返回参数可修改
- 方法重写：继承父类后，重写父类方法来实现不同的功能。 方法名必须同，传入参数必须同，访问权限要大于等于父类，抛出异常要小于等于父类，返回值必须相同,@Override原来是给编译器看的，并不会真的运行到程序里，而这个是为了让编译器帮你检查名字有没有拼对，所以其实不写也可以，但如果不写，而你不小心把重写的方法名字写错了，那就尴尬了
- 依赖注入：如果 Class B 是 Class A 的 Dependency，B 的赋值不是写死在了类或构造函数中，而是通过构造函数或其他函数的参数传入，这种赋值方式我们称之为依赖注入。

- Java关键字
- [可访问修饰符](./src/base/modifier/FinalClass.java). default,public,protected,private
- 不可访问修饰符.final,abstract,strictfp
- strictfp, 即 strict float point (精确浮点),如果你想让你的浮点运算不会因为不同的硬件平台所执行的结果不一致的话，可以用关键字strictfp, 与精确度无关
- transient 
  变量修饰符(只能修饰字段)。标记为transient的变量，在对象存储时，这些变量状态不会被持久化。当对象序列化的保存在存储器上时，不希望有些字段数据被保存，
  为了保证安全性，可以把这些字段声明为transient
- volatile修饰变量。在每次被线程访问时，都强迫从共享内存中重读该成员变量的值。而且，当成员变量发生变化时，强迫线程将变化值回写到共享内存。
这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。 
貌似不对，Java 语言中的 volatile 变量可以被看作是一种 “程度较轻的 synchronized”；与 synchronized 块相比，volatile 变量所需的编码较少，并且运行时开销也较少，但是它所能实现的功能也仅是 synchronized 的一部分
https://www.ibm.com/developerworks/cn/java/j-jtp06197.html
- Java数组
- Java注释. //单行   /*多行 */   /**文档注释,方便JavaDoc导出 */
- Java空行或单词间空格. 编译器会忽略
- 构造方法
- 创建对象. 声明,实例化,初始化.
- [8种基本数据类型及其包装类](./src/base/DataTypeSample.java). byte,short,int,long,float,double,boolean,char
- 引用类型，除了8种基本类型 其余都是引用类型。所有引用类型的默认值都是null。
- 常量
局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
- Synchronized修饰符  使对象方法在同一时间内只能被一个线程访问
- Transient修饰符  当对象序列化时将忽略被此修饰的变量
- volatile修饰符  保证各线程访问的变量是一样的。Volatile修饰的成员变量在每次被线程访问时，都强迫从共享内存中重读该成员变量的值。而且，当成员变量发生变化时，强迫线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。一个volatile对象引用可能是null。
- java运算符。 算术运算符，逻辑运算符，位运算符，关系运算符，赋值运算符，条件运算符，instance of运算符
- 循环结构(for,foreach while， do...while)，分支结构(if...else, switch...case)
- 可变参数 typeName... parameterName
- Java 流(Stream)、文件(File)和IO
- Java异常处理


# 高级特性
- 继承 extend 基类(父类,超类)和派生类(子类)
- 接口 Interface. 接口允许多重继承,接口可以直接用来声明类型
- 抽象类
- 封装 Encapsulation
- 重写和重载
- 多态.
  - 多态的定义：指允许不同类的对象对同一消息做出响应。即同一消息可以根据发送对象的不同而采用多种不同的行为方式。（发送消息就是函数调用）
  - 实现多态的技术称为：动态绑定（dynamic binding），是指在执行期间判断所引用对象的实际类型，根据其实际的类型调用其相应的方法。
  - 多态的作用：消除类型之间的耦合关系。
  - 现实中，关于多态的例子不胜枚举。比方说按下 F1 键这个动作，如果当前在 Flash 界面下弹出的就是 AS 3 的帮助文档；如果当前在 Word 下弹出的就是 Word 帮助；在 Windows 下弹出的就是 Windows 帮助和支持。同一个事件发生在不同的对象上会产生不同的结果。
  - 多态存在的三个必要条件. 要有继承，要有重写，父类引用指向子类对象。
- 泛型 generics。
- 反射 reflection
- 注解
- 序列化 字符串是对象里的某些数据的输出结果，你看到的文本文件只包含了对象的一部分信息，你看到可能只是个值而已。
比如一个对象
```
object monkey
{
String monkeyName = “悟空”;
long monkeyAge = 1000;
}
```
你输出的字符串可能只是这个：
悟空；
10000；
但对象很多信息丢掉了，比如对象名称，字段属性之类的。
序列化时把对象完整的输入到某个地方，比如文件，这个文件人类是看不懂的，但在反序列化时，文件就会被完成的读取为一个对象，和上面的对象一模一样，这样我们就可以在代码中对对象进行直接操作了。


# 进阶
- Java网络编程, Socket编程
- 多线程。线程同步，线程间通信，线程死锁，线程挂起/停止/恢复
- 枚举
- lambda
- 输入输出流
- 设计模式
- 集合框架
- 数据结构和排序算法


# 命名与开发规范
- 命名全部用英文单词或通用拼音词汇(如HangZhou)
- 类名大写开头,采用大驼峰写法
- 方法名小写开头,采用小驼峰写法
- 常量使用全大写,单词间用_隔开
- 枚举类结尾加Enum
- 实现接口的类加Impl结尾
- url地址命名
  如https://spring.io/guides/gs/intellij-idea/#_importing_a_getting_started_guide
  url 不用驼峰命名 其中 url 的 path 用-号分割单词， queryparam 用_分隔 body 里面的用 field 用驼峰命名。 
  －分隔的东西在前端没办法很好的写成变量 所以避免了一些直接映射 
  _分隔的东西可以很好写在 dict 的 key 里 很直观 
  驼峰的东西就是数据的映射了
- 构造方法里面禁止加入任何业务逻辑，如果有初始化逻辑，请放在 init 方法中 
-  类内方法定义的顺序依次是：公有方法或保护方法 > 私有方法 > getter/setter
  方法。
- setter 方法中，参数名称与类成员变量名称一致， this.成员名 = 参数名。在
    getter/setter 方法中， 不要增加业务逻辑，增加排查问题的难度。
- 关于 hashCode 和 equals 的处理。只要重写 equals，就必须重写 hashCode。 如果自定义对象作为 Map 的键，那么必须重写 hashCode 和 equals。
- 线程资源必须通过线程池提供，不允许在应用中自行显式创建线程。
- 线程池不允许使用 Executors 去创建，而是通过 ThreadPoolExecutor 的方式
- 避免采用取反逻辑运算符，不利于快速理解
- 类、类属性、类方法的注释必须使用 Javadoc 规范，使用/**内容*/格式，不得使用
  // xxx 方式。
- 所有的抽象方法（包括接口中的方法） 必须要用 Javadoc 注释、除了返回值、参数、
  异常说明外，还必须指出该方法做什么事情，实现什么功能。
- 所有的类都必须添加创建者和创建日期
- 方法内部单行注释，在被注释语句上方另起一行，使用//注释。方法内部多行注释
  使用/* */注释，注意与代码对齐。
- 方法的返回值可以为 null，不强制返回空集合，或者空对象等，必须添加注释充分
  说明什么情况下会返回 null 值。
  说明： 本手册明确防止 NPE 是调用者的责任。即使被调用方法返回空集合或者空对象，对调用
  者来说，也并非高枕无忧，必须考虑到远程调用失败、 序列化失败、 运行时异常等场景返回
  null 的情况。
- 防止 NPE，是程序员的基本修养
- 【强制】用户敏感数据禁止直接展示，必须对展示数据进行脱敏。
  说明： 个人手机号码显示为:158****9119，隐藏中间 4 位，防止隐私泄露。


# 代码设计原则
耦合是一个宽泛的概念。两个程序模块有关联就叫做耦合
模块只对外暴露最小限度的接口，形成最低的依赖关系。
只要对外接口不变，模块内部的修改，就不得影响其他模块；
删除一个模块，应当只影响有依赖关系的其他模块，而不应该影响其他无关部分；
软件工程有一条铁律“高内聚、低耦合”

单向依赖\正交性\紧凑性
- 依赖和耦合的最大区别在于，当我们说“A和B耦合”时，在字面含义中，A和B二者平等。然而，正确的模块关系根本不应该平等，而应该是单向依赖才对。所以我们应该说“A依赖B”，这样含义要清楚得多。A依赖B意味着，A模块可以调用B模块暴露的API，但B模块绝不允许调用A模块的API。单向依赖是红线，好的设计一定不会违反这条红线。
- 正交性是指一个模块提供的API中，多个方法之间是否有重复的功能。如果有重复功能，正交性就差。通常，正交性高的模块更稳定，不会因为上层业务变化而被迫修改代码。好的API内部的多个方法之间不应该有任何重复功能，只实现正交的机制。如果感觉拆得太细使用不便，应该在底层API之外包装出一层Helper、Utility组成的胶水层。胶水层调用底层原语API来实现常用模式供上层使用。对于胶水层中的模块，对正交性的要求可以稍低一些。注意上层代码既可以直接调用正交的底层API，又可以调用胶水层的常用模式。
- 紧凑性是指一个模块提供的API中，公有方法总数必须很少，每个方法的参数也必须很少。《Unix编程艺术》上说一个模块不要超过7个方法，不然就很难理解。但我实践中发现，我一般编写的模块，公有方法通常不超过3个。
总之，单向依赖、正交性、紧凑性这三个指标都很务实，有客观方法可以度量。


# 常用缩写
- AO（Application Object）： 应用对象。 在 Web 层与 Service 层之间抽象的复用对象模型，
  极为贴近展示层，复用度不高。
- AOP：Aspect Oriented Programming,面向切面编程
- Applet：用Java语言编写的小应用程序，可以直接嵌入到网页中，并能够产生特殊的效果
- API：Application Programming Interface，应用程序接口
- ASP：Active Server Pages ，活动服务器网页，微软的
- ASPX:Active Server Page Extended File 是微软的在服务器端运行的动态网页文件
- AWT:Abstract Window ToolKit，抽象窗口工具包，是java最早的用于编写图形节目应用程序的开发包。
- BO（Business Object） ：业务对象。 由 Service 层输出的封装业务逻辑的对象。
- CGI：Common Gateway Interface，通用网关接口
- DAO Data Access Object DAO Java数据访问对象
- DO ：（Data Object）与数据库表结构一一对应，通过 DAO 层向上传输数据源对象
- DOM：Document Object Model，文档对象模型
- DTO（Data Transfer Object） ：数据传输对象， Service 或 Manager 向外传输的对象
- EJB：Enterprise JavaBeans，使得开发者方便地创建、部署和管理跨平台的基于组件的企业应用
- GUI:Graphical User Interface,图形用户界面
- IDE：Integrated Development Environment，集成开发环境
- IIS：Internet Information Server ，互联网信息服务器，微软的产品
- IoC:Inversion of Control,控制反转，是说对象的控制权进行转移
- Java SE Java Standard Edition，标准版本，一般我们下载的jdk是这个
- Java ME Java Micro Edition ， 微版本，用于嵌入式开发
- Java EE Java Enterprise Edition，企业版，用作企业开发
- J2EE（同上）：Java 2 Platform Enterprise Edition，Java2平台企业版
- Java IDL：Java Interface Definition Language，提供与CORBA(Common Object Request Broker Architecture）的无缝的互操作性。
这使得Java能集成异构的商务信息资源。
- JavaBean:本质上是一个类，封装了一些参数和getter、setter方法
- JavaFX:一个以Java为基础构建的富客户端平台，对手是Flash、Silverlight
- JavasScript：直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，用来配合html、css写网站前端，与java无关，只是名字类似，部分语法类似
- JDBC：Java Database Connectivity，java数据库连接
- JDK：java development kit，java开发工具包
- JIT: just in time,JIT是一种提高程序运行效率的方法。通常，程序有两种运行方式：静态编译与动态解释。静态编译的程序在执行前全部被翻译为机器码，而解释执行的则是一句一句边运行边翻译
- JNI：Java Native Interface，JAVA本地调用
- JPA： Java Persistence API的简称，即为Java持久层API。总的来说，JPA是规范，Hibernate是框架，JPA是持久化规范，而Hibernate实现了JPA。
- JRE：java runtime environment，java运行环境
- JSP：Java Server Pages ，Java服务器网页
- JSON：JavaScript Object Notation，一种轻量级的数据交换格式
- JVM：java virtual machine，java虚拟机
- OpenGL:开放图形库（英语：Open Graphics Library，缩写为OpenGL）是个定义了一个跨编程语言、跨平台的应用程序界面（API）的规范，
它用于生成二维、三维图像
- OpenJDK：JDK开源版本
- ORM：对象关系映射（Object Relation Mapping），是一种程序设计技术，用于实现面向对象编程语言里不同类型系统的数据之间的转换。
从效果上说，它其实是创建了一个可在编程语言里使用的“虚拟对象数据库”。
- POJO：Plain Old Java Objects
- Query：数据查询对象，各层接收上层的查询请求。 注意超过 2 个参数的查询封装，禁止使用 Map 类来传输
- REST -- REpresentational State Transfer
REST是什么呢？ 它是一种架构风格，腾讯公司或其他公司建立API时要遵守的一种规则/风格，当然也有其他规则可以用。
（看Url就知道要什么
看http method就知道干什么
看http status  code就知道结果如何）
首先，之所以晦涩是因为前面主语被去掉了，全称是 Resource Representational State Transfer
资源表现层状态转移
- Swing:一个为Java设计的GUI工具包，是为了解决AWT存在的问题而新开发的包，它以 AWT 为基础的。
- Servlet：用Java编写的服务器端程序
- VO（View Object） ： 显示层对象，通常是 Web 向模板渲染引擎层传输的对象。
- XML：Extensible Markup Language,扩展标记语言

