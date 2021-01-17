package main.java.Lessons.Tests;

import main.java.Lessons.Homework.MoneyExchange.ATMMachine;
import main.java.Lessons.Homework.MoneyExchange.MoneyChanger;
import main.java.Lessons.Homework.MoneyExchange.MoneyExchanger;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertation.assertThat;



class ATMMachineTest {
    @Test
    void exchange_When_MoneyAndExchangeSumEqual_CallsExchanger() {
        MoneyChanger moneyChanger = new MoneyExchanger(100, 50);
        ATMMachine atmMachine = new ATMMachine(moneyChanger);

         Map<Double, Integer> changedMoney = atmMachine.Exchange(100.0);

         assertThat()


    }


    @Test
    void exchange_When_MoneyAndExchangeSumNotEqual_ThrowsSomeExceptions() {


    }

}