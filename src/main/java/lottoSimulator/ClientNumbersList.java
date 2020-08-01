package lottoSimulator;

import java.util.*;

public class ClientNumbersList {
    private final List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public void showList(){
        System.out.println(" ");
        System.out.println("Your numbers:");
        System.out.println(list);
    }

    public void appendList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your numbers between 1 and 49!");
        int i = 0;
        int prevNumber = 0;
        while(i < 6){
            System.out.println("Your no." + (i + 1) + " pick is?");
            int number = scanner.nextInt();
            if(number >= 1 && number <= 49){
                if(number != prevNumber){
                    list.add(number);
                    i++;
                    prevNumber = number;
                } else {
                    System.out.println("You can't pick two the same numbers!");
                }

            } else {
                System.out.println("Your pick is out of range! Try another number between 1 and 49!");
            }
        }
        scanner.close();
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
