package com.example.lab2.controller;

import com.example.lab2.entity.Proveedores;
import com.example.lab2.repository.ProveedoresRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/Proveedores")
public class ProveedoresController {

    final ProveedoresRepository proveedoresRepository;

    public ProveedoresController (ProveedoresRepository proveedoresRepository){
        this.proveedoresRepository =  proveedoresRepository;
    }

    @GetMapping ("/listar")
    public String listarProveedores(){
        List<Proveedores> lis = proveedoresRepository.findAll();
            for (Proveedores p : lis){
                System.out.printf("id proveedores: "+ p.getrepo);
            }
    }

}
