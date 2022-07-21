import org.omg.CORBA.WStringSeqHolder;

public class Main {
    public static void main(String[] args) {
        String estacion = "otoño";
        int numeroif = 5;
        int numerowhile = -5;
        int numerodowhile = 3;




        if (numeroif > 0){
          System.out.println("numero positivo");
        }else {
            if (numeroif < 0){
            System.out.println("numero negativo ");
        }else
            System.out.println("Numero es 0");
        }
        while (numerowhile < 3){
            numerowhile = numerowhile + 1;
            System.out.println(numerowhile);
        }
        do {
            numerowhile = numerowhile + 1;
            System.out.println(numerowhile);
        }while (numerowhile < 3);

        for(int numerofor=0; numerofor <= 3;numerofor = numerofor + 1){
            System.out.println(numerofor);
        }
        switch(estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
        }
    }
}