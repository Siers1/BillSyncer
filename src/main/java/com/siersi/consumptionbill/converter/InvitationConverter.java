package com.siersi.consumptionbill.converter;

import com.siersi.consumptionbill.dto.InvitationRequest;
import com.siersi.consumptionbill.entity.Invitation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InvitationConverter {
    InvitationConverter INSTANCE = Mappers.getMapper(InvitationConverter.class);

    Invitation toInvitation(InvitationRequest invitationRequest);
}
