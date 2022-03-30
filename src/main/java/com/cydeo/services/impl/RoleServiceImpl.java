package com.cydeo.services.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.services.RoleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl extends AbstractMapService<RoleDTO,Long> implements RoleService {


    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(), object);
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
super.deleteById(id);
    }

    @Override
    public void delete(RoleDTO object) {
super.delete(object);
    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}
