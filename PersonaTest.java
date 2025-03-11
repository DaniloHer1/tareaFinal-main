package instituto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class PersonaTest {

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

        @org.junit.jupiter.api.Test
        void compareTo() {
            Persona persona1 = new Persona(12345678, "Juan ", 'M', 1, 1, 1990);
            Persona persona2 = new Persona(12345678, "pedro ", 'F', 2, 2, 1992);
            Persona persona3 = new Persona(87654321, "Alicia", 'F', 3, 3, 1993);

            assertEquals(0, persona1.compareTo(persona2));
            assertTrue(persona1.compareTo(persona3) < 0);
            assertTrue(persona3.compareTo(persona1) > 0);
        }
    }
