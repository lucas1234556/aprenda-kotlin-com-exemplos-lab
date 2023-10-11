enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

// Adiciona um método toString à classe Usuario
class Usuario(val nome: String) {
    override fun toString() = nome
}

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        // Adiciona o usuário à lista de inscritos
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado com sucesso em $nome!")
    }
}

fun main() {
    // Cria alguns objetos para simular cenários de teste
    val usuario1 = Usuario("Lucas")
    val usuario2 = Usuario("Carol")

    val conteudo1 = ConteudoEducacional("Programação")
    val conteudo2 = ConteudoEducacional("Web Design")

    val formacao = Formacao("Sistemas de Informação", listOf(conteudo1, conteudo2))

    // Simula matrícula de usuários
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Imprime lista de inscritos
    println("Inscritos em ${formacao.nome}: ${formacao.inscritos}")
}

