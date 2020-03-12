package pkg;

import org.springframework.stereotype.Repository;

@Repository
public class SomeBean {
    public SomeBean() {
        System.out.println("new bean");
    }

    public boolean dirty;
}