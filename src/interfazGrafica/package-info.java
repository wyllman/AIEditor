/** 
 * Descripción: Paquete contenedor de todas las clases definitorias de la interfaz gráfica del
 *    programa.
 *    
 * Implementados:    - VentanaAyuda (v0.010)
 *                     VentanaAutor (usar ventana ayuda)
 *    
 * Por implementar:  - VentanaPrincipal (v0.004)
 *                   - BarraMenu (v0.003)
 *                   - ZonaTrabajo (v0.001)
 *                   - VentanaInterna (v0.003)
 *                   - BarraInformacionGrafica (v0.001)
 *                   - PanelGraf256 (v0)
 *                   - PanelInformacion (v0)
 *                   - PanelBriCont (v0)
 *                   - PanelPerfil (v0)
 *                   
 *                   
 * Versiones:
 *    + VentanaPrincipal:
 *         *- v0: Definir los atributos para la colocación y tamaño inicial de la ventana.
 *                Definir los constructores y la función Inicializar ().
 *                Definir la funcion main del programa.
 *               
 *         *- v0.001: Integrar la clase menú en la ventana principal.
 *         
 *         *- v0.002: Integrar la clase zonaTrabajo.
 *         
 *         *- v0.003: Posibilitar y controlar correctamente el redimensionado.
 *                    Colocar la barra de información sobre la posicion(x,y) y color (rgb) del 
 *                    pixel apuntado por el cursor del raton.
 *                    Enlazar la barra de información con la ventana interna actual
 *                    (Crear una función actualizar valores de barraInformacion)
 *                    (Crear una función resetear valores de barraInformacion).
 *         
 *         - v0.004:  Crear y añadir una barra de herramientas, debajo de la barra de menu.
 *                    
 *         
 *    + BarraMenu:
 *         *- v0: Definir los atributos y la colocación.
 *                Definir los primeros menús (archivo y ayuda).
 *                Definir listeners básicos para cada ítem de los menús.
 *         
 *         *- v0.001:  Hacer uso del gestor de eventos para los listeners de cada ítem del los
 *                     menús.(Uso de clase contenedora propia para los eventos).
 *         
 *         *- v0.002: Definir el ítem "Cargar." para el menú "Archivo.".
 *                    Enlazarle el ítem "cargar" con su correspondiente listener.
 *                    Añadida un atributo referencia del objeto VentanaPrincipal.
 *                    
 *         - v0.003:  *Añadir una lista accesible de las ventanas internas abiertas.
 *                    --Añadir opcion cerrar(ventana interna actual) al menu archivo.
 *                    Añadir nuevos menús:
 *                       + Edición (*Seleccionar, cambiar niveles, *copiar, *Deseleccionar ...)
 *                       + Información (*histogramas, niveles, rangos, ..., *PanelInformacion, *Panel Perfil)
 *                       + Herramientas (detectar bordes, ...)
 *                       + Transformación (*negativizar, escalado, rotaciones, ..., *Brillo/Contraste)
 *                    
 *         
 *    + VentanaAyuda:
 *         *- v0: Definir sus atributos (colocación y tamaño).Añadido titulo y texto.
 *                Definir y añadir una zona para texto.
 *                Definir y añadir un botón "Cerrar." para la subventana.
 *                Añadidos los constructores necesarios para usar esta misma clase como 
 *                ventanaAutor         
 *         
 *         - v0.010: Pasarle el texto a mostrar por archivo.
 *                   Configurar adecuadamente el JTextArea.
 *    
 *    + ZonaTrabajo:
 *         *- v0: Definir los atributos (colocación, tamaño, ...).(JDesktopPane)
 *                Definir el vector de ventanas internas.
 *                Definir la función nuevaVentanaInterna (imagen o graphics).
 *                
 *         - v0.001: --Asignar un identificador a cada ventana interna y controlar cuál
 *                   es la ventana interna activa (sobre la que se va a trabajar).
 *                   *Crear un atributo que sea una referencia a la ventInt activa.
 *                   --Recolocar las ventanas internas cuando se abre una nueva, para no estar
 *                   situada exactamente en la misma posición que otra.
 *                   *Sobrecargar el metodo nuevaVentana para crear una ventana interna nueva 
 *                   pasándole un bufferedImage.
 *                   
 *         
 *    + VentanaInterna:
 *         *- v0: Definir los atributos (colocación, tamaño, ...).
 *                Definir ZonaPintado (JPanel u otro).
 *                
 *         *- v0.001: Inicializar correctamente la zona de pintado (crear una función 
 *                    inicializar zona pintado).
 *                   
 *                    El constructor abrirá un FileChooser para cargar una imagen a 
 *                    mostrar en la zona de pintado.
 *                    Mostrar la imagen en la zona de pintado.
 *                    Controlar que el ancho y alto de la ventana interna no sea menor de 150.
 *                   
 *         *- v0.002: Incializar el gestor de eventos de la ventana interna.
 *                    Cambiar el atributo image por bufferedimage(poder obtener RGB).
 *                    --Crear una funcion actualizar zona pintado.(crear objeto image 
 *                    para graphics).
 *                    --Colocar reglas como bordes de la imagen.
 *                    --Crear funcion convertir image a bufferedimage (codigo en el mouse 
 *                    listener).
 *                    Usar la clase Color para intRGB a intR, intG, intB.
 *                    --Añadir un atributo para controlar si es la imagen original o no.
 *                    Inicializar un gestor de eventos propios.
 *                    Traspasar los listener al gestor de eventos poropios.
 *                    Si la zonaPintado es mayor que la ventana colocar barras de scroll.
 *                    Crear un JScrollPanel intermedio para la Zona de pintado (Cuando la imagen
 *                    sea mayor que la ventana interna se añadirán dos barras de desplazamiento
 *                    para poder ver las partes ocultas de la imagen).
 *                    Enlazar el JScrollPanel con la ventana interna, la zona de pintado y los
 *                    eventos para que funcione correctamente.
 *              
 *         - v0.003:  *Añadir un objeto que contenga la información del histograma de la imagen
 *                    cargada.
 *                    *Añadir constructor pasandole un bufferedImage como argumento.
 *                    *Ahora tenemos dos BufferedImage uno con la imagenOriginal y otra con la 
 *                    imagen en escala de grises.
 *                    *Añadida una funcion para controlar qué bufferedImage usamos y otra para 
 *                     intercamciarlas.
 *                    --Crear funcion para retornar una subImagen(BufferedImage), pasandole el
 *                    "rectangulo" de la imagen actual a copiar.
 *                    *Añadir un atributo rectangulo para resaltar en la imagen.
 *                    *Hacer que se muestre el rectangulo de resalte cundo sea válido (paintComponent.
 *                    Cambiar el cursor al modo de trabajo actual (icono del cursor dentro de la imagen).
 *                    
 *              
 *   + BarraInformacionGrafica:
 *        *- v0: Definir los atributos (colocación, tamaño, ...).
 *               Crear zonas de texto para X, Y, R, G, B.
 *              
 *        - v0.001:
 *      
 *   + PanelGraf256:
 *        - v0: *Creados los atributos y funciones básicas para un JPanel que muestre una gráfica
 *              de barras sobre 256 valores para el eje X
 *              *Crear la funcion cargar datos con un vector de enteros como parametros de entrada.
 *              
 *   + PanelInformacion:
 *        - v0: *Creados los atributos y funciones básicas para un JDialog que muestre la informacion 
 *              de la imagen activa.
 *              *Crear un boton para mostrar/ocultar el histograma acumulativo.
 *                        
 *   + PanelBriCont:
 *        - v0: *Creados los atributos y componentes para el funcionamiento del panel.
 *        
 *   + PanelPerfil:
 *        - v0: *Creados los atributos y componentes para el funcionamiento del panel.
 *                  
 */

package interfazGrafica;