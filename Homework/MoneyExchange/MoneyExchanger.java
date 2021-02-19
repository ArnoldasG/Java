package main.java.Lessons.Homework.MoneyExchange;

import java.util.Map;

public class MoneyExchanger implements MoneyChanger {
    private double nominalToExchange;
    private int availableNominalCount;
    private MoneyChanger next;

    public MoneyExchanger(double nominal, int nominalCount) {
        this.nominalToExchange = nominal;
        this.availableNominalCount = nominalCount;
    }

    public MoneyExchanger(double nominal, int nominalCount, MoneyChanger next) {
        this.nominalToExchange = nominal;
        this.availableNominalCount = nominalCount;
        this.next = next;
    }

    @Override
    public void Exchange(double money, Map<Double, Integer> change) {
        int exchangedNominalCount = calculateNominalCountToExchange(money);
        change.put(nominalToExchange, exchangedNominalCount);
        availableNominalCount -= exchangedNominalCount;
        money -= exchangedNominalCount * nominalToExchange;
        exchangeLeftOvers(money, change);
    }
    private void exchangeLeftOvers(double money, Map<Double, Integer> change) {
        boolean isMoneyLeftExchange = money > 0;
        if(isMoneyLeftExchange) {
            goToNext(money, change);
        }
    }
    private int calculateNominalCountToExchange(double money) {
        int nominalCount = (int) (money / nominalToExchange);
        boolean isEnoughNominal = availableNominalCount >= nominalCount;
        if(!isEnoughNominal) {
            nominalCount = availableNominalCount;
        }
        return nominalCount;
    }
    private void goToNext(double money, Map<Double, Integer> change) {
        if (next != null) {
            next.Exchange(money, change);
        }
    }
}