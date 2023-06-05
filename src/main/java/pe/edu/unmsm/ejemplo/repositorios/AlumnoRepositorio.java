package pe.edu.unmsm.ejemplo.repositorios;

import org.springframework.data.repository.CrudRepository;
import pe.edu.unmsm.ejemplo.entidades.Alumno;

public interface AlumnoRepositorio extends CrudRepository<Alumno, Integer>{
	/*
	/**
	 * Busca un alumno por su codigo
	 * @param alu_vccodigo el codigo del alumno
	 * @return una instancia de alumno o null si no entrega
	 */
	
	public Alumno findByAluvccodigo( String aluvccodigo );

}
