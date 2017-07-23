## Java基础知识
变量
局部变量什么时候被销毁?

基础:
- 对象. 对象是类的一个实例.有状态和行为
- 类. 类是描述一类对象的状态和行为的模板
- 变量类型. 实例变量,局部变量,类变量(静态变量),成员变量(非静态变量)
- 方法
- Java关键字
- [可访问修饰符](./src/base/modifier/FinalClass.java). default,public,protected,private
- 不可访问修饰符.final,abstract,strictfp
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


高级特性:
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
- 序列化
- Java网络编程, Socket编程
- 多线程。线程同步，线程间通信，线程死锁，线程挂起/停止/恢复
- 枚举
- lambda
进阶:
- 输入输出流
- 设计模式
- 集合框架
- 数据结构和排序算法


## 命名规范
- 命名全部用英文单词或通用拼音词汇(如HangZhou)
- 类名大写开头,采用大驼峰写法
- 方法名小写开头,采用小驼峰写法
- 常量使用全大写,单词间用_隔开
- 枚举类结尾加Enum
- 实现接口的类加Impl结尾

## 代码设计原则
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
