package pe.edu.upeu.asistencia.servicio;

import pe.edu.upeu.asistencia.modelo.Participante;

import java.util.List;

public interface ParticipanteServicioI {

    void saveEntidad(Participante participante); //C

    List<Participante> findAllEntidades(); // R

    void updateEntidad(Participante participante, int index); //U

    void deleteEntidad(int index); //D

    Participante findEntidad(int index); //Buscar

}
