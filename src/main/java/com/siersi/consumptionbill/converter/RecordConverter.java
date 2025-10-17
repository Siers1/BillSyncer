package com.siersi.consumptionbill.converter;

import com.siersi.consumptionbill.dto.AddRecordRequest;
import com.siersi.consumptionbill.dto.UpdateRecordRequest;
import com.siersi.consumptionbill.vo.RecordVo;
import com.siersi.consumptionbill.entity.Record;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 消费记录对象转换器接口
 * 使用MapStruct框架实现不同层次对象之间的转换
 * 负责消费记录实体和VO之间的相互转换
 * 
 * @author siersi
 * @version 1.0
 */
@Mapper
public interface RecordConverter {
    
    /**
     * 转换器实例，用于获取转换器的实现
     */
    RecordConverter INSTANCE = Mappers.getMapper(RecordConverter.class);

    /**
     * 将消费记录视图对象转换为消费记录实体
     * 
     * @param recordVo 消费记录视图对象
     * @return 消费记录实体对象
     */
    Record ToRecord(RecordVo recordVo);

    /**
     * 将消费记录实体转换为消费记录视图对象
     * 
     * @param record 消费记录实体对象
     * @return 消费记录视图对象
     */
    RecordVo ToRecordVo(Record record);

    Record ToRecord(AddRecordRequest addRecordRequest);

    Record ToRecord(UpdateRecordRequest updateRecordRequest);
}
