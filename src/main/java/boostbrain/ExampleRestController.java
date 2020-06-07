package boostbrain;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
import java.awt.*;

@RestController
public class ExampleRestController {
    public static class RestResponse {
        private String parameter1;
        private String parameter2;

        public String getParameter1() {
            return parameter1;
        }

        public void setParameter1(String parameter1) {
            this.parameter1 = parameter1;
        }

        public String getParameter2() {
            return parameter2;
        }

        public void setParameter2(String parameter2) {
            this.parameter2 = parameter2;
        }

    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse restMethod(String name) {
        RestResponse result = new RestResponse();
        result.setParameter1("Hello");
        result.setParameter2(name);

        return result;
    }
}
