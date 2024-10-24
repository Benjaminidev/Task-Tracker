# Task-Tracker
Permite dar un seguimiento a las tareas que vayas ejecutando dia a dia.
## ¿Como funciona?
Para utilizar el programa es muy sencillo:

1) Se debe ejecutar la clase TaskTracker para interactuar con ella. 

![Captura de pantalla 2024-10-24 215915](https://github.com/user-attachments/assets/a4b6984e-02c4-44da-8e37-679490842260)


2) Una vez que hayamos ejecutado TaskTracker, nos solicitara que coloquemos un comando para empezar agregar tareas.

![Captura de pantalla 2024-10-24 220042](https://github.com/user-attachments/assets/deaee752-029c-461a-b4c7-9511d9394501)


3) Para agregar una tarea, debemos usar el comando ¨add, aqui colocaremos el nombre de la tarea por ejemplo ¨Pintar casa (fachada y paredes traseras)¨ esto correspondera a crear la tarea mas su descripción.

![Captura de pantalla 2024-10-24 215511](https://github.com/user-attachments/assets/5aff72e1-1d24-4e0e-a32a-306b13246216)


En el caso de que por accidente coloquemos una descripción, la consola alertara a través que debemos asignarle una.

![Captura de pantalla 2024-10-24 220253](https://github.com/user-attachments/assets/cf856a14-a654-426a-9824-fed782585d0e)

Cuando la tarea se crea de manera exitosa nos proveera un ID, este es el que luego utilizaremos con los otros comandos disponibles (mark-in-progress, mark-done, update y delete). Por defecto cada tarea siempre se creara con el status de todo (por hacer).

## METODOS DE UPDATE, STATUS Y DELETE

Tenemos distintos metodos que podemos usar para ir generando un registro de nuestras tareas, ya que al crear una, cuando la empezemos a ejecutar vamos a querer llevar un registro de que tareas tenemos en ejecucion, cuales estan pendientes y cuales se han terminado. Luego de tener varias tareas terminadas disponemos de la opcion de eliminarlas para no generar confusiones respecto a nuevas tareas que puedan crearse.

# Update

Para utilizar update, basta solamente con escribir el comando "update" este nos permitira trabajar sobre cualquier tarea que tengamos creada para modificar unicamente su descripcion, es decir que el update no modificara el estado, sino SOLAMENTE SU DESCRIPCION.

![Captura de pantalla 2024-10-24 215552](https://github.com/user-attachments/assets/446d3bbc-d524-45d5-a502-a26fd8bb1fe7)

Como notamos en la imagen, la primera tarea que habiamos creado era del tipo "Pintar casa (Fachada frontal y trasera)" luego del uso de la actualizacion en la descripcion solamente dejamos la parte de pintar que nos falta, en este ejemplo seria la fachada frontal (es decir que la trasera ya esta pintada).

En el caso de que a la hora de usar update se nos olvidara de colocar la nueva descripcion el programara nos alertara de que nos hemos olvidado de colocar la nueva descripcion, teniendo que ejecutar nuevamente el comando update con la descripcion que deseemos.

![Captura de pantalla 2024-10-24 221013](https://github.com/user-attachments/assets/b59159f7-d359-4b3f-a5fa-81c37a4a3912)

De esta manera manejamos el error ante una situacion involuntaria que pueda tener cualquier usuario.

# Status

Los estados que trabajamos en este proyecto son solamente 3, la idea es poder tener un registro de que tareas estan pendientes (todo) cuales estamos ejecutando (mark-in-progress) y cuales hemos terminado (mark-done) Para cada una de ellas se puede utilizar su comando en especifico, evitando errores a la hora de catalogar las tareas que hemos ejecutado o que estan pendientes o que ya hemos terminado, permitiendo llevar un orden en nuestros quehaceres basicos.

1) Mark-in-Progress: Este estado lo debemos utilizar solamente en aquella tarea que vamos a ejecutar. Por un principio de uso de gestion del tiempo de manera efectiva se recomienda no ejecutar mas de 3 tareas en simultaneo ya que genera la improductividad de tener muchas actividades en ejecucion, generando que no finalicemos ninguna de ellas. Esto queda a la discrepancia de cada uno, no es obligatorio que el programa funcione de esa manera pero si es ideal de que este sea productivo para aquellas personas que quieran tener un registro manual de sus tareas. Para utilizarlo se debe colocar el comando "mark-in-progress" + el ID de la tarea que empezaremos a ejecutar.

![Captura de pantalla 2024-10-24 215630](https://github.com/user-attachments/assets/fe0b4fa7-32d0-4cd8-a0f7-cf5c1ed42316)

En el caso de que cometieramos el error de no especificar el ID de la tarea que estamos ejecutando tambien manejamos el error con una alerta por parte de la consola.

![Captura de pantalla 2024-10-24 221616](https://github.com/user-attachments/assets/13394457-1092-4d2e-acc6-4cfc6a7174be)


2) Mark-Done: Este es el estado de terminado, aquellas tareas que se hayan finalizado se les podra colocar este estado.
Para utilizar este estado solamente deberemos de colocar el comando "mark-done" + el ID de la tarea que hemos finalizado.
Luego de esto tenemos la opcion de utilizar el comando de delete para eliminar la tarea (esto es opcional ya que podemos dejar las tareas terminadas sin problema)

![Captura de pantalla 2024-10-24 215659](https://github.com/user-attachments/assets/35eac42d-a572-4e67-90f4-49b75c2b964c)

En caso de tener un error, tambien lo manejamos con en los otros estados.

![Captura de pantalla 2024-10-24 221929](https://github.com/user-attachments/assets/d10eefcc-40d6-4bcb-9187-33cc695d06f2)




# Delete

Este metodo nos permite eliminar cualquier tarea que hayamos terminado. Para utilizarlo debemos colocar el comando "delete" + el ID de la tarea que deseemos eliminar, ya sea porque la hemos duplicado por error o porque la hemos terminado y no queremos tenerla en la lista de tareas de nuestro programa.

![Captura de pantalla 2024-10-24 215715](https://github.com/user-attachments/assets/3dba6795-f484-4647-8dbf-2d6dedd4fb60)


Si tuvieramos un error, este tambien se maneja de la misma manera para evitar problemas con una alerta por parte de la consola.
![Captura de pantalla 2024-10-24 222047](https://github.com/user-attachments/assets/9cbc76f0-ae49-4080-9c09-22c7ccd73164)
