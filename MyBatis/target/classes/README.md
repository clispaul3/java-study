# MyBatis

## 全局配置文件
  - typeAliases  别名不区分大小写
  - @Alias 需要配合typeAliases一起使用，用于区分同一个包（后代包）下的名字相同的类
  - 别名是针对sql映射文件中resultType的别名，mybatis有很多默认的别名，起别名的时候要特别注意
  - environments 用于指定环境配置，如:开发环境，测试环境，生产环境
  - mappers 可以注册配置文件，也可以注册接口，如果注册接口，则配置文件必须和接口在同一目录，且文件名必须相同
  
## sql映射文件
  - 获取自增主键的值
```xml
<insert id="insertOne" parameterType="com.zyb.dao.User" useGeneratedKeys="true" keyProperty="id">
    insert into user(username,age,user_address)
    values(#{username},#{age},#{userAddress})
</insert>
```
  - 支持多个参数
```xml
<select id="getUser" resultType="User">
    select * from user where username = #{param1} and age = #{param2}
</select>
```