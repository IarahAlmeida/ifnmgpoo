package br.edu.ifnmg.poo;

/**
 *
 * @author Iarah
 */
public class PessoaFisica extends Pessoa {
    public long cpf;
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public long getCpf() {
        return cpf;
    }
}