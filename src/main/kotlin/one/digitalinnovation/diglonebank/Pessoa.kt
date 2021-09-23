package one.digitalinnovation.diglonebank
//Primeira classe criada dentro do pacote one.digitalinnovation.diglonebank
class Pessoa {
    var name: String = "Alexandre"
    var sexo: String = "Masculino"
    var cpf: String = "123.123.123-11"
}

//Função principal para teste
fun main () {
    val suaIdentidade = Pessoa() //A variável sua indetidade recebe a classe (instância) Pessoa com sua variáveis.

    println(suaIdentidade.name)
    println(suaIdentidade.sexo)
    println(suaIdentidade.cpf)
}