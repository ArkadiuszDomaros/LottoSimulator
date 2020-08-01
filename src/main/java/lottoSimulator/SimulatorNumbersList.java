package lottoSimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SimulatorNumbersList {
    private final List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public void showList(){
        System.out.println("Drawn numbers:");
        System.out.println(list);
    }

    public void appendList(){
        Random random = new Random();
        for(int i = 0; i < 6; i++){
            list.add(random.nextInt(48) + 1);
        }
        Collections.sort(list);
    }

}
