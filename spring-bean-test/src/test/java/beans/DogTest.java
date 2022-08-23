package beans;

import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@ContextConfiguration("classpath:spring-bean-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class DogTest {
    Logger logger = LoggerFactory.getLogger(DogTest.class);

    @Resource
    Dog dog;


    @Test
    public void init() {
        // 使用默认配置
        // BasicConfigurator.configure();
        logger.info("bean的声明周期验证");

        System.out.println(dog.getAges());
    }


}