package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.model.Ordenador;

@Controller
public class PruebaController {

	/*@GetMapping("/inicio")
	public String getInicio() {
		return "Inicio";
	}
	
	@GetMapping("/portada")
	public String getPortada() {
		return "Portada";
	}*/
	
	/**
	//@GetMapping("/pcSobremesa")
	public String getPcSobremesa(Model model) {
		model.addAttribute("sobremesa", new Ordenador("HP 290-P0051NS Intel Core i5-8400/8GB/1TB", "PC Sobremesa ideal para tu oficina con un rendimiento adecuado para trabajos multimedia. ",
				549.5, false, 0, 1, true, "none", "HP", "Procesador(Intel Core i5-8400 6 núcleos 2.8 a 4 Ghz 9 MB Caché)", 8, "Disco_duro(SATA de 1 TB 7200 rpm)", "Sistema_operativo(Windows 10 Home 64 Bits)",
				"Sobremesa", "Dimensiones(10 x 32 x 27.7 cm)"));
		return "PcSobremesa";
		
	}**/
}
