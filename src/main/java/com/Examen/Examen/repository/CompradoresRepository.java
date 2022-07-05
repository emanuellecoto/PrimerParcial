/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Examen.Examen.repository;

import com.Examen.Examen.entity.Compradores;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dylan
 */
@Repository
public interface CompradoresRepository extends CrudRepository<Compradores,Long>{
    
}
