package model;

/**
 *
 * @author Heloiza
 */
public class Funcionario {
    
    private String nome;
    private int idade;
    private String salario;
    private String cargo;
    private Bonus bonus;
    private HistoricoBonus historico;
    
    
    public Funcionario() {
    }

    
    public Funcionario(String nome, int idade, String salario, String cargo, Bonus bonus) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
        this.bonus = bonus;
    }
    
    
    
}
