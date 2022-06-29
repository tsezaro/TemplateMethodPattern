import java.time.LocalDate

abstract class Contenido(
    var presupuesto: Int){

    open fun esInteresante() = presupuesto >5 && cumpleCriterioInteresante()

    abstract fun cumpleCriterioInteresante(): Boolean
}


class Seriee(
    presupuesto: Int,
    var temporadas: Int = 5
) : Contenido(presupuesto){

    override fun cumpleCriterioInteresante() = temporadas < 5
}

class Peliculaa(
    presupuesto: Int,
    var fechaDeEstreno: LocalDate = LocalDate.now()
): Contenido(presupuesto){

    override fun cumpleCriterioInteresante() = fechaDeEstreno.year == LocalDate.now().year
}