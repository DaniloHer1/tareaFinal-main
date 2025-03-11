package instituto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void aniadirAlumnoAddsAlumnoToList() {
        Curso curso = new Curso("matematicas");
        Persona alumno = new Persona(12345678, "Juan", 'M', 1, 1, 2000);

        curso.aniadirAlumno(alumno);

        assertTrue(curso.getListaAlumnos().contains(alumno));
    }
}