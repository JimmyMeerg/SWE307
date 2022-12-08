package com.sau.voting.Controller;

import com.sau.voting.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    // The following dependency injection will be added when the Kafka module is ready.
    // You can implement your simple kafka for now.
    //@Autowired
    //private KafkaTemplate<String, Product> kafkaTemplate;

    @GetMapping("product/")
    public String getIndex(){
        return "product/index";
    }
}
