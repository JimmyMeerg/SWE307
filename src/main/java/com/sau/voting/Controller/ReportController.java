package com.sau.voting.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportController {
    // The following dependency injection will be added when the Kafka module is ready.
    // You can implement your simple kafka for now.
    //@Autowired
    //private KafkaTemplate<String, Product> kafkaTemplate;

    @GetMapping("report/")
    public String getIndex(){
        return "report/index";
    }
}
