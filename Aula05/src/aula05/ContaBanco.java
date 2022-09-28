
//Versão feita pelo Professor Guanabara
package aula05;

import java.util.Scanner;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    

    public ContaBanco( ){
       this.status = false;
       this.saldo = 0f;
    }
  
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status:" + this.isStatus());
        System.out.println("-------------------------------");
    }
    
    public void abrirConta(String t){
       this.setTipo(t);
       
       if(isStatus()){
           System.out.println("Voce ja possui uma conta aberta");
           
       } else{
           this.setStatus(true);
           
           if((t).equals("CC")){
           System.out.println("Parabens! Por abrir uma conta corrente voce ganhou 50 reais");
           this.setSaldo(this.getSaldo() + 50f);
           
           
       } else if((t).equals("CP")){
           System.out.println("Parabens! Por abrir uma conta poupanca voce ganhou 150 reais");
           this.setSaldo(this.getSaldo()+ 150f);
       }
       }
       
    }
   
    public void fecharConta(){
       
       if(isStatus()){
           
           if(this.saldo > 0){
            System.out.println("Erro não foi possível fechar a conta \nAinda há saldo em conta!");
       } 
           else if(this.saldo < 0){
            System.out.println("Erro, há debitos na conta!");
       }
           else{
            System.out.println("Conta fechada com sucesso!");
            this.setStatus(false);
       }
           
       }   
       else{
        System.out.println("Você não possui uma conta aberta!");
       }
        
       
       
        
    }
    
    public void depositar(float v){
        
    if(isStatus()){
      this.setSaldo(this.getSaldo() + v);
    } 
    else{
      System.out.println("Erro. Você não abriu sua conta");
    }
    
    }
    
    public void sacar(float v){
        
        if(isStatus()){ 
            if(v > this.getSaldo()){
                System.out.println("Erro, saldo insuficiente!");
            } else{
                this.setSaldo(this.getSaldo() - v);
            }
       
        } else{
            System.out.println("Erro. Você não abriu sua conta!");
        }
    }
    
    
    public void pagarMensal(){
        if(isStatus()){
            if(this.getTipo().equals("CC")){
            this.setSaldo(this.getSaldo() - 12f);
        }else 
        if(this.getTipo().equals("CP")){
            this.setSaldo(this.getSaldo() - 20f);
        }
       System.out.println("Mensalidade paga com sucesso!");
            
            
        }
        else{
            System.out.println("Você não possui um conta aberta!");
        }
        
     
    }
    
    public int getNumConta() {
       return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    
}
