import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsatTest {
    @Test
    void itShouldBeReturnCsatSatisfection(){
        Csat csat = new Csat();
        csat.setEvaluation("Neutral");
        assertEquals("Neutral", csat.getEvaluation());
    }

    @Test
    void itShouldBeReturnCsatGrade(){
        Csat csat = new Csat();
        csat.setEvaluation("Neutral");
        assertEquals(3, csat.getRating());
    }

}