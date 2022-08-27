package action;

import com.opensymphony.xwork2.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pojo.Dog;

/**
 * 界面 & 类直接传递值
 */
public class YuBanAction implements Action {
    Logger logger = LoggerFactory.getLogger(YuBanAction.class);

    Dog dog = new Dog(1,"默认名") ;
    Integer yubanAge = 6;

    public String execute() throws Exception {
        System.out.println("age:" + yubanAge + "dog:" + dog);
        return SUCCESS;
    }
}
