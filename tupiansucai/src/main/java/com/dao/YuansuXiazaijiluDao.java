package com.dao;

import com.entity.YuansuXiazaijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YuansuXiazaijiluView;

/**
 * 免扣元素下载记录 Dao 接口
 *
 * @author 
 */
public interface YuansuXiazaijiluDao extends BaseMapper<YuansuXiazaijiluEntity> {

   List<YuansuXiazaijiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
