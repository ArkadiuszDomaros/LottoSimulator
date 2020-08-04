package lottoSimulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulatorNumbersListTest {

    @Test
    void emptyArraysShouldHaveSizeZero(){

        //given
        SimulatorNumbersList simulatorNumbersList = new SimulatorNumbersList();

        //when
        //we are not adding anything to list - list is empty

        //then
        assertEquals(simulatorNumbersList.getList().size(), 0);

    }

}