package com.baidu.service;

import com.baidu.dao.KcInfoDao;
import com.baidu.entity.Kc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dell on 2019/7/26.
 */
@Component
public class KcService {
    @Autowired
    private KcInfoDao kcInfoDao;

    private Page<Kc>getPageKc(int pageNo, int pageSize){
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
        Page<Kc> all = kcInfoDao.findAll(pageRequest);
        return all;
    }

    @Transactional
    public void deleteById(Long id){
        kcInfoDao.deleteById(id);
    }

    @Transactional
    public void addKc(Kc kc){
       kcInfoDao.save(kc);
    }
}
