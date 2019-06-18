package com.jhwxcs.user.common.api;

import com.jhwxcs.user.common.input.UserByIdInput;
import com.jhwxcs.user.common.output.UserOutput;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/inward/user")
public interface UserAPI {

    UserOutput getUserById(@RequestBody UserByIdInput userByIdInput);

}
