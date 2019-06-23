package com.oneplatform.organisation.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeesuite.common.util.AssertUtil;
import com.jeesuite.common.util.BeanUtils;
import com.oneplatform.organisation.dao.entity.DepartmentEntity;
import com.oneplatform.organisation.dao.mapper.DepartmentEntityMapper;

/**
 * generated by www.jeesuite.com
 */
@Service
public class DepartmentService {

	@Autowired
	private DepartmentEntityMapper departmentMapper;

	public void addDepartment(DepartmentEntity entity) {
		departmentMapper.insertSelective(entity);
	}

	public void updateDepartment(DepartmentEntity entity) {
		DepartmentEntity originEntity = departmentMapper.selectByPrimaryKey(entity.getId());
		AssertUtil.notNull(originEntity);
		BeanUtils.copy(entity, originEntity);
		departmentMapper.updateByPrimaryKey(originEntity);
	}
	
	public void deleteDepartment(Integer id) {
		departmentMapper.deleteByPrimaryKey(id);
	}
	
	public DepartmentEntity findDepartmentById(Integer id){
		DepartmentEntity entity = departmentMapper.selectByPrimaryKey(id);
		AssertUtil.notNull(entity);
		return entity;
	}
	
	
	public Map<Integer, List<DepartmentEntity>> findAllActive(){
		 Map<Integer, List<DepartmentEntity>> result = new HashMap<>();
		List<DepartmentEntity> list = departmentMapper.findAllActive();
		List<DepartmentEntity> tmpList;
		for (DepartmentEntity entity : list) {
			tmpList = result.get(entity.getCompanyId());
			if(tmpList == null){
				tmpList = new ArrayList<>();
				result.put(entity.getCompanyId(), tmpList);
			}
			tmpList.add(entity);
		}
		return result;
	}


}
