package com.adem.common.address;

import com.adem.common.base.type.GeneralEnumerationDefinition.*;
import com.adem.common.entity.Address;
import lombok.Data;

@Data
public class SimpleCustomerAddress implements Comparable<Address>, Cloneable {
    private Long addrId;
    private String addrLbl;
    private Long cntryId;
    private String cntryName;
    private Long stateId;
    private String stateName;
    private String addressOwnerContactName;
    private String addressDescription1;
    private String addressDescription2;
    private Long cityId;
    private String cityName;
    private String pstlCode;
    private String phoneNumber;
    private boolean allowUpdate;
    private boolean allowDelete;
    private Long sortId;
    private Long addrTpId;
    private AddressType addressType;
    private Long dataTpId;
    private Integer isPrimary;

    @Override
    public int compareTo(Address o) {
        return 0;
    }
}
