package aula01;

public class Aula01 {

    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.modelo = "Bic crystal";
       c1.cor = "Azul";
       //c1.tampada = false;
       c1.destampar();
       c1.carga = 80;
       c1.status();
    
    }
    
}
