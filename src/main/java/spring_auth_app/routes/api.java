package spring_auth_app.routes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring_auth_app.http.controllers.AuthController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class api {
    @PostMapping("login")
    public static String login(HttpServletRequest req, @RequestParam("email") String email, @RequestParam("password") String password, Model m){
        return AuthController.login(req, email, password, m);
    }
}
