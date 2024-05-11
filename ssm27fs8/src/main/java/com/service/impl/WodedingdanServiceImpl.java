package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WodedingdanDao;
import com.entity.WodedingdanEntity;
import com.service.WodedingdanService;
import com.entity.vo.WodedingdanVO;
import com.entity.view.WodedingdanView;

@Service("wodedingdanService")
public class WodedingdanServiceImpl extends ServiceImpl<WodedingdanDao, WodedingdanEntity> implements WodedingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodedingdanEntity> page = this.selectPage(
                new Query<WodedingdanEntity>(params).getPage(),
                new EntityWrapper<WodedingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodedingdanEntity> wrapper) {
		  Page<WodedingdanView> page =new Query<WodedingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodedingdanVO> selectListVO(Wrapper<WodedingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodedingdanVO selectVO(Wrapper<WodedingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodedingdanView> selectListView(Wrapper<WodedingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodedingdanView selectView(Wrapper<WodedingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
