package beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@ContextConfiguration("classpath:spring-bean-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class DogTest {

    @Resource
    Dog dog;


    @Test
    public void init() {

    }

}