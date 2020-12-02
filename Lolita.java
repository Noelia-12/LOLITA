package CasasDeLolita.LasCasas;
 // la primera es   funcion cuadratica^ n^2
public class Lolita {
    static int Solucion1(int calle){
        int casa = -1;
        for(int cas = 2; cas < calle; cas++){
            int si = 0;
            for(int ci = 1; ci < cas; ci++){
                si = si + ci;
            }
            
            int sd = 0;
            for(int cd = cas + 1; cd <= calle; cd++){
                sd = sd + cd;
            }

            if(si == sd){
                casa = cas;
            }
        }
        return casa;
    }
 // la segubnda lineal n
    static int Solucion2(int calle){
        int casa = -1;
        int scalle = (calle * (calle + 1))/2;
        for(int c = 2; c < calle; c++){
            int si = ((c - 1) * c)/2;
            int sd = scalle -si - c;
            if(si == sd){
                casa = c;
            }
        }
        return casa;
    }
 // la solucion 3 es constante
    static int Solucion3(int calle){
        double casa = Math.sqrt((Math.pow(calle, 2) + calle)/2);
        if(casa % 1 != 0){
            casa = -1;
        }
        return (int) casa;
    }

    public static void main(String[] args) {
        Solucion1(2);
    }
}
