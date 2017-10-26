package cnss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "CNSS " +
        "<a href='http://www.google.fr'>Allez à www.google.fr</a> :)";
  }

}
