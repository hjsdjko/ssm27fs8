package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodezhaopianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodezhaopianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodezhaopianView;


/**
 * 我的照片
 *
 * @author 
 * @email 
 * @date 2022-03-15 16:31:57
 */
public interface WodezhaopianService extends IService<WodezhaopianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodezhaopianVO> selectListVO(Wrapper<WodezhaopianEntity> wrapper);
   	
   	WodezhaopianVO selectVO(@Param("ew") Wrapper<WodezhaopianEntity> wrapper);
   	
   	List<WodezhaopianView> selectListView(Wrapper<WodezhaopianEntity> wrapper);
   	
   	WodezhaopianView selectView(@Param("ew") Wrapper<WodezhaopianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodezhaopianEntity> wrapper);
   	

}

