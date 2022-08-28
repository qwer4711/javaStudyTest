1   1.1 *： 学习使用maven创建web工程的两种方式：
    https://www.bilibili.com/video/BV1Qf4y1T7Hx?p=91&vd_source=d71b5e15775c60b27d0992ed3b343b71
    
    1.2 *：struct2框架过于老旧，idea需要添加strut的支持:解决方法：
    https://blog.csdn.net/qq_31729869/article/details/124377118
    
    struct2: web添加映射     struct.xml创建url请求路径和 类（继承Action）处理关系。 result
  
2 struts 页面传递值。 坑：struct.xml放在resource目录文件下，<action>的<result></result>中路径问题，应该为/WEB-INF/下路径
    //TODO 后续需要学习vm页面知识
    
3 2022-8-29 struts学习告一段落。
    该模块主要学习 Maven构建web项目模块
            web.xml中配置项及顺序。eg.context-param filter listener servlet welcome-file-list 
    strut 的映射逻辑。url -> action类,返回字符串->字符串解析到某一个视图或另一个action等。
    struts的action的丰富性，主要几种type的差异。
    
    struts的拦截器实现。如对每个<package>设置默认拦截器，对其中<action>可以在添加单独的拦截器等。
    
    
    
4    Velocity模板引擎的简单学习。包括pom依赖,修改配置（通过web.xml的init-param实现）、及简单.vm的使用
