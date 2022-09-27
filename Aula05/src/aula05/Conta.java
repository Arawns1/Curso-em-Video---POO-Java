
package aula05;

import java.util.Scanner;



public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    Scanner input = new Scanner(System.in);

    public Conta(String d, String t){
       this.tipo = t;
       this.dono = d;
       this.status = false;
       this.saldo = 0f;
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
   
    
    public void abrirConta(){
       if(isStatus()){
           System.out.println("Voce ja possui uma conta aberta");
           
       } else{
           this.setStatus(true);
           
           if((this.tipo).equals("CC")){
           System.out.println("Parabens! Por abrir uma conta corrente voce ganhou 50 reais");
           this.saldo += 50f;
       } else if((this.tipo).equals("CP")){
           System.out.println("Parabens! Por abrir uma conta poupanca voce ganhou 150 reais");
           this.saldo += 150f;
       }
       }
       
    }
   
    public void fecharConta(){
       
       if(isStatus()){
           if(this.saldo > 0){
           System.out.println("Erro não foi possível fechar a conta \nAinda há saldo em conta!");
       } else if(this.saldo < 0){
           System.out.println("Erro, há debitos na conta!");
       }
       else{
         System.out.println("Conta fechada com sucesso!");
         this.status = false;
       }
       } else{
           System.out.println("Você não possui uma conta aberta!");
       }
        
       
       
        
    }
    public void depositar(){
    if(isStatus()){
        System.out.println("Digite o valor a ser depositado:");
        this.setSaldo(input.nextFloat() + this.getSaldo());
    } else{
        System.out.println("Erro. Você não abriu sua conta");
    }
    }
    public void sacar(){
         if(isStatus()){
        System.out.println("Digite o valor a ser sacado:");
        float valor = input.nextFloat();
        if(valor > this.getSaldo()){
            System.out.println("Erro, saldo insufisciente!");
        } else{
            this.setSaldo(this.getSaldo() - valor);
        }
       
    } else{
        System.out.println("Erro. Você não abriu sua conta!");
    }
    }
    public void pagarMensal(){
        if(this.getTipo().equals("CC")){
            this.setSaldo(this.getSaldo() - 12f);
        }else 
        if(this.getTipo().equals("CP")){
            this.setSaldo(this.getSaldo() - 20f);
        }
       System.out.println("Mensalidade paga com sucesso!");
     
    }
    
    
}
