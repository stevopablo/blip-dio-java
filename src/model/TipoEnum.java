package model;

public enum TipoEnum {
    GUERREIRO,
    MAGO,
    MONGE,
    ARQUEIRO,
    NINJA,
    CAVALEIRO;
    
    public int Vida() {
        switch (this) {
            case ARQUEIRO:
                return 10;
            case GUERREIRO:
                return 15;
            case MAGO:
                return 17;
            case MONGE:
                return 8;
            case NINJA:
                return 12;
            case CAVALEIRO:
                return 22;
            default:
                return 0;
        }
    }

    public double Dano() {
        switch (this) {
            case ARQUEIRO:
                return 10.0;
            case GUERREIRO:
                return 15.0;
            case MAGO:
                return 20.0;
            case MONGE:
                return 8.0;
            case NINJA:
                return 12.0;
            case CAVALEIRO:
                return 18.0;
            default:
                return 0.0;
        }
    }

    public String Defender() {
        switch (this) {
            case ARQUEIRO:
                return "Defender com escudo leve";
            case GUERREIRO:
                return "Defender com escudo pesado";
            case MAGO:
                return "Defender com barreira mágica";
            case MONGE:
                return "Defender com esquiva";
            case NINJA:
                return "Defender com agilidade";
            case CAVALEIRO:
                return "Defender com armadura completa";
            default:
                return "Defesa desconhecida";
        }
    }

    public String Atacar() {
        switch (this) {
            case ARQUEIRO:
                return "Atacar com flecha";
            case GUERREIRO:
                return "Atacar com espada";
            case MAGO:
                return "Atacar com magia";
            case MONGE:
                return "Atacar com artes marciais";
            case NINJA:
                return "Atacar com shuriken";
            case CAVALEIRO:
                return "Atacar com lança";
            default:
                return "Ataque desconhecido";
        }
    }
}
