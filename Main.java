import java.util.Scanner;
class Main {
    public static int calcularDistanciaProximaEsfera(int distanciaCasaDeGoku){
        int distanciaProximaEsfera = 0;
        distanciaProximaEsfera = distanciaCasaDeGoku * 2 + 4;
        return distanciaProximaEsfera;
    }

    public static int calcularDuracionDelViaje(int distanciaCasaDeGoku, int distanciaProximaEsfera){
        int duracionDelViaje = 0;
        duracionDelViaje = (distanciaCasaDeGoku + distanciaProximaEsfera) / 5;
        return duracionDelViaje;
    }
    public static String definirNombreDeLaEsfera(int duracionDelViaje){
        String nombreDeLaEsfera = "";
        if(duracionDelViaje >= 0 && duracionDelViaje <= 20){
            nombreDeLaEsfera = "uno";
        }else if(duracionDelViaje >=21 && duracionDelViaje <=30){
            nombreDeLaEsfera = "dos";
        }else if(duracionDelViaje >=31 && duracionDelViaje <=50){
            nombreDeLaEsfera = "tres";
        }else if(duracionDelViaje > 50){
            nombreDeLaEsfera = "cuatro";
        }
        return nombreDeLaEsfera;
    }
    public static void main(String[] args) {
        int distanciaCasaDeGoku = 0;
        int distanciaProximaEsfera = 0;
        int duracionDelViaje = 0;
        String nombreDeLaEsfera = "";
        Scanner sc = new Scanner(System.in);
        //System.out.println("Distancia a la casa de Goku:");
        distanciaCasaDeGoku = sc.nextInt();

        distanciaProximaEsfera = calcularDistanciaProximaEsfera( distanciaCasaDeGoku);
        duracionDelViaje = calcularDuracionDelViaje( distanciaCasaDeGoku, distanciaProximaEsfera);
        nombreDeLaEsfera = definirNombreDeLaEsfera(duracionDelViaje);
        System.out.println(distanciaCasaDeGoku + " " + distanciaProximaEsfera + " " + duracionDelViaje );
        System.out.println(nombreDeLaEsfera);
    }
}
