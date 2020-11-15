package client.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import client.modelo.Moneda;

@Repository
public interface monedaRepositorio extends JpaRepository<Moneda, Long> {

	
	
}
