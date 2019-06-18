package com.jhwxcs.user.server.controller.inward;

import com.jhwxcs.user.common.api.UserAPI;
import com.jhwxcs.user.server.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "员工相关接口（对内）", tags = "员工相关接口（对内）")
public class InUserController implements UserAPI {

    @Resource
    private UserService userService;

}
