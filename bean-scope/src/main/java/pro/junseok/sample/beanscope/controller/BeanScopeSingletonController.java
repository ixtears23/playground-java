package pro.junseok.sample.beanscope.controller;

import com.ibdata.sample.beanscope.component.PrototypeComponent;
import com.ibdata.sample.beanscope.component.SingletonComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/bean/scope/singleton")
public class BeanScopeSingletonController {

    private final SingletonComponent singletonComponent;
    private PrototypeComponent prototypeComponent;

    @Autowired
    public BeanScopeSingletonController(SingletonComponent singletonComponent) {
        this.singletonComponent = singletonComponent;
    }

    @Autowired
    public void setPrototypeComponent(PrototypeComponent prototypeComponent) {
        this.prototypeComponent = prototypeComponent;
    }

    @GetMapping("/singleton/plus")
    public void singletonPlus(PrototypeComponent prototypeComponent) {
        this.setPrototypeComponent(prototypeComponent);
        log.debug("BeanScopeSingletonController ::: {}", this);
        log.debug("singletonPlus ::: {}", singletonComponent);
        singletonComponent.plus();
    }

    @GetMapping("/singleton/minus")
    public void singletonMinus(PrototypeComponent prototypeComponent) {
        this.setPrototypeComponent(prototypeComponent);
        log.debug("BeanScopeSingletonController ::: {}", this);
        log.debug("singletonMinus ::: {}", singletonComponent);
        singletonComponent.minus();
    }

    @GetMapping("/singleton/print")
    public void singletonPrint(PrototypeComponent prototypeComponent) {
        this.setPrototypeComponent(prototypeComponent);
        log.debug("BeanScopeSingletonController ::: {}", this);
        log.debug("singletonPrint ::: {}", singletonComponent);
        singletonComponent.print();
    }

    @GetMapping("/prototype/plus")
    public void prototypePlus(PrototypeComponent prototypeComponent) {
        this.setPrototypeComponent(prototypeComponent);
        log.debug("BeanScopeSingletonController ::: {}", this);
        log.debug("singletonPlus ::: {}", this.prototypeComponent);
        prototypeComponent.plus();
    }

    @GetMapping("/prototype/minus")
    public void prototypeMinus(PrototypeComponent prototypeComponent) {
        this.setPrototypeComponent(prototypeComponent);
        log.debug("BeanScopeSingletonController ::: {}", this);
        log.debug("singletonMinus ::: {}", this.prototypeComponent);
        prototypeComponent.minus();
    }

    @GetMapping("/prototype/print")
    public void prototypePrint(PrototypeComponent prototypeComponent) {
        this.setPrototypeComponent(prototypeComponent);
        log.debug("BeanScopeSingletonController ::: {}", this);
        log.debug("singletonPrint ::: {}", this.prototypeComponent);
        prototypeComponent.print();
    }
}
