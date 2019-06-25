package com.oneplatform.cms.dto.param;

import com.jeesuite.mybatis.plugin.pagination.PageParams;

/**
 * generated by www.jeesuite.com
 */
public class ArticleQueryParam  extends PageParams {

    private String title;
    private Integer categoryId;
    private Boolean audited;
    private String specType;
    private Integer specTargetId;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Boolean getAudited() {
		return audited;
	}
	public void setAudited(Boolean audited) {
		this.audited = audited;
	}
	public String getSpecType() {
		return specType;
	}
	public void setSpecType(String specType) {
		this.specType = specType;
	}
	public Integer getSpecTargetId() {
		return specTargetId;
	}
	public void setSpecTargetId(Integer specTargetId) {
		this.specTargetId = specTargetId;
	}
    
    
}