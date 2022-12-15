package acacia.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//You could use this Request Mapping, and then take out the instances of it below, and add an empty string ""
// @RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listofOwners(){
        return "owners/index";
    }
    
}
