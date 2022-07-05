/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.Examen.service;

import com.Examen.Examen.entity.Compradores;
import com.Examen.Examen.repository.CompradoresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dylan
 */

@Service
public class CompradoresService implements ICompradoresService{

    
    @Autowired
    private CompradoresRepository compradoresRepository;
    
    @Override
    public List<Compradores> getAllCompradores() {
        return (List<Compradores>)compradoresRepository.findAll(); 
      }

    @Override
    public Compradores getCompradoresById(long id) {
          return compradoresRepository.findById(id).orElse(null);
     }

    @Override
    public void saveCompradores(Compradores compradores) {
       compradoresRepository.save(compradores);
    }

    @Override
    public void delete(long id) {
       compradoresRepository.deleteById(id);
    }
}
