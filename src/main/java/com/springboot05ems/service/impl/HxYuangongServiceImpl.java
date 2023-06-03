package com.springboot05ems.service.impl;

import com.springboot05ems.entity.HxYuangong;
import com.springboot05ems.mapper.HxCustomDao;
import com.springboot05ems.mapper.HxYuangongDao;
import com.springboot05ems.service.HxYuangongService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (HxYuangong)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 17:01:36
 */
@Service("hxYuangongService")
public class HxYuangongServiceImpl implements HxYuangongService {
    @Resource
    private HxYuangongDao hxYuangongDao;

    @Override
    public List<HxYuangong> queryById(HxYuangong hxYuangong) {
        List<HxYuangong> list =new ArrayList<>();
        list =hxYuangongDao.queryById(hxYuangong);
        return list;
    }

//    @Override
//    public Page<HxYuangong> queryByPage(HxYuangong hxYuangong, PageRequest pageRequest) {
//        return null;
//    }

    @Override
    public HxYuangong insert(HxYuangong hxYuangong) {
        return null;
    }

    @Override
    public HxYuangong update(HxYuangong hxYuangong) {
        return null;
    }

    @Override
    public boolean deleteById() {
        return false;
    }
}
