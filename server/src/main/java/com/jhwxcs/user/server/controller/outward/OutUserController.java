package com.jhwxcs.user.server.controller.outward;

import com.jhwxcs.user.server.dao.UserDTO;
import com.jhwxcs.user.server.form.UserForm;
import com.jhwxcs.user.server.service.UserService;
import com.jhwxcs.user.server.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
@Api(value = "员工相关接口（对外）", tags = "员工相关接口（对外）")
public class OutUserController {

    @Resource
    private UserService userService;

    @GetMapping("/addUser")
    @ApiOperation(value="添加用户", notes="添加用户")
    private Integer addUser(@RequestBody @Valid UserForm userForm) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userForm, userDTO);
        return userService.addUser(userDTO);
    }

}
