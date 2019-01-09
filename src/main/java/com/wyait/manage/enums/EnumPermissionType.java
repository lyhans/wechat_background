package com.wyait.manage.enums;

/**
 * <p>
 *
 * @author <a href="mailto:lyhans@yeah.net">Young</a>
 * @version 2019/1/10 0:12
 */
public enum EnumPermissionType {
    ;

    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EnumPermissionType get(Integer code){
        for(EnumPermissionType enumPermissionType:EnumPermissionType.values()){
            if(enumPermissionType.code.equals(code)){
                return enumPermissionType;
            }
        }
        return null;
    }
}
