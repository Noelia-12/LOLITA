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
 

    public static void main(String[] args) {
        Solucion1(2);
    }
}
