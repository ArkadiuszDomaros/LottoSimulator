package lottoSimulator;

import java.util.Objects;

public class Matcher {
    ClientNumbersList clientNumbersList = new ClientNumbersList();
    SimulatorNumbersList simulatorNumbersList = new SimulatorNumbersList();

    public void compareNumbers(){
        Objects.equals(clientNumbersList.getList(), simulatorNumbersList.getList());

    }
}
