package pro.junseok.sample.beanscope.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Scope(scopeName = "prototype")
public class PrototypeComponent {

    private int number = 0;

    public void plus() {
        log.debug("PrototypeComponent number = " + this.number);
        log.debug("PrototypeComponent plus()");
        number++;
        log.debug("PrototypeComponent number = " + this.number);
    }

    public void minus() {
        log.debug("PrototypeComponent number = " + this.number);
        log.debug("PrototypeComponent minus()");
        number--;
        log.debug("PrototypeComponent number = " + this.number);
    }

    public void print() {
        log.debug("PrototypeComponent print()");
        log.debug("PrototypeComponent number = " + this.number);
    }
}
