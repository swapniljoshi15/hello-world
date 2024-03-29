package hello


import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ComponentScan


/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author saung
 * @since 1.0
 */

@Controller
@Configuration
@EnableAutoConfiguration
@ComponentScan
class HelloConfig {

        @RequestMapping(Array("/"))
        @ResponseBody
        def home(): String = "Hello World!"

}

