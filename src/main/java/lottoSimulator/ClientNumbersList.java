package lottoSimulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ClientNumbersList {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        Collections.sort(list);
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
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
