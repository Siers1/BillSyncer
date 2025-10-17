package com.siersi.consumptionbill.converter;

import com.siersi.consumptionbill.dto.UserBillDTO;
import com.siersi.consumptionbill.entity.UserBill;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserBillConverter {
    UserBillConverter INSTANCE = Mappers.getMapper(UserBillConverter.class);

    UserBill ToUserBill(UserBillDTO userBillDTO);
}
