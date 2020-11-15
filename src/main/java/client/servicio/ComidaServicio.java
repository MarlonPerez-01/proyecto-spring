package client.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client.modelo.Comida;
import client.repositorio.comidaRepositorio;
import client.utilitarios.Messages;
import client.utilitarios.ResponseDTO;


@Service
public class ComidaServicio {

	@Autowired
	comidaRepositorio Repositoriobd;
	
	public ResponseDTO findAll() 
	{
		ResponseDTO res = new ResponseDTO();
		try 
		{
			res.setRespuesta(Repositoriobd.findAll());
		}
		catch(Exception e)
		{
			res.setCodigo(Messages.CODE_FATAL_ERROR);
		}
		return res;
	}
	
public ResponseDTO crear(Comida comida) {
		
		ResponseDTO res= new ResponseDTO();
		try {
			
			res.setRespuesta(Repositoriobd.save(comida));
			
		}catch(Exception e) {
			
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
				
		}
		
		return res;
		
	}
	

	public ResponseDTO actualizar(Comida comida) {
		
		ResponseDTO res = new ResponseDTO();
		
		try {
			if(Repositoriobd.existsById(comida.getIdComida())) {
				res.setRespuesta(Repositoriobd.save(comida));
				res.setCodigo(Messages.CODE_UPDATE_SUCCES);
				res.setMensaje(Messages.MSG_UPDATE_OK);
				
			}else {
				
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);
				
			}
			
			
			
		}catch(Exception e) {
			
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();
			
			
		}
		
		return res;
		
	}
	
	
	public ResponseDTO borrar(Long id) {
		ResponseDTO res= new ResponseDTO();
		
		try {
			if(Repositoriobd.findById(id)!=null) {
				Repositoriobd.deleteById(id);
				res.setCodigo(Messages.CODE_DELETE_SUCCESS);
				res.setMensaje(Messages.MSG_DELETE_OK);
				
			}else {
				res.setCodigo(Messages.CODE_ITEM_NOT_FOUND);
				res.setMensaje(Messages.MSG_ITEM_NOT_FOUND);	
				
			}
			
		}catch(Exception e) {
			res.setCodigo(Messages.CODE_FATAL_ERROR);
			res.setMensaje(Messages.MSG_FATAL_ERROR);
			e.printStackTrace();	
			
		}
		
		return res;
		
	}
}
