package com.kiran.demo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {
 @RequestMapping(value = "/hello", method = RequestMethod.GET)
   public  String getdetails(){
      return "Hello world";
   }
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public  String details(){
        return "Hello world kiran";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public  String Modifydetails(@PathVariable("id") String id){
        return "Hello world " + id;
    }
}
