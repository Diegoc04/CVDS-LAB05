# LABORATORIO 5 - SPRING MVC INTRODUCTION

#### INTRODUCCIÓN A PROYECTOS WEB

### PARTE I. - JUGANDO A SER UN CLIENTE HTTP
1. Abra una terminal Linux o consola de comandos Windows.

Habilitamos telnet en nuestro dispositivo  
![image](https://github.com/Diegoc04/CVDS-LAB05/assets/89041250/bb673352-2e82-4e13-97fd-19bd4620064b)  
   
3. Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor:
- Host: www.escuelaing.edu.co
- Puerto: 80
Teniendo en cuenta los parámetros del comando telnet:

```sh
$ telnet HOST PORT
```
3. Antes de que el servidor cierre la conexión por falta de comunicación:

![image](https://github.com/Diegoc04/CVDS-LAB05/assets/77862071/e26a0893-6467-4e03-9ee0-e7f2d454a540)

Revise el RFC del protocolo HTTP, sobre cómo realizar una petición GET.
Debe lucir más o menos de esta forma:

```yml
GET /with-a-resource.html HTTP/1.0
Host: www.escuelaing.edu.co
```

Con esto, solicite al servidor el recurso `sssss/abc.html`, usando la versión 1.0 de HTTP.
Copie las dos lineas de codigo con el recurso agregado y peguelas en la consola del servidor ya abierta.
Asegúrese de presionar ENTER dos veces después de ingresar el comando.

![image](https://github.com/Diegoc04/CVDS-LAB05/assets/77862071/53b0ad22-7b2d-4db3-b30d-5dee2cbc992b)

Revise el resultado obtenido.

- ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.
- ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
- Responder en el README.md según lo indicado en la última sección de este laboratorio (ENTREGA).

4. Realice una nueva conexión con telnet, esta vez a:
```yml
Host: www.httpbin.org
Puerto: 80
Versión HTTP: 1.1
```

Ahora, solicite (GET) el recurso /html. ¿Qué se obtiene como resultado?

![image](https://github.com/Diegoc04/CVDS-LAB05/assets/77862071/a996b5ad-a709-44fb-bff4-56584afbcd0f)
![image](https://github.com/Diegoc04/CVDS-LAB05/assets/77862071/8f3e04f8-40b8-4978-9f83-44b39c325f0c)
![image](https://github.com/Diegoc04/CVDS-LAB05/assets/77862071/a4e8f373-44e7-4402-90d5-93d64b937259)



¡Muy bien!, ¡Acaba de usar del protocolo HTTP sin un navegador Web!. Cada vez que se usa un navegador, éste se conecta a un servidor HTTP, envía peticiones
del protocolo HTTP, espera el resultado de las mismas, y si se trata de contenido HTML lo interpreta y dibuja.

5. Seleccione el contenido HTML de la respuesta y copielo al cortapapeles `CTRL-SHIFT-C`. Ejecute el comando wc (word count) para contar palabras con la
opción -c para contar el número de caracteres:
```sh
$ wc -c
```

Pegue el contenido del portapapeles con `CTRL-SHIFT-V` y presione `CTRL-D` (fin de archivo de Linux). Si no termina el comando `wc` presione `CTRL-D`
de nuevo. No presione mas de dos veces CTRL-D indica que se termino la entrada y puede cerrarle la terminal. Debe salir el resultado de la cantidad de
caracteres que tiene el contenido HTML que respondió el servidor.

![image](https://github.com/Diegoc04/CVDS-LAB05/assets/77862071/81369b26-b064-46d4-9b47-fd6f691b9fc7)


Claro está, las peticiones GET son insuficientes en muchos casos. Investigue: ¿Cuál esla diferencia entre los verbos GET y POST? ¿Qué otros tipos de
peticiones existen?

7. En la practica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la linea de comandos: 
```sh
$ curl "www.httpbin.org"
```

![image](https://github.com/Diegoc04/CVDS-LAB05/assets/77862071/75c17fe9-d275-4288-9954-aa0b0f1489bb)


Utilice ahora el parámetro -v y con el parámetro -i:

```sh
$ curl -v www.httpbin.org
$ curl -i www.httpbin.org
```
curl -v www.httpbin.org

![image](https://github.com/Diegoc04/CVDS-LAB05/assets/77862071/2c2b56a8-ad4c-4708-886b-771115dbb0e9)

curl -i www.httpbin.org

![image](https://github.com/Diegoc04/CVDS-LAB05/assets/77862071/bdd2fa3f-dfe0-4736-acd2-3c5f2de442ea)


¿Cuáles son las diferencias con los diferentes parámetros?

### PARTE II. - HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC
En este ejercicio, va a implementar una aplicación Web muy básica, haciendo uso de spring MVC.

Para esto usaremos la documentación oficial de Spring con que que aprenderemos las funciones básicas de este framework https://spring.io/guides/gs/serving-web-content/

Después de terminar el aprendizaje analice:
- ¿Por qué MVC obtiene ese nombre? (puede apoyarse de https://www.javatpoint.com/spring-mvc-tutorial)
  
- ¿Cuáles son las ventajas de usar MVC?
  
- ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?
  
- ¿Qué anotaciones usaste y cuál es la diferencia entre ellas?

### PARTE III. - APLICACIÓN MVC PARA CONSUMO DE SERVICIO RESTful
Usando la arquitectura MVC del punto anterior (el proyecto anterior), realice una aplicación simple qué permita navegar gráficamente sobre esta API
https://jsonplaceholder.typicode.com/todos/1, puede guiarse de tutoriales como https://medium.com/@nutanbhogendrasharma/consume-rest-api-in-spring-boot-web-application-354c404850f0

Luego de terminada esta parte responda:
- ¿Qué es RESTful?
- Si utilizo un framework como [Boostrap CSS](https://getbootstrap.com/) para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?

### PARTE IV. - APLICACIÓN MVC JUEGO
¡Llego la hora del reto! Teniendo las bases del uso del framework, cree una nueva ruta, por ejemplo `/guess`, y agrege formulario básico con un campo llamado "número" (guía de como crear formularios HTML https://www.w3schools.com/html/)

Y vamos a implementar la lógica de nuestro juego:
1. Se trata de un juego en línea para adivinar un número, en el que el ganador, si acierta en la primera oportunidad, recibe $100.000. Luego, por cada intento fallido, el premio
se reduce en $10.000, como en los juegos de apuesta, es natural qué quede en saldos negativos.
2. El número a adivinar debe ser generado en cada intento y comparado con el número qué el usuario está insertando, es un número de 1 a 10.
3. Debe existir un botón de reset, qué permita al jugador iniciar de nuevo.
4. La capa de controlador debe procer el número del usuario mediante método `POST`.

Analice las siguientes situaciones:
- ¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?
- Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?

# INTEGRANTES

1) Daniel Santiago Torres Acosta
2) Miguel Camilo Tellez Avila
3) Diego Fernando Castellanos Amaya
   
# RESPUESTAS

## PARTE 1

- ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.
   - El codigo de error que sale es el 301 el cual nos dice que el URI fue movido permanente mente a una nueva ubicacion
     
- ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
   - Los codigos del 100 - 199 son codigos de respuestas
   - Los codigos del 200 - 299 son codigos de satisfactorias
   - Los codigos del 300 - 399 son codigos de redireccion
   - Los codigos del 400 - 499 son codigos de errores de los clientes
   - Los codigos del 500 - 599 son codigos de errores de los servidores
 
- ¿Cuál esla diferencia entre los verbos GET y POST? 
   - GET se usa para solicitar datos y obtener una solucion a la peticion que se hace
   - POST se utiliza para enviar datos a un servidor que los puede modificar
     
- ¿Qué otros tipos de peticiones existen?
   - PUT : se usa para enviar datos al servidor
   - DELETE: se usa para eliminar un recurso
   - PATCH: se usa para aplicar modificaciones  
   - OPTIONS: se usa para obtener información
   - HEAD: se usapara solicitar solo los encabezados de respuesta
     
- ¿Cuáles son las diferencias con los diferentes parámetros?

   - curl -i nos muestra los encabezados del servidor de respuesta

   - curl -v muestra tanto los encabezados y las respuestas de las solicitudes

## PARTE 2

- ¿Por qué MVC obtiene ese nombre? (puede apoyarse de https://www.javatpoint.com/spring-mvc-tutorial)
   - Obtiene ese nombre de las funciones framework que siguen el diseño modelo-vista-controlador
     
- ¿Cuáles son las ventajas de usar MVC?
   - Una de las ventajas de de usar MVC es la de separa roles, tiene configuraciones de frameworks poderosas y aplicaciones, en donde nos sirven como ayuda a el desarrollo de programas y nos facilitan el testeo y la reutilizacion de clases
     
- ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?
   - Se diferencian que los direcorios radican en la simpleza de los directorios en donde se pueden ver proyectos mas organizados y limpios al momento de presentarlos

- ¿Qué anotaciones usaste y cuál es la diferencia entre ellas?
   -
## PARTE 3

- ¿Qué es RESTful?
   - Es una interfaz que dos sistemas de computación utilizan para intercambiar información de manera segura a través de Internet  

- Si utilizo un framework como [Boostrap CSS](https://getbootstrap.com/) para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?
- 

## PARTE 4

- ¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?
   - 
- Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?
   - 
  
## ENTREGA
- En un README.md colocar lo siguiente:
- Una sección llamada “INTEGRANTES”.
- Una sección llamada “RESPUESTAS” colocar lasrespuestas a las preguntas:
- Configurar el archivo .gitignore para excluir del repositorio los archivos no relevantes.
- En una carpeta en la raiz del repositorio llamada diagrams y allí realizar un diagrama de clases del proyecto.
