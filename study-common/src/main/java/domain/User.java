package domain;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    static Logger logger = LoggerFactory.getLogger(User.class);
    String user;
    String password;

    public static void main(String[] args) {
        logger.debug("test output");
    }
}
