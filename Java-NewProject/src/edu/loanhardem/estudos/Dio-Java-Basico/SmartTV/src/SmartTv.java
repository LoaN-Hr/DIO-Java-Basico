public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligarTV(){
        ligada = true;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
    
    public void volumeAoLigarTV() {
        volume = 75;
    }

    public void definirCanal(int canalEscolhido) {
        canal = canalEscolhido;
    }

    // testes e estudos
    public void teste(int a, int b) {
        if (a == b) {
            volume = a;
        }else{
            volume = 10;
        }
    }

}
