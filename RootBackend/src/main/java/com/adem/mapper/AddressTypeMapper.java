package com.adem.mapper;

import com.adem.common.base.type.GeneralEnumerationDefinition;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressTypeMapper {
    String toString(GeneralEnumerationDefinition.AddressType addressType);
}
