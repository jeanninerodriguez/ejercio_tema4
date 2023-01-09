public class Main {
 
  public static void main(String[] args) {
    int numeroIf = 2;

    if (numeroIf < 0){
      System.out.println("el numero es negativo");
    }
    else if (numeroIf > 0){
      System.out.println("el numero es positivo");
    } 
    else {
      System.out.println("el numero es cero");
    }
    
    
    int numeroWhile = 1;

    while (numeroWhile < 3){
      System.out.println(numeroWhile);
      numeroWhile = numeroWhile + 1;
    }

    do{
      System.out.println(numeroWhile);
      numeroWhile = numeroWhile + 1;
    } while (numeroWhile < 3);


    for(int numeroFor = 0;numeroFor <= 3;numeroFor++){
      System.out.println(numeroFor);
    }

    String estacion = "INVIERNO";

    switch (estacion){
      case "VERANO":
      System.out.println("ES VERANO");
      break;
      case "OTOÑO":
      System.out.println("ES OTOÑO");
      break;
      case "INVIERNO":
      System.out.println("ES INVIERNO");
      break;
      case "PRIMAVERA":
      System.out.println("ES PRIMAVERA");
      break;
      default:
      System.out.println("No es una estacion");
    } 
  }
}
      