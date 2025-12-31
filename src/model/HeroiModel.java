package model;

public class HeroiModel {
    private String nome;
    private int nivel;
    private int vida;
    private double ataque;
    private int idade;
    private TipoEnum tipo;

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public int getIdade() {
        return idade;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public HeroiModel(String nome, int idade, TipoEnum tipo) {
        this.nome = nome;
        this.idade = idade;
        this.nivel = 1;
        this.vida = tipo.Vida();
        this.ataque = tipo.Dano();
        this.tipo = tipo;
    }

    public void atacar() { System.out.println("O " + this.tipo + " atacou causando " + this.ataque + " de dano!"); }


}
