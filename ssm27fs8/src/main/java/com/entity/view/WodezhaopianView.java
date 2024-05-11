package com.entity.view;

import com.entity.WodezhaopianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的照片
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-15 16:31:57
 */
@TableName("wodezhaopian")
public class WodezhaopianView  extends WodezhaopianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodezhaopianView(){
	}
 
 	public WodezhaopianView(WodezhaopianEntity wodezhaopianEntity){
 	try {
			BeanUtils.copyProperties(this, wodezhaopianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
