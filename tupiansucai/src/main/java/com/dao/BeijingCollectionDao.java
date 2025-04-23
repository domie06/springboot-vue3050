package com.dao;

import com.entity.BeijingCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BeijingCollectionView;

/**
 * 高清背景收藏 Dao 接口
 *
 * @author 
 */
public interface BeijingCollectionDao extends BaseMapper<BeijingCollectionEntity> {

   List<BeijingCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
