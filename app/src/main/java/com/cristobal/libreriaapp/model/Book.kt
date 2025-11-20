package com.cristobal.libreriaapp.model

import com.cristobal.libreriaapp.R

data class Book(
    val id: Int,
    val titulo: String,
    val autor: String,
    val descripcionCorta: String,
    val descripcionLarga: String,
    val portadaResId: Int
)

/**
 * Lista de libros de ejemplo que se mostrarán en el RecyclerView.
 */
object BookData {

    val books: List<Book> = listOf(
        Book(
            id = 1,
            titulo = "Cien años de soledad",
            autor = "Gabriel García Márquez",
            descripcionCorta = "Una obra maestra del realismo mágico.",
            descripcionLarga = "“Cien años de soledad” narra la historia de la familia Buendía a lo largo de varias generaciones en el pueblo ficticio de Macondo. La novela mezcla elementos fantásticos con la realidad latinoamericana, abordando temas como la soledad, el poder, el destino y la memoria colectiva.",
            portadaResId = R.drawable.libro1
        ),
        Book(
            id = 2,
            titulo = "El Principito",
            autor = "Antoine de Saint-Exupéry",
            descripcionCorta = "Un clásico sobre la infancia y la imaginación.",
            descripcionLarga = "“El Principito” es un relato poético que sigue a un pequeño príncipe que viaja de planeta en planeta. A través de sus encuentros, cuestiona la forma en que los adultos ven el mundo y rescata el valor de la amistad, la inocencia y el amor propio.",
            portadaResId = R.drawable.libro2
        ),
        Book(
            id = 3,
            titulo = "1984",
            autor = "George Orwell",
            descripcionCorta = "Una novela distópica sobre control y vigilancia.",
            descripcionLarga = "“1984” presenta un futuro totalitario donde el Gran Hermano vigila todos los aspectos de la vida. El protagonista, Winston Smith, lucha internamente contra la opresión del régimen, cuestionando la manipulación de la verdad, la pérdida de la libertad y la deshumanización.",
            portadaResId = R.drawable.libro3
        )
    )
}
