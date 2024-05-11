package com.dao;

import com.entity.WodedingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodedingdanVO;
import com.entity.view.WodedingdanView;


/**
 * 我的订单
 * 
 * @author 
 * @email 
 * @date 2022-03-15 16:31:57
 */
public interface WodedingdanDao extends BaseMapper<WodedingdanEntity> {
	
	List<WodedingdanVO> selectListVO(@Param("ew") Wrapper<WodedingdanEntity> wrapper);
	
	WodedingdanVO selectVO(@Param("ew") Wrapper<WodedingdanEntity> wrapper);
	
	List<WodedingdanView> selectListView(@Param("ew") Wrapper<WodedingdanEntity> wrapper);

	List<WodedingdanView> selectListView(Pagination page,@Param("ew") Wrapper<WodedingdanEntity> wrapper);
	
	WodedingdanView selectView(@Param("ew") Wrapper<WodedingdanEntity> wrapper);
	

}
