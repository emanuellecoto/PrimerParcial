/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Examen.Examen.repository;

import com.Examen.Examen.entity.Peliculas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dylan
 */
@Repository
public interface PeliculaRepository extends CrudRepository<Peliculas,Long>{
    
}
