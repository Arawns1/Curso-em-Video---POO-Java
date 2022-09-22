
package aula01;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void escrever(){
        
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO CANETA TAMPADA!");
        }
        else{
            System.out.println("Rabiscando...");
        }
    }
    
    public void pintar(){
        
        
    }
    
    public void tampar(){
      this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    void status(){
        System.out.println("cor: " + this.cor + "\n" +
               "modelo: " + this.modelo + "\n" +
               "ponta: " + this.ponta + "\n" +
               "Tampada? " + this.tampada + "\n" +
               "carga: " + this.carga);
    }
    
    
}
