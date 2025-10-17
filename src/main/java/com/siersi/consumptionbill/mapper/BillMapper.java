package com.siersi.consumptionbill.mapper;

import com.mybatisflex.core.BaseMapper;
import com.siersi.consumptionbill.entity.Bill;

/**
 * 账单数据访问层接口
 * 继承MyBatis-Flex的BaseMapper，提供账单实体的基础CRUD操作
 * 包含查询、插入、更新、删除等数据库操作方法
 * 
 * @author siersi
 * @version 1.0
 */
public interface BillMapper extends BaseMapper<Bill> {
}
