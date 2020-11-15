package client.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import client.modelo.Comida;

@Repository
public interface comidaRepositorio extends JpaRepository<Comida, Long> {

}
