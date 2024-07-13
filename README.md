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

- **RelativeLayout**: Permite posicionar elementos relativos a otros elementos dentro del contenedor. Utiliza atributos como `android:layout_below`, `android:layout_alignParentTop`, etc., para definir las relaciones de posición.

### Elementos
Los elementos son componentes individuales que componen la interfaz de usuario en Android. Algunos elementos comunes incluyen:

- **TextView**: Permite mostrar texto en la interfaz de usuario. Se utiliza el atributo `android:text` para establecer el texto.
  
- **Button**: Representa un botón interactivo que los usuarios pueden presionar para realizar acciones. Utiliza el atributo `android:text` para establecer el texto del botón.
  
- **EditText**: Permite que los usuarios introduzcan y editen texto. Utiliza el atributo `android:hint` para mostrar un texto de ayuda cuando el campo está vacío. El atributo `android:inputType` especifica el tipo de datos que se espera ingresar, como `text`, `number`, `phone`, `date`, entre otros.

- **RadioButton**: Se utiliza en conjunto con `RadioGroup` para crear grupos de botones de selección exclusiva, donde solo se puede seleccionar un botón a la vez dentro del grupo.
  
- **ImageView**: Muestra una imagen en la interfaz de usuario. Utiliza el atributo `android:src` para especificar la imagen que se mostrará.

### Atributos
Los atributos son propiedades que se pueden aplicar a los elementos en XML para controlar su apariencia y comportamiento. Algunos atributos comunes incluyen:

- `android:layout_height` y `android:layout_width`: Determinan la altura y el ancho del elemento. Se pueden establecer como `match_parent` para que el elemento ocupe todo el espacio disponible del padre, o `wrap_content` para que el tamaño se ajuste al contenido dentro del elemento.
  
- `android:orientation`: Especifica la orientación de los elementos dentro de un contenedor, como `horizontal` o `vertical`.
  
- `android:gravity`: Define la alineación del contenido dentro del elemento, como `center`, `start`, `end`, `top`, `bottom`, etc.
  
- `android:layout_gravity`: Se aplica a los hijos de un contenedor para controlar su alineación dentro de ese contenedor.
  
- `android:margin` y `android:padding`: Controlan los márgenes y el relleno alrededor del elemento para ajustar su posición y espacio respecto a otros elementos y el borde del contenedor.
  
- `android:hint`: Proporciona un texto de sugerencia o guía que aparece en un `EditText` cuando está vacío.
  
- `android:text`: Establece el texto que se mostrará en un `TextView` o `Button`.
  
- `inputType: tipo_dato`: Restringe el tipo de dato que el usuario puede introducir.
  
- fontFamily: El atributo android:fontFamily se utiliza en elementos como TextView y Button para especificar la familia tipográfica que se utilizará para el texto. Puedes elegir entre fuentes predefinidas como sans-serif, serif, monospace, o referenciar una fuente personalizada en tu proyecto.

- ### textSize

En XML de Android, el atributo `android:textSize` se utiliza para definir el tamaño del texto mostrado dentro de elementos como `TextView` y `Button`. Este atributo especifica el tamaño del texto utilizando diferentes unidades, típicamente `sp` (píxeles de escala independiente), `dp` (píxeles de densidad independiente) o `px` (píxeles).

#### Ejemplo de Uso:

```xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Texto de Ejemplo"
    android:textSize="18sp" />

### ListView
ListView es un componente que permite mostrar una lista de elementos desplazables en Android. Se utiliza junto con un adaptador para proporcionar los datos que se mostrarán en la lista. Algunos puntos clave sobre ListView incluyen:

- **Adapter**: Necesario para proporcionar los datos y establecer la apariencia de cada elemento en la lista.
- **Desplazamiento**: ListView maneja automáticamente el desplazamiento de la lista cuando hay muchos elementos para mostrar.
- **Personalización**: Permite personalizar la apariencia de los elementos de la lista mediante adaptadores personalizados y diseño de elementos de lista.

Estos conceptos y elementos son fundamentales para el desarrollo de interfaces de usuario en Android usando XML y proporcionan la base para crear aplicaciones visualmente atractivas y funcionales.
