package com.siersi.consumptionbill.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Table(value = "invitation")
public class Invitation implements Serializable {

    @Id(keyType = KeyType.Auto)
    private Long id;

    private Long billId;

    private Long inviterId;

    private Long inviteeId;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Integer valid;
}
