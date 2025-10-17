package com.siersi.consumptionbill.enums;

import lombok.Getter;

/**
 * 用户账单角色枚举
 * 定义用户在账单中的不同角色类型
 * 用于控制用户在共享账单中的权限
 * 
 * @author siersi
 * @version 1.0
 */
@Getter
public enum UserBillRole {

    /**
     * 创建者角色，拥有账单的最高权限
     */
    CREATOR(0),
    
    /**
     * 管理员角色，拥有账单的管理权限
     */
    MANAGER(1),
    
    /**
     * 普通成员角色，拥有账单的基本查看和记录权限
     */
    MEMBER(2);

    /**
     * 角色ID
     */
    private final Integer roleId;

    /**
     * 构造方法
     * 
     * @param roleId 角色ID
     */
    UserBillRole(int roleId) {
        this.roleId = roleId;
    }
}
