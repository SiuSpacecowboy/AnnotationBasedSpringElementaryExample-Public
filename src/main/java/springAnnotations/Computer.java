package springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("comp1")
@Scope("prototype") // Scope. Если scope = prototype - destroy-method не будет работать.
public class Computer {

    @Value("${computer.name}")
    private String name;

    @Value(("${computer.battery}"))
    private int battery;

    public String getName() {
        return name;
    }

    public int getBattery() {
        return battery;
    }

    @PostConstruct // Init-method
    public void doInit() {
        System.out.println("INIT");
    }

    @PreDestroy // Destroy-method
    public void dest() {
        System.out.println("DESTRUCTION");
    }

    public void playPlayer(String string) {
        System.out.println(string);
    }
}
