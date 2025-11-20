package com.cristobal.libreriaapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cristobal.libreriaapp.R
import com.cristobal.libreriaapp.model.Book

class BookAdapter(
    private val books: List<Book>,
    private val onBookClick: (Book) -> Unit
) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    inner class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val image: ImageView = itemView.findViewById(R.id.bookImage)
        private val title: TextView = itemView.findViewById(R.id.bookTitle)
        private val author: TextView = itemView.findViewById(R.id.bookAuthor)
        private val shortDescription: TextView = itemView.findViewById(R.id.bookShortDescription)
        private val detailsButton: Button = itemView.findViewById(R.id.detailsButton)

        fun bind(book: Book) {
            image.setImageResource(book.portadaResId)
            title.text = book.titulo
            author.text = "Autor: ${book.autor}"
            shortDescription.text = book.descripcionCorta

            // Click en toda la card
            itemView.setOnClickListener {
                onBookClick(book)
            }

            // Click solo en el botón "Ver detalles"
            detailsButton.setOnClickListener {
                onBookClick(book)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int = books.size

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(books[position])
    }
}
