
package aula07;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
	}
         else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
	}
    }
    
    public void lutar(){
        if(this.isAprovada()){
            System.out.println("### DESAFIADO ###");
            (this.getDesafiado()).apresentar();
            System.out.println("### DESAFIANTE ###");
            (this.getDesafiante()).apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch(vencedor){
                case 0:
                    System.out.println("Empate");
                    (this.getDesafiado()).empatarLuta();
                    (this.getDesafiante()).empatarLuta();
                    break;
                case 1:
                    System.out.println("Desafiado Ganhou!");
                    (this.getDesafiado()).ganharLuta();
                    (this.getDesafiante()).perderLuta();
                    break;
                case 2:
                    System.out.println("Desafiante Ganhou!");
                    (this.getDesafiado()).perderLuta();
                    (this.getDesafiante()).ganharLuta();
                    break;

            }
        }
        else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}