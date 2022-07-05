/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Examen.Examen.controller;

import com.Examen.Examen.entity.Compradores;
import com.Examen.Examen.service.ICompradoresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Dylan
 */

@Controller
public class CompradoresController {
    @Autowired
    private ICompradoresService compradoresService;
    
    @GetMapping("/comprador")
    public String index(Model model){
      List<Compradores> listaCompradores = compradoresService.getAllCompradores();
        model.addAttribute("titulo","Tabla Compradores");
        model.addAttribute("compradores",listaCompradores);
        return "compradores";
}}
