package sid.org.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"", "/", "/index"})
    public String ownerIndex(){
        return "owners/index";
    }
}
