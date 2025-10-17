package com.siersi.consumptionbill.service.Record;

import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.service.IService;
import com.siersi.consumptionbill.dto.AddRecordRequest;
import com.siersi.consumptionbill.dto.RecordDTO;
import com.siersi.consumptionbill.dto.UpdateRecordRequest;
import com.siersi.consumptionbill.entity.Record;
import com.siersi.consumptionbill.utils.PageParam;
import com.siersi.consumptionbill.vo.RecordVo;

import java.util.List;

/**
 * 消费记录服务接口
 * 定义消费记录相关的业务操作，包括查询消费记录等功能
 * 
 * @author siersi
 * @version 1.0
 */
public interface RecordService extends IService<Record> {
    
    /**
     * 获取消费记录列表（分页查询）
     * 
     * @param pageParam 分页参数对象，包含页码、页大小等信息
     * @return 消费记录列表的分页结果
     */
    Page<RecordVo> getRecords(PageParam<RecordDTO> pageParam);

    /**
     * 向账单添加消费记录
     *
     * @param addRecordRequest 添加记录请求对象，包含消费记录的详细信息
     */
    void addRecordToBill(AddRecordRequest addRecordRequest);

    void updateRecord(UpdateRecordRequest updateRecordRequest);
}
