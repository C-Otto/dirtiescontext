package pkg.a;

import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class AbstractClassTestSupport extends AbstractTestNGSpringContextTests {
    @BeforeMethod public void setUp() {
    }

    @Test public void testA() {
        System.out.println("(abstract) " + getClass());
    }
}
