public class CepFormatado {
    public static void main(String[] args) {
        try {
            String formadoCep = formatarCep("222333444");
            System.out.println(formadoCep);
        } catch (CepInvalido e) {
            // TODO Auto-generated catch block
            System.out.println("formato invalido");
        }
    }


    static String formatarCep(String cep) throws CepInvalido{
        if(cep.length() != 8)
          throw new CepInvalido();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
