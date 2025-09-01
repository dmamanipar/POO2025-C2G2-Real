package pe.edu.upeu.asistencia.servicio;

import org.springframework.stereotype.Service;
import pe.edu.upeu.asistencia.modelo.Participante;
import pe.edu.upeu.asistencia.repositorio.ParticipanteRepositorio;

import java.util.List;

@Service
public class ParticipanteServicioImp extends ParticipanteRepositorio implements ParticipanteServicioI {

    @Override
    public void saveEntidad(Participante participante) {
        listaParticipantes.add(participante);
    }

    @Override
    public List<Participante> findAllEntidades() {
        return listaParticipantes;
    }

    @Override
    public void updateEntidad(Participante participante, int index) {
        listaParticipantes.set(index, participante);
    }

    @Override
    public void deleteEntidad(int index) {
        listaParticipantes.remove(index);
    }

    @Override
    public Participante findEntidad(int index) {
        return listaParticipantes.get(index);
    }
}
