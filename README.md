# Java_Spring_Demo
java spring-boot 学习项目


##  章节6 拦截器
###     Servlet3.0 注解自定义原生Servlet实战

###     SpringBoot2.x 拦截器
    *   Filter是基于函数回调 doFilter()    vs    Interceptor则是基于AOP思想
    *   Filter只在Servlet前后起作用    vs   Interceptor够深入到方法前后、异常抛出前后
    *   Filter依赖Servlet容器   vs  不依赖，可以在多种环境运行
    *   在接口调用生命周期，只能容器初始化调用一次   vs  可以多次被调用

    执行顺序：
    过滤前 --> 拦截前 --> action执行 --> 拦截后 --> 过滤后
