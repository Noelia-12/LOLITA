package CasasDeLolita.LasCasas;
 
 // la segubnda lineal n
 public class Lolita {
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
 
    

    public static void main(String[] args) {
        Solucion2(2);
    }
}
