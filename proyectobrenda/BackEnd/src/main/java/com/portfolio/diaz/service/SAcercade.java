/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.diaz.service;
import com.portfolio.diaz.entity.Acercade;
import com.portfolio.diaz.repository.RAcercade;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAcercade {
   @Autowired
     RAcercade rAcercade;
     
     public List<Acercade> list(){
         return rAcercade.findAll();
     }
     
     public Optional<Acercade> getOne(int id){
         return rAcercade.findById(id);
     }
     
     public Optional<Acercade> getByAcercad(String acerca){
         return rAcercade.findByAcerca(acerca);
     }
     
     public void save(Acercade acer){
         rAcercade.save(acer);
     }
     
     public void delete(int id){
         rAcercade.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rAcercade.existsById(id);
     }
     
     public boolean existsByAcerca(String acerca){
         return rAcercade.existsByAcerca(acerca);
     }  
}

