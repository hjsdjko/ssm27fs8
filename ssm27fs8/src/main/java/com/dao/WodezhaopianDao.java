package com.dao;

import com.entity.WodezhaopianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodezhaopianVO;
import com.entity.view.WodezhaopianView;


/**
 * 我的照片
 * 
 * @author 
 * @email 
 * @date 2022-03-15 16:31:57
 */
public interface WodezhaopianDao extends BaseMapper<WodezhaopianEntity> {
	
	List<WodezhaopianVO> selectListVO(@Param("ew") Wrapper<WodezhaopianEntity> wrapper);
	
	WodezhaopianVO selectVO(@Param("ew") Wrapper<WodezhaopianEntity> wrapper);
	
	List<WodezhaopianView> selectListView(@Param("ew") Wrapper<WodezhaopianEntity> wrapper);

	List<WodezhaopianView> selectListView(Pagination page,@Param("ew") Wrapper<WodezhaopianEntity> wrapper);
	
	WodezhaopianView selectView(@Param("ew") Wrapper<WodezhaopianEntity> wrapper);
	

}
