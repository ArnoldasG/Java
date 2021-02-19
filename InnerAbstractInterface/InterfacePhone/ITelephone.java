package main.java.Lessons.InnerAbstractInterface.InterfacePhone;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber); // sukuriam "signature" (int phoneNumber)
    void answer();
    boolean callPhone (int phoneNumber);
    boolean isRinging();

    /* Aprašyti metodai, kurie privalės būti implementuoti iš šito "interface". Taigi, mes nerašome
    tokio kodo kaip interface, mes tiesiog viską aprašome klasėje ir tiesiog apibūdinome konktraktą.
    Kitais žodžiais - kontraktas, parametrai, return tipai, kurie galioja kiekvienam
    metodui, kurie apskritai padarys šią klasę validžią.

    Access modifier yra nereikalingi kuomet aprašom interface. Nes mes implementuojam
    interface į klasę, todėl interface egzistuoja, kad apibūtintų metodus, kurie
    turi būti implementuoti. Mes juos parašysime konkrečioje klasėje kurioje reikės. */
}
