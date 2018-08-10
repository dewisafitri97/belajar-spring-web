package com.flashdin.belajarspringweb.service.impl;

import com.flashdin.belajarspring.dao.ProfileDAO;
import com.flashdin.belajarspring.dao.impl.ProfileDAOImpl;
import com.flashdin.belajarspring.entity.Profile;
import com.flashdin.belajarspring.service.ProfileSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileSevice {

    @Autowired
    private ProfileDAO profileDAO = new ProfileDAOImpl();

    @Override
    public Profile save(@RequestBody Profile param) {
        return profileDAO.save(param);
    }

    @Override
    public Profile update(@RequestBody Profile param) {
        return profileDAO.update(param);
    }

    @Override
    public int delete(@RequestBody Profile param) {
        return profileDAO.delete(param);
    }

    @Override
    public Profile findById(@PathVariable int id) {
        return profileDAO.findById(id);
    }

    @Override
    public List<Profile> findAll() {
        return profileDAO.findAll();
    }
}
