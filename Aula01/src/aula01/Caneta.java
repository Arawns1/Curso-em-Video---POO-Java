
package aula01;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO CANETA TAMPADA!");
        }
        else{
            System.out.println("Rabiscando...");
        }
    }
    void tampar(){
      this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    
    void status(){
        System.out.println("cor: " + this.cor + "\n" +
               "modelo: " + this.modelo + "\n" +
               "ponta: " + this.ponta + "\n" +
               "Tampada? " + this.tampada + "\n");
    }
    
    String getCaneta(){
        return "cor: " + this.cor + "\n" +
               "modelo: " + this.modelo + "\n" +
               "ponta: " + this.ponta + "\n";
    }
}
