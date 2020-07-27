package lottoSimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimulatorNumbersList {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        Collections.sort(list);
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

}
