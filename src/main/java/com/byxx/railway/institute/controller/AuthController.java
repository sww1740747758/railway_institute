package com.byxx.railway.institute.controller;


import com.byxx.railway.institute.common.result.Result;
import com.byxx.railway.institute.security.jwt.JwtTokenManager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@Api(tags = "认证管理")
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;

    private final JwtTokenManager jwtTokenManager;

    @ApiOperation(value = "登录",notes = "生成token")
    @PostMapping("/login")
    public Result login(
            @RequestParam String username,
            @RequestParam String password
    ) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username,
                password);
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        // 生成token
        String token = jwtTokenManager.createToken(authentication);
        return Result.success("Bearer " + token);
    }

    @ApiOperation(value = "注销")
    @DeleteMapping("/logout")
    public Result login() {
        SecurityContextHolder.clearContext();
        return Result.success("注销成功");
    }

}
