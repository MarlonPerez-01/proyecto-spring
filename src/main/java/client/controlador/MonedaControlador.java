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

import client.modelo.Moneda;
import client.servicio.MonedaServicio;
import client.utilitarios.ResponseDTO;

@RestController
@RequestMapping("/moneda")
public class MonedaControlador {
	
	@Autowired
	MonedaServicio servicio;
	
	
	
	@GetMapping
	public ResponseDTO listar() {
		
		return servicio.findALL();
	
	}
	
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Moneda moneda) {
		
		return servicio.crear(moneda);
		
	}
	
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Moneda moneda) {
		
		return servicio.actualizar(moneda);
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id) {
		
		return servicio.borrar(id);
	
	}
	
	
	

}
