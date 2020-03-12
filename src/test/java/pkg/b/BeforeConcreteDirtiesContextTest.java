package pkg.b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import pkg.SomeBean;

@ContextConfiguration(classes = SomeBean.class)
public class BeforeConcreteDirtiesContextTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private SomeBean someBean;

    @DirtiesContext
    @Test public void testDirtiesContext() {
        System.out.println(getClass());
        assert !someBean.dirty;
        someBean.dirty = true;
    }
}
