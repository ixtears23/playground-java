package pro.junseok.sample.beanscope.controller;

import com.ibdata.sample.beanscope.component.PrototypeComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Scope(scopeName = "prototype")
@RestController
@RequestMapping("/bean/scope/prototype")
public class BeanScopePrototypeController {

    private PrototypeComponent prototypeComponent;

    @Autowired
    public void setPrototypeComponent(PrototypeComponent prototypeComponent) {
        this.prototypeComponent = prototypeComponent;
    }

    @GetMapping("/prototype/plus")
    public void prototypePlus() {
        log.debug("BeanScopePrototypeController ::: {}", this);
        log.debug("prototypePlus ::: {}", prototypeComponent);
        prototypeComponent.plus();
    }
    @GetMapping("/prototype/minus")
    public void prototypeMinus() {
        log.debug("BeanScopePrototypeController ::: {}", this);
        log.debug("prototypeMinus ::: {}", prototypeComponent);
        prototypeComponent.minus();
    }
    @GetMapping("/prototype/print")
    public void prototypePrint() {
        log.debug("BeanScopePrototypeController ::: {}", this);
        log.debug("prototypePrint ::: {}", prototypeComponent);
        prototypeComponent.print();
    }
}
