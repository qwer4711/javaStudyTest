import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("spring-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {

    @Test
    public void hello() {
        System.out.println("hello,world");
    }
}
