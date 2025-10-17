package com.siersi.consumptionbill.mapper;

import com.mybatisflex.core.BaseMapper;
import com.siersi.consumptionbill.vo.RecordVo;

/**
 * 消费记录视图对象数据访问层接口
 * 继承MyBatis-Flex的BaseMapper，提供消费记录视图对象的数据库操作
 * 主要用于复杂查询和分页查询，返回消费记录的视图数据
 * 
 * @author siersi
 * @version 1.0
 */
public interface RecordVoMapper extends BaseMapper<RecordVo> {
}
