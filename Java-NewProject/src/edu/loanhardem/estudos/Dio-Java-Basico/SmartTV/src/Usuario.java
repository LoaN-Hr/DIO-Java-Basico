public class Usuario {
    public static void main(String[] args){
        SmartTv nossaTv = new SmartTv();

        System.out.println(nossaTv.ligada);
        System.out.println(nossaTv.canal);
        System.out.println(nossaTv.volume);

        nossaTv.ligarTV();
        System.out.println(nossaTv.ligada);

        nossaTv.aumentarCanal();
        nossaTv.aumentarCanal();
        nossaTv.aumentarCanal();
        System.out.println(nossaTv.canal);

        nossaTv.volumeAoLigarTV();
        System.out.println(nossaTv.volume);

        nossaTv.definirCanal(8);
        System.out.println(nossaTv.canal);


        nossaTv.teste(5, 7);
        System.out.println(nossaTv.volume);

        Exemplo exemplo = new Exemplo();
        System.out.println(exemplo.nome);
    }
}
