package com.nelito.ecommerce.controllers;

import com.nelito.ecommerce.dto.user.SignInDto;
import com.nelito.ecommerce.dto.user.SignInResponseDto;
import com.nelito.ecommerce.dto.user.SignupDto;
import com.nelito.ecommerce.exceptions.AuthenticationFailException;
import com.nelito.ecommerce.exceptions.CustomException;
import com.nelito.ecommerce.dto.user.SignUpResponseDto;
import com.nelito.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpResponseDto Signup(@RequestBody SignupDto signupDto) throws CustomException {
        return userService.signUp(signupDto);
    }

    @PostMapping("/signIn")
    public SignInResponseDto Signup(@RequestBody SignInDto signInDto) throws CustomException, AuthenticationFailException {
        return userService.signIn(signInDto);
    }

}