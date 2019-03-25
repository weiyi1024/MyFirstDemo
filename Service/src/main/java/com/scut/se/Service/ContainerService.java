package com.scut.se.Service;

import com.scut.se.Dao.dao.ContainerMapper;
import com.scut.se.Dao.entity.Container;
import com.scut.se.Dao.entity.ContainerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContainerService {

    @Autowired
    private ContainerMapper containerMapper;

    public Container getContainerByName(String name){
        ContainerExample example = new ContainerExample();
        example.createCriteria().andNameEqualTo(name);
        List<Container> result = containerMapper.selectByExample(example);
        return result.isEmpty() ? null : result.get(0);
    }
}
