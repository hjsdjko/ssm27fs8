package com.entity.view;

import com.entity.WodedingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-15 16:31:57
 */
@TableName("wodedingdan")
public class WodedingdanView  extends WodedingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodedingdanView(){
	}
 
 	public WodedingdanView(WodedingdanEntity wodedingdanEntity){
 	try {
			BeanUtils.copyProperties(this, wodedingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
