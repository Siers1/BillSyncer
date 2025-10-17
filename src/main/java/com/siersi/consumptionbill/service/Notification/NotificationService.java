package com.siersi.consumptionbill.service.Notification;

import com.mybatisflex.core.service.IService;
import com.siersi.consumptionbill.entity.Notification;

public interface NotificationService extends IService<Notification> {
    void read(Long invitationId);
}
