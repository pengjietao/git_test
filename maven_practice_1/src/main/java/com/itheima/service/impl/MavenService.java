package com.itheima.service.impl;

import com.itheima.dao.MavenDao;
import com.itheima.domain.Items;
import com.itheima.service.IMavenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mavenService")
public class MavenService implements IMavenService {

    @Autowired
    private MavenDao mavenDao;


    public Items findById(Integer id) {
        System.out.println("访问到我了");
        return mavenDao.findById(id);

    }
}
