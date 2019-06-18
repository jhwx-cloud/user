package com.jhwxcs.user.client;

import com.jhwxcs.user.common.api.UserAPI;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("user")
public interface UserClient extends UserAPI {
}
