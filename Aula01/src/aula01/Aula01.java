package aula01;

public class Aula01 {

    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       Caneta c2 = new Caneta();
       
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.modelo = "Bic";
       c1.tampada = false;
    
     c1.destampar();
     c1.rabiscar();
     c1.status();
     
     
       c2.cor = "Vermelho";
       c2.ponta = 1.0f;
       c2.modelo = "Molin";
       c2.tampada = true;
       
       c2.tampar();
       c2.rabiscar();
       c2.status();
    
    }
    
}
