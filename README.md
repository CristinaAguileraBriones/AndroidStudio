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

## Agregar Librerías con Gradle en Android Studio

Para agregar nuevas funcionalidades a tu proyecto de Android, como el uso de elementos como `CardView`, necesitas incluir las bibliotecas correspondientes en tus archivos Gradle (`build.gradle`).

### Paso a Paso

1. **Abrir el Archivo `build.gradle` de la Aplicación**

   - En Android Studio, abre tu proyecto.
   - Encuentra y abre el archivo `build.gradle` que está dentro del directorio `app`.

2. **Agregar Dependencia para CardView**

   Asegúrate de que el archivo `build.gradle` de tu aplicación incluya la dependencia para `CardView`. Esta dependencia te permitirá utilizar el `CardView` en tus layouts XML.

   ```groovy
   dependencies {
       implementation 'androidx.cardview:cardview:1.0.0'
       // Reemplaza '1.0.0' con la versión específica que deseas usar
   }

## Implementación y Uso de ScrollView en Android

En Android, `ScrollView` es un contenedor que permite desplazarse por el contenido que es más grande que la pantalla visible. Esto es útil cuando deseas mostrar una gran cantidad de información o contenido que no cabe completamente en la pantalla del dispositivo.

### Pasos para Implementar ScrollView

1. **Agregar ScrollView al Layout XML**

   El `ScrollView` se coloca al principio del archivo XML de diseño para envolver todo el contenido que deseas hacer desplazable. Aquí te mostramos cómo implementarlo:

   ```xml
   <?xml version="1.0" encoding="utf-8"?>
   <ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
       android:layout_width="match_parent"
       android:layout_height="wrap_content">

       <!-- Contenido desplazable va dentro del ScrollView -->
       <RelativeLayout
           android:layout_width="match_parent"
           android:layout_height="wrap_content">

           <!-- Aquí va el resto de tu diseño sin el encabezado redundante -->

       </RelativeLayout>

   </ScrollView>

### ScrollView

- **Envuelve todo el contenido que deseas que sea desplazable.** Ajusta `layout_width` a `match_parent` para que ocupe todo el ancho disponible.
  
- **RelativeLayout (o cualquier otro layout):** Es el contenedor interno dentro del ScrollView que contiene todos los elementos de tu diseño. Ajusta `layout_height` a `wrap_content` para que el ScrollView se expanda según el contenido dentro de él.

### Funcionamiento de ScrollView

- **Desplazamiento Vertical:** Cuando el contenido dentro del ScrollView es más grande que la pantalla, el usuario puede desplazarse hacia arriba o hacia abajo para ver el contenido que no cabe en la pantalla.

- **Compatibilidad con Elementos:** Puedes incluir cualquier elemento de diseño dentro del ScrollView, como LinearLayout, RelativeLayout, ConstraintLayout, etc.

### Consideraciones Adicionales

- **Compatibilidad:** ScrollView es compatible con casi todos los elementos de diseño y widgets de Android. Sin embargo, no es recomendable anidar múltiples ScrollView horizontal o verticalmente debido a problemas de rendimiento y comportamiento impredecible.

- **Ajuste del Contenido:** Asegúrate de ajustar adecuadamente `layout_height` dentro del contenedor interno (RelativeLayout en este ejemplo) para evitar problemas de desbordamiento o errores de diseño.

El uso adecuado de ScrollView facilita la creación de interfaces de usuario más amigables y accesibles para el usuario, especialmente cuando se necesita mostrar grandes cantidades de contenido en dispositivos con pantallas limitadas.

# En Java:

`Toast` es un tipo de mensaje emergente que se utiliza para mostrar información breve al usuario en una aplicación de Android. Para usarlo correctamente:

1. **Creación y Visualización de Toast:**
   Para crear un Toast, debes usar `Toast.makeText(this, "mensaje", Toast.LENGTH_SHORT).show();`. Aquí, `"mensaje"` es el texto que deseas mostrar y `Toast.LENGTH_SHORT` determina por cuánto tiempo se mostrará en pantalla.

2. **Asignación de IDs en XML:**
   Para interactuar con elementos específicos de tu diseño XML en Java, primero debes asignarles un ID único utilizando el atributo `android:id="@+id/nombre_etiqueta"` en cada elemento que desees manipular desde el código.

3. **Uso de `findViewById`:**
   Una vez que los elementos tienen IDs asignados, puedes crear objetos Java correspondientes a estos elementos usando `findViewById(R.id.nombre_etiqueta)`. Esto te permite interactuar con los elementos utilizando diferentes métodos proporcionados por las clases de esos elementos. Por ejemplo, puedes usar un setter para cambiar el texto de un TextView:

   ```java
   TextView textView = findViewById(R.id.mi_textview);
   textView.setText("Nuevo texto aquí");

En Java, un `Intent` se utiliza para navegar de una actividad a otra en una aplicación de Android. Para hacerlo correctamente, sigue estos pasos:

1. **Creación del Intent:**
   Debes crear un objeto `Intent` especificando la actividad actual y la actividad a la que deseas navegar. Por ejemplo:
   ```java
   Intent intent = new Intent(ActividadActual.this, ActividadDestino.class);
startActivity(intent);

Para crear una lista de elementos en una aplicación Android utilizando `ListView`, sigue estos pasos:

1. **Declaración del Array en la Clase:**
   Define un array de elementos en la clase donde deseas mostrar la lista. Por ejemplo:
   ```java
   String[] elementos = {"Elemento 1", "Elemento 2", "Elemento 3"};

ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, elementos);
listView.setAdapter(adapter);

### AndroidManifest.xml

El archivo `AndroidManifest.xml` es un archivo de configuración fundamental para una aplicación Android. Aquí se registran todos los componentes de la aplicación, como actividades, servicios, receptores de emisión (broadcast receivers) y proveedores de contenido. Además, especifica permisos que la aplicación requiere y otros metadatos importantes como la versión del SDK objetivo y configuraciones de hardware y software compatibles.

### Uso de `<label>` y `android:parentActivityName`

1. **`<label>`:**
   - **Propósito:** Se utiliza para definir el nombre legible por humanos de una actividad dentro de la aplicación.
   - **Ejemplo:**
     ```xml
     <activity android:name=".DetalleActivity">
         <intent-filter>
             <action android:name="android.intent.action.MAIN" />
             <category android:name="android.intent.category.LAUNCHER" />
         </intent-filter>
         <meta-data
             android:name="android.support.PARENT_ACTIVITY"
             android:value=".MainActivity" />
         <label>@string/nombre_actividad_detalle</label>
     </activity>
     ```
   - Aquí, `@string/nombre_actividad_detalle` se refiere a un recurso de cadena definido en `strings.xml` que contiene el nombre legible por humanos de la actividad `DetalleActivity`.

2. **`android:parentActivityName`:**
   - **Propósito:** Indica la actividad principal a la que debe regresar la aplicación cuando el usuario presiona el botón de "atrás" (back) en la barra de acciones.
   - **Ejemplo:**
     ```xml
     <activity
         android:name=".DetalleActivity"
         android:parentActivityName=".MainActivity">
         <meta-data
             android:name="android.support.PARENT_ACTIVITY"
             android:value=".MainActivity" />
         <label>@string/nombre_actividad_detalle</label>
     </activity>
     ```
   - En este caso, cuando el usuario navega desde `MainActivity` a `DetalleActivity`, la flecha de navegación (o botón de "atrás") en la barra de acciones estará presente y, al presionarlo, la aplicación regresará a `MainActivity`.

### Resumen

El archivo `AndroidManifest.xml` es esencial para la configuración y el comportamiento de una aplicación Android. Las etiquetas `<label>` y `android:parentActivityName` se utilizan para proporcionar información legible por humanos sobre las actividades de la aplicación y para gestionar la navegación hacia atrás de manera adecuada. Esto asegura una experiencia de usuario coherente y comprensible dentro de la aplicación Android.
