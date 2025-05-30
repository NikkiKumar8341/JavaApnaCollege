package CustomeObj;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainTrader {


    public static List<Transaction> sortBySmallToHigh(int year){

        List<Transaction> collect= DataBase.getTraderList()
                .stream().filter(item->item.getYear()==year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());

        return collect;
    }


    public static void uniqueCities() {
        List<Transaction> traderList = DataBase.getTraderList();

        List<String> uniqueCites= traderList.stream().map(transaction -> transaction.getTrader().getCity()).distinct().collect(Collectors.toList());

        uniqueCites.forEach(s -> System.out.print(s+" "));
    }

    public static  List<Transaction> sortByName(){

        List<Transaction> traderList = DataBase.getTraderList();

        List<Transaction> cambridge = traderList.stream().filter(s -> {
            return s.getTrader().getCity().equals("Cambridge");
        }).sorted((o1,o2)->{
            return o1.getTrader().getName().compareTo(o2.getTrader().getName());
        })
                .collect(Collectors.toList());

        return cambridge;

        }

        public static void sortAllTraderName(){

            List<Transaction> traderList = DataBase.getTraderList();

            String traderStr =
                    traderList.stream()
                            .map(transaction -> transaction.getTrader().getName())
                            .distinct()
                            .sorted()
                            .collect(Collectors.joining(" "));

            System.out.println(traderStr);

            traderList.stream().map(item->item.getTrader().getName()).sorted()
                    .distinct()
                    .forEach(System.out::println);
        }


        public static void printAllTransactionMax(){

            List<Transaction> traderList = DataBase.getTraderList();

            Optional<Transaction> minTransaction = traderList.stream()
                    .reduce((t1, t2) -> t1.getValue() > t2.getValue() ? t1 : t2);


            System.out.println(minTransaction);


        }

        public static void printAllTransactionMin(){

            List<Transaction> traderList = DataBase.getTraderList();

            Optional<Integer> printMinTransaction=traderList.stream()
                    .map(Transaction::getValue).reduce(Integer::min);

            System.out.println(printMinTransaction);

            Optional<Transaction> printMins=traderList.stream().min(Comparator.comparing(Transaction::getValue));

            System.out.println(printMins);
        }
        public static void main(String[] args) {

        System.out.println(sortBySmallToHigh(2011));

        uniqueCities();

        System.out.println();


        System.out.println(sortByName());

        sortAllTraderName();

        printAllTransactionMax();

    }
}
