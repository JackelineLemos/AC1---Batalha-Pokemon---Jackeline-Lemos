import java.util.Scanner;

class Main {
  public static void main(String[] args){
        int Poke1;
        int Poke2;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("***********Escolha seu Pokemon*************");
        System.out.println("***********1-  Charmander  *************");
        System.out.println("***********2-  Picachu     *************");
        System.out.println("***********3-  Squirtle    *************");
        System.out.println("***********4-  Sandslash   *************");
        System.out.println("***********5-  Mewtwo      *************");
        Poke1 = ler.nextInt();
        
        System.out.println("***********Escolha seu Oponente*************");
        System.out.println("***********1-  Charmander      *************");
        System.out.println("***********2-  Picachu         *************");
        System.out.println("***********3-  Squirtle        *************");
        System.out.println("***********4-  Sandslash       *************");
        System.out.println("***********5-  Mewtwo          *************");
        Poke2 = ler.nextInt();
        
        //INSTANCIAR UM OBJETO DO TIPO POKEMON
        Pokemons pokemon1 = new Pokemons(Poke1);//OBJETO
        Pokemons pokemon2 = new Pokemons(Poke2);//OBJETO
                        
        int vidaPokemon1 = pokemon1.getVida();
        int vidaPokemon2 = pokemon2.getVida();
        
        if(vidaPokemon1 > vidaPokemon2) {
            System.out.println("Seu Pokemon Venceu");
        }else if (vidaPokemon1 < vidaPokemon2){
            System.out.println("Seu Pokemon Perdeu");
        }else{
            System.out.println("Seu Pokemon Empatou");
        }
  } 
}