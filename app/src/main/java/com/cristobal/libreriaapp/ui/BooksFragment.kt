package com.cristobal.libreriaapp.ui

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cristobal.libreriaapp.R
import com.cristobal.libreriaapp.model.Book
import com.cristobal.libreriaapp.model.BookData

class BooksFragment : Fragment() {

    private lateinit var recyclerBooks: RecyclerView
    private lateinit var adapter: BookAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_books, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerBooks = view.findViewById(R.id.recyclerBooks)

        // Configuramos el RecyclerView
        recyclerBooks.layoutManager = LinearLayoutManager(requireContext())

        adapter = BookAdapter(BookData.books) { book ->
            mostrarDetallesLibro(book)
        }

        recyclerBooks.adapter = adapter
    }

    /**
     * Muestra un AlertDialog con la descripción del libro al hacer clic.
     */
    private fun mostrarDetallesLibro(book: Book) {
        AlertDialog.Builder(requireContext())
            .setTitle(book.titulo)
            .setMessage(
                "Autor: ${book.autor}\n\n${book.descripcionLarga}"
            )
            .setPositiveButton("Cerrar", null)
            .show()
    }
}
