package com.adem.mapper;

import com.adem.common.address.SimpleCustomerAddress;
import com.adem.common.entity.AddrEntity;
import org.mapstruct.*;
import org.mapstruct.control.DeepClone;

import java.util.List;

@Mapper(componentModel = "spring", mappingControl = DeepClone.class, uses = {CustomTypeConversion.class},
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface AddrEntityToSimpleCustomerAddressMapper {
    @Mappings({
            @Mapping(source = "addrCntc", target = "addressOwnerContactName"),
            @Mapping(source = "addrDesc", target = "addressDescription1"),
            @Mapping(source = "addrDesc2", target = "addressDescription2"),
            @Mapping(source = "dataTpId", target = "dataTpId"),
            @Mapping(source = "isPrm", target = "isPrimary"),
            @Mapping(source = "phnNmbr", target = "phoneNumber"),

    })
    void entityToDto(AddrEntity addrEntity,@MappingTarget SimpleCustomerAddress simpleCustomerAddress, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
    /*SimpleCustomerAddress entityToDto(AddrEntity addrEntity, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
    List<SimpleCustomerAddress> listEntitytoListDto(List<AddrEntity> addrEntities, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);


    @InheritInverseConfiguration
    AddrEntity addrEntity(SimpleCustomerAddress entityToDto, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);
*/
}