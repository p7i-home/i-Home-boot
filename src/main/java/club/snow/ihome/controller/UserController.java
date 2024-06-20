package club.snow.ihome.controller;

import club.snow.ihome.bean.BaseResult;
import club.snow.ihome.bean.dto.UserLoginDTO;
import club.snow.ihome.bean.req.SignInReq;
import club.snow.ihome.bean.req.SignUpReq;
import club.snow.ihome.service.TokenService;
import club.snow.ihome.service.web.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * The type UserLoginController.
 *
 * @author <a href="mailto:pengdahai216@126.com">pengdahai</a>
 * @date 2024.4.21
 */
@RestController()
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private TokenService tokenService;
    
    @PostMapping("/sign-in")
    public BaseResult<Map<String, Object>> signIn(@RequestBody SignInReq signInReq) {
        UserLoginDTO userLoginDTO = loginService.signIn(signInReq);
        return BaseResult.ok(tokenService.createToken(userLoginDTO));
    }

    @PostMapping("/sign-up")
    public BaseResult<Boolean> singUp(@RequestBody SignUpReq signUpReq) {

        return BaseResult.ok();
    }

    @PostMapping("/sign-out")
    public BaseResult<Boolean> singOut() {

        return BaseResult.ok(tokenService.singOut());
    }
}
