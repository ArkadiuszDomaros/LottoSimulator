package lottoSimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimulatorNumbersList {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void showList(){
        System.out.println(list);
    }

    public void appendList(){
        list.add(12);
        list.add(5);
        list.add(34);
        list.add(21);
        list.add(44);
        list.add(18);
        Collections.sort(list);
    }

}
