package one.digitalinnovation.diglonebank
//Classe pessoa criada dentro do pacote one.digitalinnovation.diglonebank
class Pessoa {
    var name: String = "Alexandre"
    var cpf: String = "123.123.123-11"
    private set //Serve para que a variável cpf não seja alterada em outro lugar na aplicação. Ela atribui
        // um valor fixo.

    //inner class Endereco { //inner class - classe interna ->
        //var rua: String = "Rua Teste"

    //Obs: A classe interna pode ter modificadores de visibilidade: public , protected , private ou nenhum
    // (privado ao pacote). A classe interna pode ser declarada com static caso ela não precise acessar nenhum
    // membro da classe externa. Nesse caso, a classe interna pode ser instanciada mesmo sem uma instância da
    // classe externa.    }

}

//Função principal para teste
fun main () {
    val suaIdentidade = Pessoa() // A variável suaIndetidade recebe a classe (instância) Pessoa com
    // sua variáveis com a finalidade de criar um um objeto.

    //suaIdentidade.cpf = "454" -> Serve para alterar a variável, caso ela não esteja em módulo privado.
    //suaIdentidade.name = "Fernando" -> Serve para alterar a variável, caso ela não esteja em módulo privado.

    println(suaIdentidade.name)
    println(suaIdentidade.cpf)
    //println(suaIdentidade.Endereco().rua) -> Classe interna -> Inner Class

}