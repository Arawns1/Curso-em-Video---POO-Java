
package aula05;

public class Aula05 {

    public static void main(String[] args) {
   /*    
    Conta Gabriel = new Conta("Gabriel", "CP");
        Gabriel.abrirConta();
        System.out.println("Seu saldo e:" + Gabriel.getSaldo());
        Gabriel.pagarMensal();
        System.out.println("Seu saldo e:" + Gabriel.getSaldo());
        Gabriel.sacar();
        System.out.println("Seu saldo e:" + Gabriel.getSaldo());
        Gabriel.fecharConta();
    */
   ContaBanco conta1 = new ContaBanco();
   
   conta1.setDono("Gabriel");
   conta1.setNumConta(1111);
   conta1.abrirConta("CC");
   conta1.estadoAtual();
   
   ContaBanco conta2 = new ContaBanco();
   conta2.setDono("Carlos");
   conta2.setNumConta(1112);
   conta2.abrirConta("CP");
   conta2.estadoAtual();
   conta2.pagarMensal();
   conta2.estadoAtual();
    }
}
