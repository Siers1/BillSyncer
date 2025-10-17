package com.siersi.consumptionbill.utils;

import lombok.Data;

/**
 * 分页参数封装类
 * 用于封装分页查询的相关参数，包括页码、页大小和查询参数
 * 
 * @param <T> 查询参数的泛型类型
 * @author siersi
 * @version 1.0
 */
@Data
public class PageParam<T> {
    
    /**
     * 默认页码
     */
    private static int PAGE_NUM = 1;
    
    /**
     * 默认页大小
     */
    private static int PAGE_SIZE = 10;

    /**
     * 当前页码，默认为第1页
     */
    private int pageNum = PAGE_NUM;
    
    /**
     * 每页记录数，默认为10条
     */
    private int pageSize = PAGE_SIZE;

    /**
     * 查询参数对象，可包含各种筛选条件
     */
    private T params;
}
