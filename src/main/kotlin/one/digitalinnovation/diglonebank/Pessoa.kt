package one.digitalinnovation.diglonebank
//Primeira classe criada dentro do pacote one.digitalinnovation.diglonebank
class Pessoa {
    var name :  String  =  " Alexandre "
    var cpf :  String  =  " 123.123.123-11 "
    private set // Servir para que uma cpf variável não seja alterada em outro lugar na aplicação. Ela atribui
    // um valor fixo.

    // classe interna Endereco {// classe interna - classe interna ->
    // var rua: String = "Rua Teste"

    // Obs: A classe interna pode ter modificadores de visibilidade: público, protegido, privado ou nenhum
    // (privado ao pacote). A classe interna pode ser declarada com caso estático ela não precisa acessar nenhum
    // membro da classe externa. Nesse caso, a classe interna pode ser instanciada mesmo sem uma instância da
    // classe externa. }

    constructor() // Uma classe também pode declarar construtores secundários , que são prefixados com constructor

    fun pessoaInf() = "O meu nome é $name e meu cof é $cpf." //recurso de interpolação ou intercalação de strings

    // Uma classe em Kotlin pode ter um construtor primário e um ou mais construtores secundários . O construtor
    // primário é uma parte do cabeçalho da classe e vai depois do nome da classe e dos parâmetros de tipo
    // opcionais.


}

//Função principal para teste
fun main () {
    val suaIdentidade =  Pessoa () // A variável suaIndetidade recebe uma classe (instância) Pessoa com
    // sua variáveis ​​com um fator de criar um objeto.

    // suaIdentidade.cpf = "454" -> Servir para alterar a variável, caso ela não esteja em módulo privado.
    // suaIdentidade.name = "Fernando" -> Servir para alterar a variável, caso ela não está em módulo privado.

    //println (suaIdentidade.name)
    //println (suaIdentidade.cpf)
    // println (suaIdentidade.Endereco (). rua) -> Classe interna -> Classe Interna

    println(suaIdentidade.pessoaInf())
}