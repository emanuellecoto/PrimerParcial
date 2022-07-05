/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.Examen.service;

import com.Examen.Examen.entity.Peliculas;
import com.Examen.Examen.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dylan
 */

@Service
public class PeliculaService implements IPeliculaService{
    @Autowired
     private PeliculaRepository peliculaRepository;
    
    @Override
    public List<Peliculas> listPelicula() {
       return(List<Peliculas>)peliculaRepository.findAll();
    }
    
    
}
