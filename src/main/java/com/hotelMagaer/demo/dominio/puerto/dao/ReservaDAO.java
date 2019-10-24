package com.hotelMagaer.demo.dominio.puerto.dao;

import com.hotelMagaer.demo.dominio.modelo.dto.ReservaDTO;
import com.hotelMagaer.demo.dominio.modelo.entidad.ReservaEntidad;
import com.hotelMagaer.demo.dominio.puerto.repositorio.ReservaRepositorio;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservaDAO {

    private ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private ReservaRepositorio reservaRepositorio;

    public void guardar(ReservaDTO reservaDTO){

        ReservaEntidad reservaEntidad = modelMapper.map(reservaDTO,ReservaEntidad.class);

        reservaRepositorio.save(reservaEntidad);
    }

    public  ReservaDTO filtroPorIdReserva(int idReserva){
        ReservaEntidad reservaEntidad = reservaRepositorio.filtarPorIdReserva(idReserva);
        ReservaDTO reservaDTO = modelMapper.map(reservaEntidad,ReservaDTO.class);
        return reservaDTO;
    }
}
