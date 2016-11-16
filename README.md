# Entregable 5 Diseño y Pruebas || Vistas

## Comandos básicos de git
**git clone _URL_**: Clonar (descargar) el repositorio con la URL especificada. Se creará una nueva carpeta con el nombre del
repositorio. Esta nueva carpeta será un repositorio **local** que no se sincroniza automáticamente con el repositorio en el servidor.

Ejemplo
>git clone https://github.com/bjjr/d05.git

**git pull**: Actualizar los contenidos del repositorio (traer cambios).

**git add**: Añadir un archivo al listado de control de git.
**IMPORTANTE**: si se añade o modifica un archivo siempre habrá que "añadir" ese archivo o sus modificaciones.

>git add readme.txt carpeta/

**git commit _-m "Descripción"_**: Realizar un commit de los cambios efectuados en el repositorio.
**IMPORTANTE** el commit se hará en el repositorio **local**, no se subirán al repositorio en el servidor.
>git commit -m "Corregido readme y añadida nueva carpeta"

**git push**: Enviar los cambios del repositorio local al repositorio remoto. Este comando pedirá los datos del usuario de GitHub.

### Ciclo usual
1. git pull :arrow_down:
2. ¡Programar! :computer:
3. git add _archivos..._ :heavy_plus_sign:
4. git commit -m _"Descripción"_ :new:
5. git push :arrow_up:
