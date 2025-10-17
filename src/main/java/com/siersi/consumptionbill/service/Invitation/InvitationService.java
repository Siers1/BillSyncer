package com.siersi.consumptionbill.service.Invitation;

import com.mybatisflex.core.service.IService;
import com.siersi.consumptionbill.dto.HandleInvitationRequest;
import com.siersi.consumptionbill.dto.InvitationRequest;
import com.siersi.consumptionbill.entity.Invitation;
import com.siersi.consumptionbill.vo.InvitationVo;

import java.util.List;

public interface InvitationService extends IService<Invitation> {
    void sendInvitation(InvitationRequest invitationRequest);

    void handleInvitation(HandleInvitationRequest handleInvitationRequest, String authorization);

    Long getUnReadCount(String authorization);

    List<InvitationVo> getInvitationList(String authorization);
}
