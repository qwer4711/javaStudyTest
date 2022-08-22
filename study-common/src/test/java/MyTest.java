import com.alibaba.fastjson.JSON;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@ContextConfiguration("classpath:spring-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {
    private static Logger logger = LoggerFactory.getLogger(MyTest.class);

    @Resource
    User user;

    /**
     * 需要将相关配置文件拷贝到test文件夹下生成的target目录中
     */
    @Test
    public void hello() {
        logger.debug("hello,world");
        System.out.println("hello,console");
        logger.error(JSON.toJSONString(user));
    }
}
