package spring_auth.http.controllers;

import spring_auth.entities.User;
import spring_auth.http.services.AuthService;
import spring_auth.utils.AppLogger;
import spring_auth.utils.RedirectHandler;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@Aspect
@Component
public class AuthController {

    @Autowired
    private AuthService authService;

    public ModelAndView signUp(User user) {
        try {
            User newUser = authService.signUp(user);
            if (newUser == null) return RedirectHandler.redirectWithError("auth/signup","Failed to add user",HttpStatus.UNPROCESSABLE_ENTITY );
        } catch (Exception e) {
            AppLogger.error(Arrays.toString(e.getStackTrace()));
            return RedirectHandler.redirectWithError("auth/signup", e.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return RedirectHandler.redirect("auth/login", "Account created successfully", HttpStatus.OK);
    }

    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response){
        try {
            authService.logout(request,response);
            return new ModelAndView("index", HttpStatus.OK);
        } catch (Exception e) {
            AppLogger.error(Arrays.toString(e.getStackTrace()));
            return RedirectHandler.redirectWithError("serverError", e.getLocalizedMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
