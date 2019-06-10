package service;

import api.IUserService;

/**
 * Author:曾志鹏
 * Date:2019/6/7
 * Time:9:51
 */
//快捷键是 ALT + INSERT  快速的的实现接口中的方法
public class UserServiceImpl implements IUserService {

    @Override
    public String say() {
        return "hello world!!!";
    }
}
