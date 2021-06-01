package pro.junseok.sample.beanscope.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SingletonComponent {

    private int number = 0;

    public void plus() {
        log.debug("SingletonComponent number = " + this.number);
        log.debug("SingletonComponent plus()");
        number++;
        log.debug("SingletonComponent number = " + this.number);
    }

    public void minus() {
        log.debug("SingletonComponent number = " + this.number);
        log.debug("SingletonComponent minus()");
        number--;
        log.debug("SingletonComponent number = " + this.number);
    }

    public void print() {
        log.debug("SingletonComponent print()");
        log.debug("SingletonComponent number = " + this.number);
    }
}
