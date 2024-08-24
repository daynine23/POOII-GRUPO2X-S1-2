##4. Identificar las clases que heredan, ¿qué atributos y métodos heredan?
La clase que podemos identificar que hereda es la clase "Triangulo" de la clase "FiguraGeometrica", esta clase 
"Triangulo" hereda el atributo "nombre" y los metodos: 
"getNombre()", 
"setNombre()", 
"calcularAreaFigura()", 
"esRegular()".
##5. Identificar las clases que conforman una composición.
Las clases que confirman una composicion es Triangulo porque tienes 3 objetos de tipo "Punto",
como tambien la clase SuperficiePlana porque tiene una lista de FigurasGeometricas.
##6. ¿Qué es una superclase y una subclase?
Una subclase es aquella de la cual se heredan atributos o metodos, quien los hereda viene a ser una subclase
tambien llamada hija.
##7. ¿Por qué usamos abstract? ¿Se puede dejar de heredar un método de una clase abstracta?
Usamos abstract para definir metodos que seran implementados por las subclases.
No es puede dejar de heredar un metodo de una clase abstracta porque la subclase a extender de esta, esta 
obligado a implementarlas en su clase.
##8. ¿Qué anotación utilizo para sobreescribir métodos?
Se utilizó la anotacion @Override.
##9. Los atributos de la clase Figura Geométrica conviértalas en protected. ¿En qué condición convierte a los atributos? ¿Es posible acceder a los atributos protegidos sin utilizar una invocación a super() o sin método get?.
Permitira que las subclases que extiendan de ella puedan acceder directamente a esos atributos.
Si es posible acceder a los atributos protegidos sin utilizar super() o get() siempre y cuando se encuentren
en el mismo 'package'.
##10. ¿Cómo aplicarías polimorfismo?.
Si bien aqui se utilizo la herencia, se podria mejorar el orden y legibilidad del codigo creando interfaces donde se
implementarian los metodos que seran reutilizados por las subclases.