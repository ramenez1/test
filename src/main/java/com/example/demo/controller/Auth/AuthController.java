package com.example.demo.controller.Auth;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.dto.UserInfoDTO;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    // 直接注入 Mapper
    private final UserMapper userMapper;

    @PostMapping("/login")
    public LoginResponse login( @RequestBody LoginRequest request) {

        // 使用 selectList 替代 selectOne，更加安全稳健
        List<User> users = userMapper.selectList(new LambdaQueryWrapper<User>()
                .eq(User::getUsername, request.getUsername())
                .eq(User::getRole, request.getRole())
                .eq(User::getPasswd, request.getPassword())
        );

        // 判断集合是否为空
        if (users.isEmpty()) {
            return LoginResponse.builder()
                    .success(false)
                    .message("用户名/密码/角色不匹配")
                    .build();
        }

        // 取第一条数据
        User user = users.get(0);

        // 组装返回信息
        UserInfoDTO dto = new UserInfoDTO();
        dto.setId(user.getId());
        dto.setUid(user.getUid());
        dto.setUsername(user.getUsername());
        dto.setName(user.getName());
        dto.setRole(user.getRole());
        dto.setRoleName(user.getRoleName());
        dto.setSex(user.getSex());
        dto.setCollege(user.getCollege());
        dto.setProfession(user.getProf());
        dto.setPhone(user.getPhone());
        dto.setUserClass(user.getU_class());

        return LoginResponse.builder()
                .success(true)
                .message("登录成功（简化版，无token）")
                .token(null)
                .userInfo(dto)
                .build();
    }
}