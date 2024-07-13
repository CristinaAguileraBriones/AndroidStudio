# AndroidStudio
Learning project in Android Studio, consisting of simple applications. The exercises include an IBM calculator, an application for converting inches to meters, and a restaurant application. Now, I´m adding my own learnings I catch while I´m doing all this activities:

# Apuntes sobre XML en Android Studio

### Cabecera
En Android Studio, cuando trabajamos con XML para definir layouts de interfaces de usuario, es común utilizar la función de autocompletado para agilizar la creación y edición de archivos XML. Esto nos permite definir la estructura y los atributos de los elementos que componen la interfaz de manera más eficiente.

### Contenedores
Los contenedores son elementos fundamentales en XML para organizar y estructurar el diseño de la interfaz de usuario en Android. Algunos de los contenedores más utilizados son:

- **LinearLayout**: Organiza elementos de manera lineal, ya sea horizontal o verticalmente. Se especifica la orientación con el atributo `android:orientation`.
  - Para agregar elementos dentro de un `LinearLayout`, podemos utilizar `<`.
  - Si solamente tiene atributos sin elementos internos, se utiliza `/`.

### Elementos
Los elementos son componentes individuales que componen la interfaz de usuario en Android. Algunos elementos comunes incluyen:

- **TextView**: Permite mostrar texto en la interfaz de usuario. Se utiliza el atributo `android:text` para establecer el texto.
  
- **Button**: Representa un botón interactivo que los usuarios pueden presionar para realizar acciones. Utiliza el atributo `android:text` para establecer el texto del botón.
  
- **EditText**: Permite que los usuarios introduzcan y editen texto. Utiliza el atributo `android:hint` para mostrar un texto de ayuda cuando el campo está vacío.
  
- **RadioButton**: Se utiliza en conjunto con `RadioGroup` para crear grupos de botones de selección exclusiva, donde solo se puede seleccionar un botón a la vez dentro del grupo.
  
- **ImageView**: Muestra una imagen en la interfaz de usuario. Utiliza el atributo `android:src` para especificar la imagen que se mostrará.

### Atributos
Los atributos son propiedades que se pueden aplicar a los elementos en XML para controlar su apariencia y comportamiento. Algunos atributos comunes incluyen:

- `android:layout_height` y `android:layout_width`: Determinan la altura y el ancho del elemento. Se pueden establecer como `match_parent` para que el elemento ocupe todo el espacio disponible del padre, o `wrap_content` para que el tamaño se ajuste al contenido dentro del elemento.
  
- `android:orientation`: Especifica la orientación de los elementos dentro de un contenedor, como `horizontal` o `vertical`.
  
- `android:gravity`: Define la alineación del contenido dentro del elemento, como `center`, `start`, `end`, `top`, `bottom`, etc.
  
- `android:margin` y `android:padding`: Controlan los márgenes y el relleno alrededor del elemento para ajustar su posición y espacio respecto a otros elementos y el borde del contenedor.
  
- `android:hint`: Proporciona un texto de sugerencia o guía que aparece en un `EditText` cuando está vacío.
  
- `android:text`: Establece el texto que se mostrará en un `TextView` o `Button`.
