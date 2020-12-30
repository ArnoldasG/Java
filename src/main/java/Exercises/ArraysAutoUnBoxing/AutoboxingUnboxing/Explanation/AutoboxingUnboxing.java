package main.java.Exercises.ArraysAutoUnBoxing.AutoboxingUnboxing.Explanation;

import java.util.ArrayList;

// 1 pavyzdys - sukuriam klasė, pridedam int fieldą, sukuriam konstruktorių ir get/set.
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class AutoboxingUnboxing {
    public static void main(String[] args) {
            // galime sukurti, pavyzdžiui, String ar int masyvus paprastai.
            String[] strArray = new String [10];
            int[] intArrays = new int [10];

        // galime sukurti "arraylist" ir pridėti po norimą elementą.
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Arnoldas");

        // tokio array list sukurti negalime, nes int yra primityvas, o primityvas nėra klasė.
        // norint (tokiu būdu) sukurti intų sarašą - mums reikia sukurti klasę. (pvz 1)
        /* ArrayList<int> intArraysList = new ArrayList<int>(); Sukūrus klasę tada galime sukurti
        ir arraylist su jau esama klase ir pridėsime norimą elementą.*/
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // galima sukurti Integer/Dobule klas3 ir taip:
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.12);

        // valueOf() - paims vertę kaip primitie type ir automtiškai ją konvertuos į Integer klasę.
        // tai vadinasi AUTOBOXING
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        // intValue() - iš Integer klasės gražins atgal į primitive type.
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        // aukščiau buvo ilgesnis kelias apie auto/unboxing o dabar trumpesnis:

        Integer myIntValue = 56;
        // Under the hood vyksta: Integer.valueOf(56); Viską padaro automatiškai
        int myInt = myIntValue;
        // Under the hood: myInt.intValue(). Primityva konvertuoja į objektą.

        // Kad įsitikint, padarom pavyzdį su double ir prasukam jį per loop'ą.

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }
        for (int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
