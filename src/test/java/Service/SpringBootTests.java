package Service;
import org.junit.Assert;
import org.junit.Test;

public class SpringBootTests {
    UserServiceImpl userImpl = new UserServiceImpl();

    @Test
    public void addUser() {
        Assert.assertEquals(0, userImpl.fk.findUserById(0).getId());
    }

}