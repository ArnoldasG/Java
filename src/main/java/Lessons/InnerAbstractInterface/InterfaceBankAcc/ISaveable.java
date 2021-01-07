package main.java.Lessons.InnerAbstractInterface.InterfaceBankAcc;

// Create a simple interface (tip: name it Saveable or ISaveable)

import java.util.List;

public interface ISaveable {
    List <String> write();
    void read (List <String> savedValues);
    // Sukurti du metodai, vienas - įrašys, kitas - perskaitys.
}
