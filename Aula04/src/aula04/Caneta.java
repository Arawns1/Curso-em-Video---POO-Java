
package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){
        //Método construtor!
       this.modelo = m;
       this.cor = c;
       this.ponta = p;
       this.tampar();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
   
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
      this.tampada = false;  
    }
        
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    
}
