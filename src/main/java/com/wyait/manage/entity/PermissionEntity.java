package com.wyait.manage.entity;

import java.util.Date;

public class PermissionEntity {
    private Long id;
    /** 菜单名称 */
    private String name;
    /** 父菜单id */
    private Long pid;
    /** 菜单排序 */
    private Integer zindex;
    /** 权限分类（0 菜单；1 功能） */
    private Integer type;
    /** 描述 */
    private String descpt;
    /** 菜单编号 */
    private String code;
    /** 菜单图标名称 */
    private String icon;
    /** 菜单url */
    private String url;
    /** 创建时间 */
    private Date createTime;
    /** 修改时间 */
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getZindex() {
        return zindex;
    }

    public void setZindex(Integer zindex) {
        this.zindex = zindex;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescpt() {
        return descpt;
    }

    public void setDescpt(String descpt) {
        this.descpt = descpt == null ? null : descpt.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}