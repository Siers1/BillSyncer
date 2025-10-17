package com.siersi.consumptionbill.service.User;

import com.mybatisflex.core.service.IService;
import com.siersi.consumptionbill.dto.LoginRequest;
import com.siersi.consumptionbill.dto.PasswordDTO;
import com.siersi.consumptionbill.dto.UserDTO;
import com.siersi.consumptionbill.entity.User;
import com.siersi.consumptionbill.vo.UserVo;

/**
 * 用户服务接口
 * 定义用户相关的业务操作，包括注册、登录、用户信息查询等功能
 * 
 * @author siersi
 * @version 1.0
 */
public interface UserService extends IService<User> {
    
    /**
     * 用户注册
     * 
     * @param loginRequest 包含账号密码的登录请求对象
     */
    void register(LoginRequest loginRequest);

    /**
     * 用户登录验证
     * 
     * @param loginRequest 包含账号密码的登录请求对象
     */
    void login(LoginRequest loginRequest);

    void updateUser(UserDTO userDTO);

    void changePassword(PasswordDTO passwordDTO, String authorization);

    /**
     * 根据账号获取用户ID
     * 
     * @param account 用户账号
     * @return 用户ID
     */
    Long getIdByAccount(String account);

    /**
     * 根据授权令牌获取用户ID
     * 
     * @param authorization 授权令牌
     * @return 用户ID
     */
    Long getIdByAuthorization(String authorization);

    /**
     * 根据用户ID获取用户详细信息
     * 
     * @param id 用户ID
     * @return 用户视图对象
     */
    UserVo getUserById(Long id);
}
