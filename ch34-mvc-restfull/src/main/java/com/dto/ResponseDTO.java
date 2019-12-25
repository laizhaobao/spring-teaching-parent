package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cj
 * @date 2019/12/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO<T> {

    private String code;
    private String msg;
    private T data;

}
