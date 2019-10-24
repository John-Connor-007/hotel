package com.hotelMagaer.demo.infraestructura.controlador;

import com.hotelMagaer.demo.dominio.modelo.dto.ReservaDTO;
import com.hotelMagaer.demo.dominio.puerto.dao.ReservaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ReservaControlador")
public class ReservaControlador {

    @Autowired
    private ReservaDAO reservaDAO;

    @PostMapping(value = "/guardarReserva", produces = MediaType.APPLICATION_JSON_VALUE)
    public void guardarReserva(@RequestBody ReservaDTO reservaDTO){
        reservaDAO.guardar(reservaDTO);
    }

    @PostMapping(value = "/filtroPorIdReserva", produces = MediaType.APPLICATION_JSON_VALUE)
    public ReservaDTO filtroPorIdReserva(@RequestBody ReservaDTO reservaDTO){
        return reservaDAO.filtroPorIdReserva(reservaDTO.getId());
    }

}
