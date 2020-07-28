package lottoSimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ClientNumbersList {
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
        list.add(41);
        list.add(5);
        list.add(24);
        list.add(38);
        list.add(14);
        Collections.sort(list);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientNumbersList that = (ClientNumbersList) o;
        return Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
