package com.dao;

import com.entity.ShangpinChuruInoutListEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinChuruInoutListView;

/**
 * 入库详情 Dao 接口
 *
 * @author 
 */
public interface ShangpinChuruInoutListDao extends BaseMapper<ShangpinChuruInoutListEntity> {

   List<ShangpinChuruInoutListView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
