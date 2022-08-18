/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.service;

import com.portfolio.mgb.entity.Hys;
import com.portfolio.mgb.repository.RHys;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHys {
    @Autowired
    RHys rHys;
    
    public List<Hys> list(){
        return rHys.findAll();
    }
    public Optional<Hys> getOne(int id){
        return rHys.findById(id);
    }
    
    public Optional<Hys> getByHs(String hys){
        return rHys.findByHtml(hys);
    }
    
    public void save(Hys hys){
        rHys.save(hys);
    }
    
    public void delete(int id){
        rHys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHys.existsById(id);
    }
    
    public boolean existsByHys(String hys){
        return rHys.existsByHtml(hys);
    }
}
