package com.itheima.service;


import com.itheima.domain.Items;
import org.springframework.stereotype.Service;


public interface IMavenService {


    public Items findById(Integer id);

}
