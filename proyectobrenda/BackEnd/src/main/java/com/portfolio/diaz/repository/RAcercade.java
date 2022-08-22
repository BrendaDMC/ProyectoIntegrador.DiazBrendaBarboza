/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.diaz.repository;
import com.portfolio.diaz.entity.Acercade;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author diazb
 @Repository*/
@Repository
public interface RAcercade extends JpaRepository<Acercade, Integer>{
    public Optional<Acercade> findByAcerca(String acerca);
    public boolean existsByAcerca(String acerca);
}

