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


import com.dao.WodezhaopianDao;
import com.entity.WodezhaopianEntity;
import com.service.WodezhaopianService;
import com.entity.vo.WodezhaopianVO;
import com.entity.view.WodezhaopianView;

@Service("wodezhaopianService")
public class WodezhaopianServiceImpl extends ServiceImpl<WodezhaopianDao, WodezhaopianEntity> implements WodezhaopianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodezhaopianEntity> page = this.selectPage(
                new Query<WodezhaopianEntity>(params).getPage(),
                new EntityWrapper<WodezhaopianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodezhaopianEntity> wrapper) {
		  Page<WodezhaopianView> page =new Query<WodezhaopianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodezhaopianVO> selectListVO(Wrapper<WodezhaopianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodezhaopianVO selectVO(Wrapper<WodezhaopianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodezhaopianView> selectListView(Wrapper<WodezhaopianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodezhaopianView selectView(Wrapper<WodezhaopianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
