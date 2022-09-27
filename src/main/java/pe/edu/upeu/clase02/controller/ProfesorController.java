package pe.edu.upeu.clase02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase02.entity.Profesor;
import pe.edu.upeu.clase02.service.ProfesorService;

@RestController
@RequestMapping("/api/Persona")
public class ProfesorController {

	@Autowired
	private ProfesorService profesorService;
	
	@GetMapping("/all")
	public List<Profesor> readAll2(){		
		return profesorService.readAll();
	}	
	
}
