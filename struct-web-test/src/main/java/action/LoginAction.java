package action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;

@Data
public class LoginAction extends ActionSupport {

    private String userName;
    private String password;
    private int page;

    public String login() {
        return SUCCESS;
    }




}
