/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Examen.Examen.service;

import com.Examen.Examen.entity.Compradores;
import java.util.List;

/**
 *
 * @author Dylan
 */
public interface ICompradoresService {
    public List <Compradores> getAllCompradores();
    public Compradores getCompradoresById (long id);
    public void saveCompradores(Compradores compradores);
    public void delete(long id);
}
