package kr.ac.koreatech.devops1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  @GetMapping("/test.do")
  public String test() {
    return "test";
  }
}
