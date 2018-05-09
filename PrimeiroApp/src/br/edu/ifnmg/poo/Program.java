package br.edu.ifnmg.poo;

/**
 *
 * @author Iarah
 */
public class Program {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa(0, "Nome");
        PessoaFisica pf1 = new PessoaFisica();
        PessoaFisica pf2 = new PessoaFisica(1, "Nome", 1234567890123L);
        Empregado e1 = new Empregado();
        e1.matricula = 123456789;
        System.out.println(e1.matricula);
        pf1.setNome("Paulo Troxa");
        pf1.setCpf(45454545);
        pf1.cpf = 45454646;
        System.out.println(pf1.getNome());
        System.out.println(pf1.getCpf());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(pf1);
        System.out.println(pf2);
        
        /*
        Cao c1 = new Cao();
        Cao c2 = new Cao();
        Cao c3 = new Cao();
        c1.setNome("Fifi");
        c1.setRaca("poodle");
        c1.setCor("rosa");
        c1.setPeso((float) 0.5);
        c1.setIdade(2);
        c1.setLatido("Soprano");
        System.out.println(c1.getNome());
        System.out.println(c1.getRaca());
        System.out.println(c1.getCor());
        System.out.println(c1.getPeso());
        System.out.println(c1.getIdade());
        System.out.println(c1.getLatido());
        c2.setNome("Killer");
        c2.setRaca("rottweiler");
        c2.setCor("preto");
        c2.setPeso(50);
        c2.setIdade(5);
        c2.setLatido("Baritono");
        System.out.println(c2.getNome());
        System.out.println(c2.getRaca());
        System.out.println(c2.getCor());
        System.out.println(c2.getPeso());
        System.out.println(c2.getIdade());
        System.out.println(c2.getLatido());
        c3.setNome("Max");
        c3.setRaca("labrador");
        c3.setCor("branco");
        c3.setPeso(35);
        c3.setIdade(4);
        c3.setLatido("Tenor");
        System.out.println(c3.getNome());
        System.out.println(c3.getRaca());
        System.out.println(c3.getCor());
        System.out.println(c3.getPeso());
        System.out.println(c3.getIdade());
        System.out.println(c3.getLatido());
        */
    }
}
