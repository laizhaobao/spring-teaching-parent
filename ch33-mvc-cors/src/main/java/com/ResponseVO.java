package com;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cj
 * @date 2019/12/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseVO {
    private String code;
    private String msg;
    private Object data;

}
