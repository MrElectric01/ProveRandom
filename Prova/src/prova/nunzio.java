// Nome del file: nunzio.java
package prova;

public class nunzio {
    // Campi della classe
    private String nome;
    private int eta;

    // Costruttore della classe
    public nunzio(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Metodi della classe
    public void stampaDettagli() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }
}
