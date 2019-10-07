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