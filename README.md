# Trabajo Practico - Tecnologias Avanzadas en la Construccion de Software
Segundo Cuatrimestre 2020 - UTN FRBA - El Mejor Grupo :)

# Como levantar la aplicacion:


# Docker:

1. Colocarse a la altura del directorio src
2. docker build -t nombreContainer .
3. docker run -p <puertoLocal>:<puertoContainer> nombreContainer

-----
# Decisiones de Diseño:
1. Spring-Boot para BackEnd
2. Angular para FrontEnd
3. DER: https://drive.google.com/file/d/1NlseerFxcISJEXySQQ5WB8tqhcmMn-Rl/view?usp=sharing

-----
# Suposiciones:
1. En el transcurso de la partida no puedan cambiar los datos obtenidos de las APIs con respecto a la altura de las municipalidades o el nombre de las provincias, por ejemplo.
2. No hay equipos, cada jugador se enfrenta a los demas individualmente.
3. Si un jugador abandona la partida, esta sigue en curso con el resto y los municipios que tenia se redistribuyen entre los demas jugadores.
