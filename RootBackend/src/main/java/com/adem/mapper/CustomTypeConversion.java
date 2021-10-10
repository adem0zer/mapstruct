package com.adem.mapper;

import org.mapstruct.Mapper;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Mapper(componentModel = "spring")
public interface CustomTypeConversion {
    default boolean intToBoolean(int value) {
        return value != 0;
    }

    default boolean integerToBoolean(Integer value) {
        if (Objects.isNull(value))
            return false;
        return value != 0;
    }

    default int booleanToInt(boolean bool) {
        return bool ? 1 : 0;
    }

    default String intToString(int value) {
        return Integer.toString(value);
    }

    default Timestamp dataToSqlTimeStamp(Date date) {
        if (Objects.isNull(date))
            return null;
        long milliseconds = date.getTime();
        return new Timestamp(milliseconds);
    }

    default Date sqlTimeStampToDate(Timestamp timestamp) {
        return new Date(timestamp.getTime());
    }
}