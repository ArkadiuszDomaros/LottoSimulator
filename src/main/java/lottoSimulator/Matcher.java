package lottoSimulator;

public class Matcher {
    private final ClientNumbersList clientNumbersList = new ClientNumbersList();
    private final SimulatorNumbersList simulatorNumbersList = new SimulatorNumbersList();
    int countOfCorrectNumbers = 0;


    public void compareNumbers(){
        clientNumbersList.appendList();
        simulatorNumbersList.appendList();

        for(int i = 0; i < 6; i++){
            if (clientNumbersList.getList().get(i).equals(simulatorNumbersList.getList().get(i))) {
                this.countOfCorrectNumbers++;
            }
        }
    }

    public void getResult(){
        clientNumbersList.showList();
        simulatorNumbersList.showList();
        System.out.println("Correct answers " + countOfCorrectNumbers + "/6");
    }
}
