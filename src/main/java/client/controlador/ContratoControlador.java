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

import client.modelo.Contrato;
import client.servicio.ContratoServicio;
import client.utilitarios.ResponseDTO;


@RestController
@RequestMapping("/contrato")
public class ContratoControlador {
	
	
	@Autowired
	ContratoServicio servicio;
	
	@GetMapping
	public ResponseDTO listar() {
		
		return servicio.findALL();
	
	}
	
	@PostMapping
	public ResponseDTO insertar(@RequestBody Contrato contrato) {
		
		return servicio.crear(contrato);
		
	}
	
	@PutMapping
	public ResponseDTO actualizar(@RequestBody Contrato contrato) {
		
		return servicio.actualizar(contrato);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseDTO eliminar(@PathVariable Long id) {
		
		return servicio.borrar(id);
	
	}
	

}
