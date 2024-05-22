# Patrones De Diseño
## Patrón Singleton
Utilicé el patrón Singleton para hacer una instacia única de una clase que me retorna una lista la cual contiene algunas de las ciudades de Colombia 
## Patrón Mediator
En este caso este patrón se utilizó para que actuare como mediador entre las clases Coche, Teléfono y Radio. De este modo cada clase no tendría que conocer las otras clases directamente. Entonces se agregó una interface llamada mediator, la cual contiene algunos métodos que necesitaban de la instancia de otras clases y se le agregó una clase llamada CroncreteMediator la cuál es la que iba a actuar como clase mediador entre las demás clases.
## Patrón Decorator
El objetivo principal de este patrón es extender la funcionalidad de objetos de una manera flexible y reutilizable sin modificar la clase original ni usar la herencia. Esto se hace "envolviendo" el objeto original con un objeto decorador.
