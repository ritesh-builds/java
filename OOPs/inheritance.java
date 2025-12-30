package OOPs;
class pokemon{
    int power;
    String type;
    pokemon(String type, int power){
        this.type = type;
        this.power = power;
    }
    pokemon(){}
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}
class LegendaryPokemon extends pokemon{
    String Ability;
}
class strongPokemon extends pokemon{
    int speed;
}
class godPokemon extends pokemon{
    char tag;
}
public class inheritance {
    public static void main(String[] args) {


        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.Ability = "Pressure";
        mewtwo.print();

        pokemon pikachu = new pokemon("electric",100);
        pikachu.print();
    }
}
