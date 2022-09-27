
package aula05;

public class Aula05 {

    public static void main(String[] args) {
       
    Conta Gabriel = new Conta("Gabriel", "CP");
        Gabriel.abrirConta();
        System.out.println("Seu saldo e:" + Gabriel.getSaldo());
        Gabriel.pagarMensal();
        System.out.println("Seu saldo e:" + Gabriel.getSaldo());
        Gabriel.sacar();
        System.out.println("Seu saldo e:" + Gabriel.getSaldo());
        Gabriel.fecharConta();
    }
}
