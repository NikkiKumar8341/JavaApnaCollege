package CustomeObj;

import java.util.*;

public class DataBase {

    public static List<Transaction> getTraderList() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        Trader sara = new Trader("Sara", "Delhi");
        Trader ramesh = new Trader("Ramesh", "Pune");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950),
                new Transaction(alan, 2011, 400),
                new Transaction(brian, 2013, 500),
                new Transaction(sara, 2014, 900),
                new Transaction(sara, 2011, 300),
                new Transaction(ramesh, 2012, 1100),
                new Transaction(ramesh, 2013, 1200),
                new Transaction(raoul, 2015, 1000),
                new Transaction(mario, 2016, 730),
                new Transaction(alan, 2016, 450),
                new Transaction(brian, 2015, 600),
                new Transaction(sara, 2016, 850),
                new Transaction(ramesh, 2014, 990),
                new Transaction(raoul, 2013, 1020),
                new Transaction(mario, 2015, 780)
        );

        return transactions;
    }




}
