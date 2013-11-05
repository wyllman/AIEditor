/**
 * Descripci—n: Paquete contenedor de todas las clases encargadas de las gestiones internas 
 *    del programa.
 *    
 * Implementados:
 *    
 * Por implementar:  - GestorEventos (v0)
 *                   - EventosBarraMenu (v0.003)
 *                   - EventosVentInterna (v0.002)
 *                   - GestorHerramientas (v0)
 *            
 * Versiones: 
 *    + GestorEventos:
 *         - v0: Dise–ar un contenedor adecuado para los grupos (de clases) de eventos.
 *    
 *    + EventosBarraMenu:
 *         *- v0: Implementar los listeners para los eventos de cada ’tem de los menœs de la
 *                barra de menœ.
 *         
 *         *- v0.001: Integrar el uso del la clase VentanaAyuda para la ventana de ayuda y
 *                    autores accesibles desde la barra de  menœ.
 *         
 *         *- v0.002: Crear el listener para la opci—n "Cargar.".
 *                   --Crear el atributo FileChooser para la carga de una imagen (Àaqu’ o en 
 *                   la ventana interna?).
 *                   Enlazar el nuevo listener con la funci—n nuevaVentanaIntera (...) de la 
 *                   clase VentanaPrincipal. (Creando un atributo referencia a la clase 
 *                   VentanaPrincial).
 *                   Darle el foco a la nueva ventana interna creada.
 *         
 *         - v0.003: *Arreglados los eventos para utilizar el bufferedImage activo.
 *                   *A–adidos los eventos para las opciones "Histograma Absoluto." y "Histograma
 *                    Acumulativo" utilizando JDialog para mostrarlos.
 *                   *A–adidos los eventos para seleccionar, deseleccionar y copiar selecci—n.
 *                   *A–adido el evento para la opci—n negativizar.
 *                   *A–adidos los eventos para las opciones Panel Perfil y Brillo/Contraste.
 *         
 *    + EventosVentInterna:
 *         *- v0:  Evento que retorna el pixel X,Y sobre el que est‡ el raton. 
 *                 Evento obtener la activacion de una ventana interna.(InternalFrameListener).
 *                    
 *                 
 *         *- v0.001: A–adir los listeners para el redimensionado de la ventana (que 
 *                    actœa sobre el JScrollpanel, redimensionandolo).
 *                    Arreglar los listeners que retornan el pixel X,Y sobre el que est‡ el 
 *                    rat—n (Si el JScrollpanel era m‡s grande que JPanel de la imagen al 
 *                    pasar el rat—n por la zona exterior a la imagen, se producia una 
 *                    excepci—n en el uso de la funci—n getRGB sobre la imagen).
 *                    Cuando el raton sale de la zona de imagen, la barra de informaci—n de la 
 *                    ventana principal se resetea para no mostrar informaci—n antigua.
 *                    Establecidos unos limites minimos de anchura y altura para la ventana 
 *                    interna  a la hora de redimensionarla (componentResized())
 *                    Cuando se mueve una ventana Interna se repintan todo el resto de ventanas 
 *                    internas abiertas hasta ahora en el programa (componentMoved() - Para 
 *                    evitar errores gr‡ficos de visualizacion del JScrollPanel o del JPanel).
 *                 
 *         - v0.002:  *Arreglados los eventos para utilizar el bufferedImage activo.
 *                    *Arreglados los eventos del raton para poder realizar una seleccion 
 *                     rectangular de la imagen.
 *                    *Creado un atributo para controlar que los listeners creen o no un nuevo 
 *                     rectangulo de resalte.
 *        
 */

package controladores;