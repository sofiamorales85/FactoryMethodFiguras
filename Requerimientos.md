# **Área de figuras Geométricas**

doctoc .

## Historial de versiones

|  Versión |     Descripción  |      Autor     |   Fecha    |
|----------|------------------|----------------|------------|
|    1.0   | Versión inicial  | Jenny Morales  | 24/05/2023 |

## 1. Introdución

#### El siguiente documento describe el funcionamiento de la aplicación creada con patrones de diseño Factory Method en java, esta solución se crea de la necesidad de calcular áreas de las figuras geométricas específicas, Triángulo, Cuadrado,Rombo, Trapecio, Círculo, Rectángulo a tra vez de una GUI ingresando los datos principales como lados , radios , base y muestra el área de cada uno

## 2. Participantes

|   <!-- -->        | <!-- -->                  |
|:------------------|---------------------------|
| **Participante**  | Jenny Sofía Morales López |
| **Organización**  | Individual                |
| **ROL**           | Product Owner/ Team       |
| **EMAIL**         | <jmoralesl15@miumg.edu.gt>|



## 3. Objetivos

|   <!-- -->             | <!-- -->                  |
|------------------------|----------------------------------|
| **OBJ-0001**           | Que la aplicacion sea amigable al usuario|
| **Versión**            | 1.0 - 24/05/2023                 |
| **Autor**              | Jenny Sofía Morales              |
| **Descripción**        | Crear una pantalla amigable al usuario para ingresar los datos.                                |
| **Prioridad**          | Prioridad alta                   |



|   <!-- -->             | <!-- -->                         |
|------------------------|----------------------------------|
| **OBJ-0002**           | Utilizar los patrones de diseño Factory method|
| **Versión**            | 1.0 - 24/05/2023                 |
| **Autor**              | Jenny Sofía Morales              |
| **Descripción**        | Programar con patrones de diseño Factory method                              |
| **Prioridad**          | Prioridad alta                   |


## 4. Requisitos de información

|   <!-- -->             | <!-- -->                  |
|------------------------|----------------------------------|
| **IRQ-0001**           | Ingreso de datos                 |
| **Versión**            | 1.0 - 24/05/2023                 |
| **Autor**              | Jenny Sofía Morales              |
|**Dependencias**        | [OBJ-0001],[OBJ-0002]
| **Descripción**        | La información ingresada por el usuario será la base , altura o radio de la figura elegida. |
| **Prioridad**          | Prioridad alta                   |


|   <!-- -->             | <!-- -->                         |
|------------------------|----------------------------------|
| **IRQ-0002**           | Informacion de resultado de los calculos                |
| **Versión**            | 1.0 - 24/05/2023                 |
| **Autor**              | Jenny Sofía Morales              |
|**Dependencias**        | [OBJ-0001] , [IRQ-0001]
| **Descripción**        | Al ingresar los datos requeridos y elegir la figura dará como resultado el área y perímetro de la figura seleccionada.|
| **Prioridad**          | Prioridad alta                   |

## 5. Casos de uso

* Ingresar datos: en este caso de uso el usuario ingresa el lado , la base o el radio,y se obtendra como resultado el área y perimetro de la figura en la pantalla

* Calcular area y perimetro: Si el usuario ingresa los datos validos el sistema va a calcular el área y perimetro

### Subflujos para calcular el area y perímetro

    * Calcular área y perímetro de cuadrado: En el caso de uso para calcular el área y perímetro del cudrado , este caso es opcional por cada petición ya que al iniciar selecciona cual es la Figura
    * Calcular área y perímetro de Triángulo: En el caso de uso para calcular el área y perímetro del Triángulo , este caso es opcional por cada petición ya que al iniciar selecciona cual es la Figura
    * Calcular área y perímetro de rectangulo: En el caso de uso para calcular el área y perímetro del rectangulo , este caso es opcional por cada petición ya que al iniciar selecciona cual es la Figura
    * Calcular área y perímetro de traprecio: En el caso de uso para calcular el área y perímetro del traprecio , este caso es opcional por cada petición ya que al iniciar selecciona cual es la Figura
    * Calcular área y perímetro de circulo: En el caso de uso para calcular el área y perímetro del circulo , este caso es opcional por cada petición ya que al iniciar selecciona cual es la Figura
    * Calcular área y perímetro de rombo: En el caso de uso para calcular el área y perímetro del rombo , este caso es opcional por cada petición ya que al iniciar selecciona cual es la Figura**

* Validar campos vacíos: en caso si el usuario no ingresa ningun dato se debe mostrar un mensaje indicando que los datos son requeridos para hacer los calculos solicitados

* Validar datos: en este caso se valida si los datos ingresados son validos, solo se permite el ingreso de números

### Diagrama de casos de uso

![Diagrama de casos de uso](/DiagramaCasosDeUso.webp)

### Caso 1

|   <!-- -->      | <!-- -->                         |
|-----------------|----------------------------------|
|**UC-0001**      |Ingresar datos                    |
|**Versión**      |3.0 ( 30/10/2017 )                |
|**Autores**      |Jenny Sofía Morales López         |
|**Dependencias** |[IRQ-0001],[FRQ-0001],[FRQ-0002],[FRQ-0002],[NFR-0001]  |
|**Descripción**  |Este caso es el happy path donde se ingresan datos correctos y muestra el área y permetro de la figura|
|**Excepciones**  |Este proceso se cumplirá unicamente si los datos son válidos.  |
|**Precondición** |No aplica porque es el ingreso de datos| 
|**Secuencia normal**|1. Ingresa los datos para calculo del área 2. Elige la figura para calcular 3. se muestra el área y Perímetro.|
|**Postcondición**|Se muestra el resultad del área y perímetro de la figura|
|**Importancia**  |Vital                             |
|**Urgencia**     |Inmediatamente                    |
|**Estado**       |Validado                          |
|**Estabilidad**  |Alta                              |
|**Comentarios**  |                                  |

## 6. Requisitos funcionales

|   <!-- -->             | <!-- -->                         |
|------------------------|----------------------------------|
| **FRQ-0001**           | Entrada de tipo númericos        |
| **Versión**            | 1.0 - 24/05/2023                 |
| **Autor**              | Jenny Sofía Morales              |
| **Dependencias**       | [OBJ-0002],[OBJ-0001]            |
| **Descripción**        | El sistema permite el ingreso solamente de números.|
| **Prioridad**          | Prioridad alta                   |
| **Comentarios**        | --------------                   |


|   <!-- -->             | <!-- -->                         |
|------------------------|----------------------------------|
| **FRQ-0002**           | Calculo de área  y perimetro     |
| **Versión**            | 1.0 - 24/05/2023                 |
| **Autor**              | Jenny Sofía Morales              |
| **Dependencias**       | [OBJ-0002],[OBJ-0001]            |
| **Descripción**        | Al ingresar los datos al sistema se calculará el área según la figura.|
| **Prioridad**          | Prioridad alta                   |
| **Comentarios**        | --------------                   |


|   <!-- -->             | <!-- -->                         |
|------------------------|----------------------------------|
| **FRQ-0003**           | Resultado de área y perímetro    |
| **Versión**            | 1.0 - 24/05/2023                 |
| **Autor**              | Jenny Sofía Morales              |
| **Dependencias**       | [OBJ-0002],[OBJ-0001]            |
| **Descripción**        | Al hacer el cálculo de las áreas se mostrará el resultado según la figura.|
| **Prioridad**          | Prioridad alta                   |
| **Comentarios**        | --------------                   |


## 7. Requisitos no funcionales

|   <!-- -->             | <!-- -->                         |
|------------------------|----------------------------------|
| **NFR-0001**           | Accesibilidad                    |
| **Versión**            | 1.0 - 24/05/2023                 |
| **Autor**              | Jenny Sofía Morales              |
| **Descripción**        | La aplicación estará disponible mientras el servidor este levantado localmente.                                |
|**Prioridad**           | Prioridad alta                   |
|**Importancia**         | Vital                            |
|**Urgencia**            | Inmediatamente                   |
|**Estado**              | Validado                         |


|   <!-- -->             | <!-- -->                         |
|------------------------|----------------------------------|
| **NFR-0002**           | Compatibilidad                   |
| **Versión**            | 1.0 - 24/05/2023                 |
| **Autor**              | Jenny Sofía Morales              |
| **Descripción**        | La aplicación es compatible con cualquier explorador web ,   no para móviles u otro dispositivo que no sea computadora.                              |
| **Prioridad**          | Prioridad alta                   |
|**Importancia**         | Vital                            |
|**Urgencia**            | Inmediatamente                   |
|**Estado**              | Validado                         |



|   <!-- -->             | <!-- -->                         |
|------------------------|----------------------------------|
| **NFR-0003**           | Seguridad                        |
| **Versión**            | 1.0 - 24/05/2023                 |
| **Autor**              | Jenny Sofía Morales              |
| **Descripción**        | La aplicación no cuenta con modulo de login o autenticación |
| **Prioridad**          | Prioridad alta                   |
|**Importancia**         | Vital                            |
|**Urgencia**            | Inmediatamente                   |
|**Estado**              | Validado                         |
