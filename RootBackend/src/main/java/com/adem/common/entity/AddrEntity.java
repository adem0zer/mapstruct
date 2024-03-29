package com.adem.common.entity;

import com.adem.common.entity.GnlTpEntity;
import lombok.Data;

import java.util.Date;

@Data
public class AddrEntity {
    private Long addrId;
    private Long rowId;
    private Long dataTpId;
    private String alias;
    private String addrCntc;
    private Long cityId;
    private Long subPrvncId;
    private Long dstrctId;
    private Long ngbrhdId;
    private Long strtId;
    private Long bldgId;
    private String cityName;
    private String subPrvncName;
    private String dstrctName;
    private String ngbrhdName;
    private String bldgName;
    private String avenueName;
    private String mainStrtName;
    private Long addrTpId;
    private Long createModTpId;
    private Long condoUnitId;
    private Long vlgId;
    private String vlgName;
    private Long cntryId;
    private Long stateId;
    private Long strtTpId;
    private String addrDesc;
    private String addrDesc2;
    private String addrDesc3;
    private String siteName;
    private String houseName;
    private String floorNum;
    private String doorNum;
    private Long addrLong;
    private Long addrLat;
    private Integer isPrm;
    private Integer isVld;
    private Integer isMigrated;
    private Long usgTpId;
    private String addrFreeField;
    private Integer isActv;
    private Date sdate;
    private Date edate;
    private Long addrPrflId;
    private Long domesticId;
    private String subBldg;
    private String subPrvncCode;
    private String addrLbl;
    private String extAddrType;
    private String dataLvl;
    private Long bldgNo;
    private String subBldgNo;
    private String strtName;
    private String strtTpName;
    private String strtDir;
    private String houseNum;
    private String poBoxNo;
    private String muniName;
    private String pstlCode;
    private String stateName;
    private String stateCode;
    private String cntryName;
    private String cntryCode;
    private String unitNo;
    private String strtNum;
    private String zoneUsgTp;
    private String subAddrId;
    private String extPostAddrId;
    private String extMarketingRegionId;
    private String extSimsubRegionId;
    private String extCrtcRegionId;
    private String streetNrSuffix;
    private String civicNumber;
    private String orientation;
    private String suffix;
    private String locality;
    private String subAddrTp;
    private String lclCod;
    private String lclNum;
    private GnlTpEntity usageTp;
    private String phnNmbr;
    private AddrTpEntity addressType;

}
