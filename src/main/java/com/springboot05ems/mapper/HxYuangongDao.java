package com.springboot05ems.mapper;

import com.springboot05ems.entity.HxYuangong;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (HxYuangong)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-07 17:03:22
 */
public interface HxYuangongDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    List<HxYuangong> queryById(HxYuangong hxYuangong);

//    /**
//     * 查询指定行数据
//     *
//     * @param hxYuangong 查询条件
//     * @param pageable         分页对象
//     * @return 对象列表
//     */
//    List<HxYuangong> queryAllByLimit(HxYuangong hxYuangong, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param hxYuangong 查询条件
     * @return 总行数
     */
    long count(HxYuangong hxYuangong);

    /**
     * 新增数据
     *
     * @param hxYuangong 实例对象
     * @return 影响行数
     */
    int insert(HxYuangong hxYuangong);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<HxYuangong> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<HxYuangong> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<HxYuangong> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<HxYuangong> entities);

    /**
     * 修改数据
     *
     * @param hxYuangong 实例对象
     * @return 影响行数
     */
    int update(HxYuangong hxYuangong);

    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    int deleteById( );

}

