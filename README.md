# EjercicioJsf
Ejercicio JSF que utiliza inyección de dependencias y control de navegacion

## Implementación JSF
El ejercicio cuenta con un archivo index.xhtml que contiene el formulario de login, con 2 campos y un botón

## Implementación de Beans gestionados
Los bean gestionados se desarrollan utilizando anotaciones sobre las clases.  El sistema crea instancias del bean gestionado, basados en el nombre de la clase:
```
@ManagedBean
@SessionScoped
public class UsuarioBean {
```
Para el caso anterior seria usuarioBean.

## Inyección de dependencias
La inyección de dependencias permite obtener una instancia de un objeto que se encuentra en el contexto de la aplicación.  Para este caso se utiliza una anotación especifica:
```
@ManagedProperty(value="#{usuarioBean}")
private UsuarioBean usuarioBean;
```
Es importante que la variable que recibe el bean tenga los metodos de get y set.

# Implementación
Para ejecutar el ejercicio debes tener una base de datos de MySQL y para este caso se utilizó un servidor Tomcat 9.0
