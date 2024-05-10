# Proyecto #3 Screenplay Web - SerenityBDD 🚀

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Ingresa a la página https://www.saucedemo.com/ y realiza login con usuario y contraseña las cuales están en la clase, el navegador asignado es google chrome y está configurado el archivo serenity.properties

## Pre requisitos para ejecutar 📋
- Java version 1.8 o superior y JDK (variables de entorno configuradas).
- Entorno de desarrollo: Eclipse IDE o IntelliJ IDEA
- Maven version 3.9.6 o superior (variables de entorno configuradas).

## Ejecutar pruebas 🔨

Limpiar el proyecto y luego compilar el código fuente. Esto es útil para asegurarte de que el código se compile correctamente antes de pasar a fases posteriores del ciclo de vida del proyecto, como las pruebas o el empaquetado.

	mvn clean compile
 
La herramienta de compilación de código y administrador de dependencias para este proyecto es **Maven**, así que para ejecutar las pruebas use el siguiente comando en la raíz del proyecto.

	mvn clean verify 

Genera el informe Serenity BDD, no ejecuta las pruebas en navegador

	mvn serenity:aggregate 


## Ver los informes 🔍
El comando proporcionado anteriormente para la ejecución de las pruebas, generará un informe de prueba de Serenity **index.html** en el directorio target\site\serenity\index.html

## Navegador Web 🌐
- El navegador por defecto es Google Chrome, pero es posible cambiarlo desde archivo serenity.properties.
- El proyecto no hace uso de drivers .exe para abrir un navegador. 

## Archivos de configuración entorno de ejecución de las pruebas 🗒️

| Archivo              | ¿Utiliza? |
| ---------------------|-------------- |
| serenity.conf        | NO            |
| serenity.properties  | SI            |

- Archivo serenity.conf contiene los parametros necesarios para ejecutar la prueba en navegadores Chrome, Edge y Firefox.

## Construido con 🛠
La automatización fue desarrollada con:
- BDD - Estrategia de desarrollo
- POM - Patrón de diseño (Page Object Model)
- Maven - Administrador de dependencias
- Selenium Web Driver - Herramienta para interactuar con navegadores web
- Serenity BDD - Librería de código abierto para escribir pruebas de aceptación automatizadas

## Versionamiento 📌
Se usó Git para el control de versiones. 🔀
