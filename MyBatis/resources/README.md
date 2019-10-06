# MyBatis

## 全局配置文件
  - typeAliases  别名不区分大小写
  - @Alias 需要配合typeAliases一起使用，用于区分同一个包（后代包）下的名字相同的类
  - 别名是针对sql映射文件中resultType的别名，mybatis有很多默认的别名，起别名的时候要特别注意