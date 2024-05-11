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


import com.dao.PingjiafankuiDao;
import com.entity.PingjiafankuiEntity;
import com.service.PingjiafankuiService;
import com.entity.vo.PingjiafankuiVO;
import com.entity.view.PingjiafankuiView;

@Service("pingjiafankuiService")
public class PingjiafankuiServiceImpl extends ServiceImpl<PingjiafankuiDao, PingjiafankuiEntity> implements PingjiafankuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingjiafankuiEntity> page = this.selectPage(
                new Query<PingjiafankuiEntity>(params).getPage(),
                new EntityWrapper<PingjiafankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingjiafankuiEntity> wrapper) {
		  Page<PingjiafankuiView> page =new Query<PingjiafankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingjiafankuiVO> selectListVO(Wrapper<PingjiafankuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingjiafankuiVO selectVO(Wrapper<PingjiafankuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingjiafankuiView> selectListView(Wrapper<PingjiafankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingjiafankuiView selectView(Wrapper<PingjiafankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
