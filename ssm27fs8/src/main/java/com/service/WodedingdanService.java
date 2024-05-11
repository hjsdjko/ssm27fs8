package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodedingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodedingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodedingdanView;


/**
 * 我的订单
 *
 * @author 
 * @email 
 * @date 2022-03-15 16:31:57
 */
public interface WodedingdanService extends IService<WodedingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodedingdanVO> selectListVO(Wrapper<WodedingdanEntity> wrapper);
   	
   	WodedingdanVO selectVO(@Param("ew") Wrapper<WodedingdanEntity> wrapper);
   	
   	List<WodedingdanView> selectListView(Wrapper<WodedingdanEntity> wrapper);
   	
   	WodedingdanView selectView(@Param("ew") Wrapper<WodedingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodedingdanEntity> wrapper);
   	

}

