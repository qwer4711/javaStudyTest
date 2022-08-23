package beans;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * 本类主要用于验证bean的声明周期
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dog implements ApplicationContextAware, BeanFactoryAware, EnvironmentAware, InitializingBean
, BeanPostProcessor, BeanFactoryPostProcessor {

    private static Logger logger = LoggerFactory.getLogger(Dog.class);

    private String names;
    private int ages;
    /**
     * spring 内部容器对象，实现Aware接口 由spring容器完成该变量赋值
     * 若不实现Aware接口，用户无法在xml文件中赋值
     */
    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;
    private Environment environment;

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        logger.info("beanFactory工厂增强");
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        logger.info("1 init()方法执行前，属性设置后");
        return null;
    }
    public void afterPropertiesSet() {
        logger.info("2 init（）方法执行前执行");
    }
    /**
     * 自定义“初始话”方法
     */
    public void init() {
        logger.info("属性此时已初始化完毕");
        logger.info(JSON.toJSONString(beanFactory));
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        logger.info("初始化后，bean增强器");
        return null;
    }

    /**
     * debug 去观察bean的声明周期
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog);
    }


}
