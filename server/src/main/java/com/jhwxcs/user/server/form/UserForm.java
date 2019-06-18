package com.jhwxcs.user.server.form;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserForm {

    @NotEmpty(message = "员工姓名不能为NULL或者空字符串")
    private String name;

    @NotNull(message = "年龄不能为NULL")
    private Integer age;

    @NotNull(message = "性别不能为NULL")
    private Integer gender;

    /**
     * @return 性别是否属于男和女
     */
    @AssertTrue
    public Boolean judgeGender() {
        return gender == 1 || gender == 2 ? true : false;
    }

}
