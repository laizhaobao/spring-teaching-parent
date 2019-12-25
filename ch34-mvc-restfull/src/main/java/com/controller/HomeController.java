package com.controller;

import com.dto.ResponseDTO;
import com.dto.UserInfoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cj
 * @date 2019/12/25
 */
@RestController
@CrossOrigin(value = {"http://127.0.0.1:8848"},
        methods = {
        RequestMethod.DELETE,
        RequestMethod.PUT,
        RequestMethod.POST,
        RequestMethod.GET,
        RequestMethod.OPTIONS,
        RequestMethod.HEAD
})
@Api(tags = "users")
public class HomeController {
//:/users
    @GetMapping("/users")
    @ApiOperation("获取所有用户信息")
    public ResponseDTO listAllUsers(){
        List<UserInfoDTO> list = new ArrayList<>();
        list.add(new UserInfoDTO(1, "aaa"));
        list.add(new UserInfoDTO(2, "bbb"));
        return new ResponseDTO("200","ok",
                list);
    }
    @ApiOperation("获取某一个用户信息")
    @GetMapping("/users/{id}")
    public ResponseDTO getById(@PathVariable int id){
        System.out.println("-----debug: id = " + id);
        return new ResponseDTO("200","ok",
                new UserInfoDTO(1, "aaaa"));
    }

    @DeleteMapping ("/users/{id}")
    public  ResponseDTO deleteById(@PathVariable int id){
        System.out.println("-----debug: id = " + id);
        return new ResponseDTO("200","ok",true);
    }

    @PutMapping("/users/{id}")
    public  ResponseDTO updateById(@PathVariable int id,@RequestBody UserInfoDTO userInfoDTO){
        System.out.println("-----debug: id = " + id);
        System.out.println("-----debug: userInfoDTO = " + userInfoDTO);

        return new ResponseDTO("200","ok",true);
    }

    @PostMapping("/users")
    public ResponseDTO insert(UserInfoDTO userInfoDTO){
        System.out.println("-----debug: userInfoDTO = " + userInfoDTO);
        return new ResponseDTO("200","ok",true);
    }
}
