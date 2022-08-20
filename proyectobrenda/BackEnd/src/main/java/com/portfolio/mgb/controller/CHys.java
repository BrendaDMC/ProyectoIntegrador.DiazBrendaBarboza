/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.controller;

import com.portfolio.mgb.Dto.dtoHys;
import com.portfolio.mgb.Security.Controller.Mensaje;
import com.portfolio.mgb.entity.Hys;
import com.portfolio.mgb.service.SHys;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hys")
//@CrossOrigin(origins = "https://frontend-portfolio-c8428.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class CHys {

    @Autowired
    SHys sHys;

    @GetMapping("/lista")
    public ResponseEntity<List<Hys>> list() {
        List<Hys> list = sHys.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Hys> getById(@PathVariable("id") int id) {
        if (!sHys.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        Hys hys = sHys.getOne(id).get();
        return new ResponseEntity(hys, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sHys.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sHys.delete(id);
        return new ResponseEntity(new Mensaje("Hys eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHys dtohys) {
        if (StringUtils.isBlank(dtohys.getHtml())) {
            return new ResponseEntity(new Mensaje("El campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sHys.existsByHys(dtohys.getHtml())) {
            return new ResponseEntity(new Mensaje("Ese campo ya existe"), HttpStatus.BAD_REQUEST);
        }

        Hys hys = new Hys(
                dtohys.getHtml(), dtohys.getCss(), dtohys.getJs(), dtohys.getGit(), dtohys.getEn(), dtohys.getComp()
        );
        sHys.save(hys);
        return new ResponseEntity(new Mensaje("Hys creado"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHys dtohys) {
        if (!sHys.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if (sHys.existsByHys(dtohys.getHtml()) && sHys.getByHs(dtohys.getHtml()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ese campo ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtohys.getHtml())) {
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }

        Hys hys = sHys.getOne(id).get();

        hys.setHtml(dtohys.getHtml());
        hys.setCss(dtohys.getCss());
        hys.setJs(dtohys.getJs());
        hys.setGit(dtohys.getGit());
        hys.setEn(dtohys.getEn());
        hys.setComp(dtohys.getComp());

        sHys.save(hys);

        return new ResponseEntity(new Mensaje("Hys actualizado"), HttpStatus.OK);
    }
}
