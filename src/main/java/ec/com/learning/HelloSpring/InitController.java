
package ec.com.learning.HelloSpring;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Steven
 */
@RestController
@Slf4j
public class InitController {
    
    @GetMapping("/")
    public String init(){
        log.info("Executing init controller");
        return "Hello World using Spring";
    }
}
