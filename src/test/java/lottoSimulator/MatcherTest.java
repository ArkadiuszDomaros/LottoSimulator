package lottoSimulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatcherTest {

    @Test
    void emptyListsShouldBeEqual(){
        //given
        ClientNumbersList clientNumbersList = new ClientNumbersList();
        SimulatorNumbersList simulatorNumbersList = new SimulatorNumbersList();

        //when
        //then
        assertEquals(clientNumbersList.getList(),simulatorNumbersList.getList());
    }

    @Test
    void getResult() {
        //given
        //when

        //then
        //sprawdzić czy wyrzuca wyjątek przy pustej tablicy
        //listy nie powinny być puste po napełnieniu
    }
}