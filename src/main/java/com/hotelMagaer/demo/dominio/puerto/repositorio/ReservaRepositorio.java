package com.hotelMagaer.demo.dominio.puerto.repositorio;

import com.hotelMagaer.demo.dominio.modelo.entidad.ReservaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ReservaRepositorio  extends JpaRepository<ReservaEntidad, Serializable> {

    @Query("select r from ReservaEntidad r where r.id = :idReserva")
    ReservaEntidad filtarPorIdReserva(@Param("idReserva") int idReserva);
}
