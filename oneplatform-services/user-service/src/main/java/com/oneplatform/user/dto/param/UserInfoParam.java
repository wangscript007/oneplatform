package com.oneplatform.user.dto.param;

import io.swagger.annotations.ApiModelProperty;

/**
 * generated by www.jeesuite.com
 */
public class UserInfoParam{

    @ApiModelProperty("属性名")
    private Integer id;
    
    @ApiModelProperty("属性名")
    private String mobile;
    
    @ApiModelProperty("属性名")
    private String email;
    
    @ApiModelProperty("属性名")
    private String realname;
    
    @ApiModelProperty("属性名")
    private String nickname;
    
    @ApiModelProperty("属性名")
    private String avatar;
    
    @ApiModelProperty("属性名")
    private String gender;
    
    @ApiModelProperty("属性名")
    private java.util.Date birthday;
    
    @ApiModelProperty("所在行政区域ID")
    private Integer areaId;
    
    @ApiModelProperty("所在地")
    private String location;
    
    @ApiModelProperty("属性名")
    private Boolean mobileVerified;
    
    @ApiModelProperty("属性名")
    private Boolean deleted;
    
    @ApiModelProperty("属性名")
    private Boolean enabled;
    
    @ApiModelProperty("属性名")
    private java.util.Date createdAt;
    
    @ApiModelProperty("属性名")
    private java.util.Date lastLoginAt;
    
    @ApiModelProperty("属性名")
    private java.util.Date updatedAt;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public java.util.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }
    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public Boolean getMobileVerified() {
        return mobileVerified;
    }

    public void setMobileVerified(Boolean mobileVerified) {
        this.mobileVerified = mobileVerified;
    }
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
    public java.util.Date getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(java.util.Date lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}