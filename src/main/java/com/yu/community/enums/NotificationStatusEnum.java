package com.yu.community.enums;

/**
 * @author yu
 * @Description
 * @create 2019-10-27-15:20
 */
public enum NotificationStatusEnum {
    UNREAD(0),READ(1)
    ;
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
