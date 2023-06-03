package com.springboot05ems.mapper;

import com.springboot05ems.entity.HxCustom;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (HxCustom)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-01 03:02:38
 */
public interface HxCustomDao {

    /**
     * 通过ID查询单条数据
     *
     * @param hx_hxCustomId 主键
     * @return 实例对象
     */
    HxCustom queryById(String hx_hxCustomId);

    /**
     * 查询指定行数据
     *
     * @param hxCustom 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
   // List<HxCustom> queryAllByLimit(HxCustom hxCustom, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param hxCustom 查询条件
     * @return 总行数
     */
    long count(HxCustom hxCustom);

    /**
     * 新增数据
     *
     * @param hxCustom 实例对象
     * @return 影响行数
     */
    int insert(HxCustom hxCustom);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<HxCustom> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<HxCustom> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<HxCustom> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<HxCustom> entities);

    /**
     * 修改数据
     *
     * @param hxCustom 实例对象
     * @return 影响行数
     */
    int update(HxCustom hxCustom);

    /**
     * 通过主键删除数据
     *
     * @param hx_hxCustomId 主键
     * @return 影响行数
     */
    int deleteById(String hx_hxCustomId);

}

