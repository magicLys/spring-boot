package com.lys.entity;

import java.util.Date;

public class PermissionEntity {
    private String permsId;

    private String permsName;

    private String permsDesc;

    private String parentId;

    private Long permsOrder;

    private Long permsLevel;

    private String action;

    private String asMenu;

    private String asAccess;

    private String lockFlag;

    private Date createDate;

    private String createUser;

    private Date updateDate;

    private String updateUser;

    public String getPermsId() {
        return permsId;
    }

    public void setPermsId(String permsId) {
        this.permsId = permsId == null ? null : permsId.trim();
    }

    public String getPermsName() {
        return permsName;
    }

    public void setPermsName(String permsName) {
        this.permsName = permsName == null ? null : permsName.trim();
    }

    public String getPermsDesc() {
        return permsDesc;
    }

    public void setPermsDesc(String permsDesc) {
        this.permsDesc = permsDesc == null ? null : permsDesc.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Long getPermsOrder() {
        return permsOrder;
    }

    public void setPermsOrder(Long permsOrder) {
        this.permsOrder = permsOrder;
    }

    public Long getPermsLevel() {
        return permsLevel;
    }

    public void setPermsLevel(Long permsLevel) {
        this.permsLevel = permsLevel;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getAsMenu() {
        return asMenu;
    }

    public void setAsMenu(String asMenu) {
        this.asMenu = asMenu == null ? null : asMenu.trim();
    }

    public String getAsAccess() {
        return asAccess;
    }

    public void setAsAccess(String asAccess) {
        this.asAccess = asAccess == null ? null : asAccess.trim();
    }

    public String getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(String lockFlag) {
        this.lockFlag = lockFlag == null ? null : lockFlag.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}