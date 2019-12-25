package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO:data transfter object
 * @author cj
 * @date 2019/12/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO {
    private Integer id;
    private String username;
}
