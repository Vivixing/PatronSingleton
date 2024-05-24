# Patrones De Diseño
## Patrón Singleton
Utilicé el patrón Singleton para hacer una instacia única de una clase que me retorna una lista la cual contiene algunas de las ciudades de Colombia 
## Patrón Mediator
En este caso este patrón se utilizó para que actuare como mediador entre las clases Coche, Teléfono y Radio. De este modo cada clase no tendría que conocer las otras clases directamente. Entonces se agregó una interface llamada mediator, la cual contiene algunos métodos que necesitaban de la instancia de otras clases y se le agregó una clase llamada CroncreteMediator la cuál es la que iba a actuar como clase mediador entre las demás clases.
## Patrón Decorator
El objetivo principal de este patrón es extender la funcionalidad de objetos de una manera flexible y reutilizable sin modificar la clase original ni usar la herencia. Esto se hace "envolviendo" el objeto original con un objeto decorador.
## Patrón State
Se utiliza para permitir que un objeto altere su comportamiento cuando su estado interno cambia. Básicamente, este patrón permite que un objeto cambie de clase en tiempo de ejecución, lo que le permite comportarse de manera diferente en función de su estado actual. Esto ayuda a encapsular el comportamiento específico del estado en clases separadas y a evitar largas listas de instrucciones condicionales.
## Patrón Strategy
Se utiliza para definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. Esto permite que el algoritmo varíe independientemente de los clientes que lo utilizan. En resumen, el patrón Strategy permite que un objeto cambie su comportamiento en tiempo de ejecución seleccionando entre diferentes estrategias sin cambiar su interfaz pública. Es útil cuando se necesita tener múltiples formas de resolver un problema y se desea poder elegir la mejor estrategia en tiempo de ejecución.
