package com.adem.common.base.type;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class GeneralEnumerationDefinition {
    public GeneralEnumerationDefinition() {
    }
    public enum AddressType {
        Installation,
        Customer,
        Billing,
        Shipment,
        Consumer,
        Contact,
        Party,
        CustomerPrimaryAddress,
        CustomerNonPrimaryAddress;
    }
}
