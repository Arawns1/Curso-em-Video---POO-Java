
package aula06;

public class ControleRemoto implements Controlador {

   
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos Especiais
    public ControleRemoto(){
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
}
    
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos Abstratos

    @Override //significa sobrescrever;
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()){
            System.out.println("--- Menu ---");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Tocando? " + this.isTocando());
            System.out.println("Volume:" + this.getVolume());
            for (int i = 0; i <= this.getVolume() ; i += 10) {
                System.out.print("|");
            }
        }
        else{
            System.out.println("Controle Desligado!");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossível aumentar volume");
        }
        
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        } else{
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
           this.setVolume(0); 
        }else{
            System.out.println("Impossível ligar mudo");
        }
        
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0 ){
           this.setVolume(50); 
        }else{
            System.out.println("Impossível desligar mudo");
        }
       
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Impossível dar play");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Impossível tirar do pause");
        }
    }
    
}
