public final class Pokemons {
    //ATRIBUTOS
    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;
    private int choose;
    
    
    //CONSTRUTOR
    public Pokemons(int choose) {    
        this.choose = choose;           
        
        ChoosePokemon();
        calculaBonus();
        imprimePokemon();
    }

    
    //METODOS
    public int getChoose() {
        return choose;
    }

    public void setNome(int choose) {
        this.choose = choose;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    public void imprimePokemon(){
        System.out.println("Nome: " + nome + " | " +
                           "Tipo: " + tipo + " | " +
                           "Level: " + level + " | " +
                           "Vida: " + vida + " | " +
                           "Ataque: " + ataque + " | " +
                           "Defesa: " + defesa + " | ");

    }
    
    public void calculaAtributos(){
        switch(this.tipo){
            case "Fogo":
                this.vida = 50;
                this.ataque = 100;
                this.defesa = 50;
            break;
            
            case "Agua":
                this.vida = 60;
                this.ataque = 70;
                this.defesa = 50;
            break;
            
            case "Terra":
                this.vida = 70;
                this.ataque = 40;
                this.defesa = 90;
            break;
            
            case "Psiquico":
                this.vida = 60;
                this.ataque = 70;
                this.defesa = 20;
            break;
            
            case "Elétrico":
                this.vida = 70;
                this.ataque = 85;
                this.defesa = 40;
            break;
            
            
        }
    }
    private void calculaBonus(){
        
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
    }
    
    public void ChoosePokemon() {
        switch(this.choose){
            
            case 1:
                this.nome = "Charmander";
                this.tipo = "Fogo";
                this.level = 10;
                tipo = "Fogo";
                calculaAtributos();
            break;
            
            case 2:
                this.nome = "Picachu";
                this.tipo = "Elétrico";
                this.level = 30;
                tipo = "Elétrico";
                calculaAtributos();
            break;
            
            case 3:
                this.nome = "Squirtle";
                this.tipo = "Agua";
                this.level = 40;
                tipo = "Terra";
                calculaAtributos();
            break;
            
            case 4:
                this.nome = "Sandslash";
                this.tipo = "Terra";
                this.level = 30;
                tipo = "Terra";
                calculaAtributos();
            break;
            
            case 5:
                this.nome = "Mewtwo";
                this.tipo = "Psiquico";
                this.level = 30;
                tipo = "Psiquico";
                calculaAtributos();
            break;
            
            
        }
        
    }

}
