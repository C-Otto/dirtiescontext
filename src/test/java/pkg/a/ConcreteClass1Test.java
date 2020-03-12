package pkg.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pkg.SomeBean;

@ContextConfiguration(classes = SomeBean.class)
public class ConcreteClass1Test extends AbstractClassTestSupport {
    @Autowired
    private SomeBean someBean;

    @BeforeMethod public void setUp() {
        assert !someBean.dirty;
    }

    @Test public void testB() {
        System.out.println(getClass());
        assert !someBean.dirty;
    }
}