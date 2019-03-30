package ex1;
public class Ex1 {
    public static void main(String[] args) {
        Animal animais[] = new Animal[3];
        animais[0] = new Cachorro("Doginho",1);
        animais[1] = new Cavalo("Pé pano",2);
        animais[2] = new Preguica("Manhosa",8);
        for(int i = 0; i < 3; i++){
            animais[i].falar();
        }
    }
    
}
