package com.jhwxcs.user.common.input;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "员工根据id查询的input对象")
public class UserByIdInput {

    private Integer id;

}
