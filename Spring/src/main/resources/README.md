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