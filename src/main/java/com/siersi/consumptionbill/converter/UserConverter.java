package com.siersi.consumptionbill.converter;

import com.siersi.consumptionbill.dto.UserDTO;
import com.siersi.consumptionbill.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    User toUser(UserDTO userDTO);
}
