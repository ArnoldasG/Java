package main.java.Lessons.Homework.MoneyExchange;

import java.util.HashMap;
import java.util.Map;

public class ATMMachine {
    private final MoneyChanger rootMoneyExchanger;


    public ATMMachine(MoneyChanger rootMoneyExchanger) {
        this.rootMoneyExchanger = rootMoneyExchanger;
    }

    public Map<Double, Integer> Exchange (Double money) {
        Map<Double, Integer> moneyChange = new HashMap<Double, Integer>();
        rootMoneyExchanger.Exchange(money, moneyChange);
        return moneyChange;
    }

}
