package Guia3.Extras;

public class Ejercicio12 {

    public static void main(String[] args) {
        String iT, jT, kT;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    iT = Integer.toString(i);
                    jT = Integer.toString(j);
                    kT = Integer.toString(k);
                    if (iT.equals("3") || jT.equals("3") || kT.equals("3")) {
                        iT = iT.replace("3", "E");
                        jT = jT.replace("3", "E");
                        kT = kT.replace("3", "E");
                        System.out.println(iT + "-" + jT + "-" + kT);
                    } else System.out.println(iT + "-" + jT + "-" + kT);
                }
            }
        }
    }
}