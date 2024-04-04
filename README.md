# 命令执行native方法hook演示demo


## 编译

`mvn clean package`


## 启动

premain方式启动
```java
java -javaagent:/path/to/your/rce-agent-1.0-SNAPSHOT.jar -jar application.jar
```

## 触发

发送一条能够触发命令执行的我请求（触发命令执行类的加载）


## 字节码文件

dump类在应用路径下的`rasp-class-dump`下





