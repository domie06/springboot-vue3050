package com.dao;

import com.entity.BeijingXiazaijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BeijingXiazaijiluView;

/**
 * 高清背景下载记录 Dao 接口
 *
 * @author 
 */
public interface BeijingXiazaijiluDao extends BaseMapper<BeijingXiazaijiluEntity> {

   List<BeijingXiazaijiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
