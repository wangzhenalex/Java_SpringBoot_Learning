# Java_Spring_Demo
java spring-boot 学习项目

##  章节7 Starter
### Spring Starter
### 模板引擎
    *   JSP（Servlet占用JVM内存）
        -   后端渲染，消耗性能
        -   JSP Limitations

    *   Freemarker（不占用JVM内存）
        -   xxx.ftl 依赖MVC模式
        -   不依赖Servlet容器

    *   Thymeleaf(主推)
        -   轻量级模板引擎 不推荐负责逻辑业务，解析DOM或者XML会占用多的内存
        -   可以直接在浏览器中正确显示模板页面
        -   直接html结尾，直接编辑  伪装

### thymeleaf

##  章节6 拦截器
###     Servlet3.0 注解自定义原生Servlet实战

###     SpringBoot2.x 拦截器
    *   Filter是基于函数回调 doFilter()    vs    Interceptor则是基于AOP思想
    *   Filter只在Servlet前后起作用    vs   Interceptor够深入到方法前后、异常抛出前后
    *   Filter依赖Servlet容器   vs  不依赖，可以在多种环境运行
    *   在接口调用生命周期，只能容器初始化调用一次   vs  可以多次被调用

    执行顺序：
    过滤前 --> 拦截前 --> action执行 --> 拦截后 --> 过滤后
