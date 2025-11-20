LibreriaApp es una aplicación Android sencilla que permite navegar entre tres secciones:

Inicio

Lista de libros

Créditos

La app muestra una lista de libros con imágenes y descripciones, permitiendo ver más detalles al tocar cada uno.

📌 ¿Qué hace esta aplicación?
✔ Navegación inferior (Bottom Navigation)

Puedes moverte entre:

Inicio: Pantalla introductoria.

Libros: Lista de libros cargados desde un modelo.

Créditos: Información del equipo.

✔ Lista de libros con RecyclerView

En la sección Libros:

Se muestran los libros con:

Título

Autor

Imagen

Descripción corta

Al tocar un libro o el botón "Ver detalles", aparece un diálogo con la descripción completa.

✔ Dialog de detalles

Se utiliza AlertDialog para mostrar información extendida del libro seleccionado.

📱 ¿Cómo usar la app?

Abrir la aplicación
→ Verás la pantalla de inicio.

Ir a la sección Libros
→ Muestra cards con los libros disponibles.

Seleccionar un libro
→ Se abre una ventana emergente con la descripción completa.

Sección Créditos
→ Información del desarrollador/equipo.

🛠 Tecnologías utilizadas

Esta aplicación fue desarrollada utilizando:

Lenguaje y entorno

Kotlin

Android Studio

Interfaz y navegación

XML layouts

RecyclerView

CardView

Navigation Component

BottomNavigationView

AlertDialog

Vector drawables

Arquitectura

Fragments

Adapter pattern para la lista de libros

Separación en paquetes (ui, model)

▶ Cómo ejecutar el proyecto

Clonar el repositorio o descargar el ZIP.

Abrir en Android Studio.

Esperar a que Gradle sincronice.

Ejecutar en un emulador o dispositivo físico.
