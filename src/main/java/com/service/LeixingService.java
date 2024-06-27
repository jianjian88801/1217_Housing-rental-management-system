package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LeixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LeixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LeixingView;


/**
 * 类型
 *
 * @author 
 * @email 
 * @date 2021-05-05 14:32:36
 */
public interface LeixingService extends IService<LeixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LeixingVO> selectListVO(Wrapper<LeixingEntity> wrapper);
   	
   	LeixingVO selectVO(@Param("ew") Wrapper<LeixingEntity> wrapper);
   	
   	List<LeixingView> selectListView(Wrapper<LeixingEntity> wrapper);
   	
   	LeixingView selectView(@Param("ew") Wrapper<LeixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LeixingEntity> wrapper);
   	
}

