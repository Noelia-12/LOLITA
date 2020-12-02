package CasasDeLolita.LasCasas;

 public class Lolita {
    // la solucion 3 es constante
    static int Solucion3(int calle){
        double casa = Math.sqrt((Math.pow(calle, 2) + calle)/2);
        if(casa % 1 != 0){
            casa = -1;
        }
        return (int) casa;
    }

    

    public static void main(String[] args) {
        Solucion3(2);
    }
}
