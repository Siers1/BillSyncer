package com.siersi.consumptionbill.mapper;

import com.mybatisflex.core.BaseMapper;
import com.siersi.consumptionbill.entity.UserBill;

/**
 * 用户账单关联数据访问层接口
 * 继承MyBatis-Flex的BaseMapper，提供用户账单关联实体的基础CRUD操作
 * 用于管理用户与账单之间的多对多关联关系及角色权限
 * 
 * @author siersi
 * @version 1.0
 */
public interface UserBillMapper extends BaseMapper<UserBill> {
}
