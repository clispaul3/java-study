## Spring

  - bean的创建在容器完成之前
  - 通过ref引用外部的bean
  - 在property中嵌套bean可以引用内部的bean
```xml
    <bean id="user01" class="com.zyb.dao.User">
        <property name="card" ref="getIDCard"></property>
    </bean>
    <bean id="user02" class="com.zyb.dao.User">
        <property name="card">
            <bean class="com.zyb.dao.IDCard">
                <property name="id" value="10000"></property>
            </bean>
        </property>
    </bean>
    <bean id="getIDCard" class="com.zyb.dao.IDCard">
        <property name="id" value="10086"></property>
    </bean>
```
  
### 带名称空间的标签
  1. 导入名称空间
  2. 使用名称空间
  
### 继承配置信息
```xml
    <bean id="user01" class="com.zyb.dao.User">
        <property name="username" value="zhangfei"/>
        <property name="card" ref="card01"/>
        <property name="card.id" value="10010"/>
    </bean>
    <bean id="card01" class="com.zyb.dao.IDCard">
        <property name="id" value="10086"/>
    </bean>
    <bean id="user02" class="com.zyb.dao.User" parent="user01">
        <property name="username" value="guanyu"/>
    </bean>
```

### 抽象配置，用于继承
```xml
    <bean id="extendUser" class="com.zyb.dao.User" abstract="true">
        <property name="username" value="zhangfei"/>
        <property name="age" value="18"/>
    </bean>
```

### bean之间的依赖
  - bean的创建顺序默认是根据配置的顺序进行先后创建
  - 通过配置depends-on属性可以强行修改bean的创建顺序
```xml
    <bean id="user01" class="com.zyb.dao.User" depends-on="card01,book01">
        <property name="username" value="zhangfei"/>
        <property name="card" ref="card01"/>
        <property name="card.id" value="10010"/>
    </bean>
```

### bean作用域
  - 多实例的bean在ioc容器启动的时候不会被创建
  - 单实例的bean在ioc容器启动之前就被创建
  
### 静态工厂与实例工厂
```xml
    <bean id="computer01" class="com.zyb.factory.ComputerStaticFactory" factory-method="create">
        <constructor-arg name="brand" value="华硕"/>
        <constructor-arg name="price" value="4500.8"/>
    </bean>
    <bean id="instanceFactory" class="com.zyb.factory.ComputerInstanceFactory"/>
    <bean id="computer02" class="com.zyb.dao.Computer" factory-bean="instanceFactory" factory-method="create">
        <constructor-arg name="brand" value="戴尔"/>
        <constructor-arg name="price" value="6508.8"/>
    </bean>
```

### FactoryBean
  - 实现FactoryBean接口的工厂在创建对象的时候，不管是单实例还是多实例，都是获取实例的时候才创建
```xml
<bean id="computer03" class="com.zyb.factory.ComputerFactory"/>
```

### 生命周期
  - 生命周期方法不能有任何参数，但可以抛异常
  - ioc容器销毁的时候，执行生命周期的销毁方法（单实例对象）
  - ioc容器销毁的时候，不会执行生命周期的销毁方法（多实例对象）
  
### 后置处理器
  - 在bean初始化前后调用
  - 要实现接口 BeanPostProcessori
  
### 引入外部的配置文件
```xml
<context:property-placeholder location="db.properties"/>
```

### 基于xml的自动装配
> 针对的引用数据类型，不包括基本数据类型
  - autowire  没有找到装配null
    1. byName 根据属性名找对应id的bean
    2. byType 根据属性类型找到对应的bean  如果找到多个会报错
    3. constructor 根据构造器装配bean 如果找到多个，则以参数名进行匹配
    + 如果属性是List,则会把容器中所有匹配的类型装配进List
    
### SPEl spring的el 表达式

## 基于配置的IOC容器
### 四个注解
>添加任何一个注解，都能加入到IOC容器中进行管理
>通过类名小写拿到对应的bean,默认都是单实例的
  1. @Controller  控制器层的类
  2. @Service     业务逻辑层的类
  3. @Component   其他层的类
  4. @Repository  持久层的类
```java
Book book = (Book) context.getBean("book");
```
### 通过注解传入参数
```java
@Repository("book01")
@Scope(value = "prototype")
```
### 添加过滤条件
```xml
<context:component-scan base-package="com.zyb" use-default-filters="false">
<!--        <context:exclude-filter type="annotation"-->
<!--                                expression="org.springframework.stereotype.Service"/>-->
<!--        <context:exclude-filter type="assignable" expression="com.zyb.dao.Book"/>-->
        <context:include-filter type="assignable" expression="com.zyb.dao.Book"/>
</context:component-scan>
```
### 注解方式的自动装配
  - @Autowired  装配的是和属性名同名的bean
  - @Autowired(required=false)  找不到就装配null
  - @Qulifier("")  指定id名去查找bean
  - @Autowired 如果用在方法上，则会为方法的参数主动注入值
  - @Resource J2EE的标准，扩展性更强
```java
 @Autowired
    private IService noteService;
 @Autowired
    private IService bookService;
```
### 泛型依赖注入

