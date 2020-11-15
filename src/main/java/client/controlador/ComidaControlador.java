package client.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import client.modelo.Comida;
import client.servicio.ComidaServicio;
import client.utilitarios.ResponseDTO;

@RestController
@RequestMapping("/comida")

public class ComidaControlador {
	@Autowired
	ComidaServicio servicio;
	
	@GetMapping
	public ResponseDTO listar() 
	{
		return servicio.findAll();
	}
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Comida comida) 
	{
		return servicio.crear(comida);
	}
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Comida comida) 
	{
		return servicio.actualizar(comida);
	}
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id) 
	{
		return servicio.borrar(id);
	}
}
