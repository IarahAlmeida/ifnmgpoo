package br.edu.ifnmg.poo;

/**
 *
 * @author Iarah
 */
public class PessoaFisica extends Pessoa {
    public long cpf;
    public PessoaFisica() {
        this.cpf = 0;
    }
    public PessoaFisica(int id, String nome, long cpf) {
        super(id, nome);
        this.cpf = cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public long getCpf() {
        return cpf;
    }
    @Override
    public String toString() {
        return super.toString() + "\t" + this.cpf;
    }
}