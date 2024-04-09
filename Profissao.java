// Inicio da classe Profissao
public class Profissao {

// Atributos da classe Profissao     
      String nome;
      byte anosExperiencia;
      float salario;
      String descricao;

// Criando um método construtor para a classe Profissao
public Profissao (String nomeArg, byte anosExperienciaArg, float salarioArg, String descricaoArg) {
      nome= nomeArg;
      anosExperiencia= anosExperienciaArg;
      salario = salarioArg;
      descricao = descricaoArg; 
      
}
// Método para exibição dos atributos da Profissao; 
public void exibirInformacao() {
   System.out.println("Nome: " + nome);
   System.out.println("Experiencia: " + anosExperiencia);
   System.out.println("Salario: " + salario);
   System.out.println("Descricao: " + descricao);
}

//Método para teste de classe e criação de objeto de profissao
       public static void main(String args[]) {

             Profissao prof1 = new Profissao ("Programador Júnior", 
                                              (byte) 1, 14000.50f,"Java");
            
             prof1.exibirInformacao();

 

   }

}