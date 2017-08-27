package liu.controller;


import liu.po.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class UserController1 implements Controller {
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
    
        ArrayList<User> userArrayList = new ArrayList<User>();
        
        User user1 = new User();
        user1.setEmail("11@11.com");
        user1.setPassword("11");
        user1.setUsername("liu");
    
        User user2 = new User();
        user2.setEmail("22@22.com");
        user2.setPassword("22");
        user2.setUsername("xiao");
        
        userArrayList.add(user1);
        userArrayList.add(user2);
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userlist",userArrayList);
        modelAndView.setViewName("/WEB-INF/jsp/user/userlist.jsp");
        
        return modelAndView;
    }
}
