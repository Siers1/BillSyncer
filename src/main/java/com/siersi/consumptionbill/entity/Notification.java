package com.siersi.consumptionbill.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Table(value = "notification")
public class Notification implements Serializable {
    @Id(keyType = KeyType.Auto)
    private Long id;

    private Long userId;

    private Long invitationId;

    private Integer isRead;

    private Date createTime;

    private Date readTime;
}
