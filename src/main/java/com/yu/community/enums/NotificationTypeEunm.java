package com.yu.community.enums;

/**
 * @author yu
 * @Description
 * @create 2019-10-27-14:26
 */
public enum NotificationTypeEunm {
    REPLY_QUESTION(1,"回复了问题"),
    REPLY_COMMENT(2,"回复了评论")
    ;

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    private int type;
    private String name;

    NotificationTypeEunm(int status, String name) {
        this.type = status;
        this.name = name;
    }
    public static String nameOfType(int type){
        for (NotificationTypeEunm notificationTypeEunm : NotificationTypeEunm.values()) {
            if(notificationTypeEunm.getType() == type){
                return notificationTypeEunm.getName();
            }
        }
        return "";
    }
}
