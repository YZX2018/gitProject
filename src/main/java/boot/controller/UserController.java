package boot.controller;

import boot.dto.UserDTO;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;

@Controller
public class UserController {
    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(@Valid UserDTO user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return bindingResult.getAllErrors().get(0).getDefaultMessage();
        }

        return user.toString();
    }

    public static void main(String[] args) {
	// ///
        long time = DateUtils.addMinutes(new Date(), 1).getTime();
        System.out.println(new Date().getTime()-time);
    }
}
