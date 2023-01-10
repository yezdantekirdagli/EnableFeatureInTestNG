import org.testng.annotations.Test;

import java.security.acl.Group;

public class TestNG {
    @Test(enabled = false)
    public void test1() {
        System.out.println("test1");
    }
    @Test(priority = -5)
    public void test2() {
        System.out.println("test2");
    }
    @Test
    public void test3() {
        System.out.println("test3");
    }
    @Test(enabled = false)
    public void test4() {
        System.out.println("test4");
    }

    }

