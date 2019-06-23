package com.oneplatform.user.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.jeesuite.mybatis.core.BaseMapper;
import com.oneplatform.user.dao.entity.UserAssetsEntity;

/**
 * generated by www.jeesuite.com
 */
public interface UserAssetsEntityMapper extends BaseMapper<UserAssetsEntity,Integer> {

	@Select("SELECT * user_assets WHERE user_id = #{userId} AND enabled = 1")
	@ResultMap("BaseResultMap")
	List<UserAssetsEntity> findListByUserId(Integer userId);
}