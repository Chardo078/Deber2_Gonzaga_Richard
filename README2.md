Deber #3
Richard Gonzaga

Realizar 7 ejemplos por cada uno de los siguientes contextos:

ApplicationScoped, Dependent y Singleton

Estos deben realizarlos como un comentario de su proyecto quarkus, es decir en el archivo README


 @ApplicationScoped
  

1)Configuraciones Globales: Almacenar parámetros de un archivo YAML que no cambian durante la ejecución.

2)Contadores de Estadísticas: Un bean que rastrea el número total de peticiones procesadas por el servidor desde su inicio.

3)Cache de Datos Estáticos: Guardar una lista de países o códigos postales que se cargan al arrancar el sistema.

4)Clientes de API Externos: Mantener una única instancia de un cliente HTTP (como un RestClient) para reutilizar conexiones.

5)Procesadores de Reglas: Un motor de validación que no mantiene estado de usuario, sino lógica pura reutilizable.

6)Gestores de Eventos: Un componente que escucha y despacha eventos internos a diferentes módulos del sistema.

7)Pools de Conexiones Personalizados: Un bean que administra el acceso a un recurso compartido limitado.

 @Dependent 
  

1)Loggers Personalizados: Una clase que formatea logs y necesita ser instanciada individualmente para cada clase que la use.

2)Helper de Formato de Fechas: Una utilidad que realiza conversiones simples y no necesita persistir en memoria.

3)Validadores de DTO: Clases que validan objetos de entrada específicos y se destruyen tras la validación.

4)Mappers (MapStruct/Custom): Componentes que transforman entidades de base de datos a objetos de respuesta.

5)Generadores de IDs Temporales: Un bean que genera un identificador único para una transacción específica y luego se descarta.

6)Configuraciones de Inyección Directa: Clases que leen una propiedad específica de application.properties usando @ConfigProperty.

7)Estrategias de Algoritmos: Implementaciones del patrón Strategy que se inyectan según la lógica de negocio actual.

 @Singleton


1)Configuraciones de Seguridad Inmutables: Definiciones de roles y permisos que deben cargarse lo más rápido posible.

2)Beans de Arranque (Startup): Componentes que deben inicializar recursos críticos en el segundo exacto en que la JVM arranca.

3)Fábricas de Objetos (Factories): Un bean cuya única función es crear otros objetos y no requiere estados complejos.

4)Drivers de Bajo Nivel: Componentes que interactúan directamente con hardware o sockets específicos.

5)Registro de Microservicios: Un bean que mantiene el estado de "salud" del nodo actual para orquestadores como Kubernetes.

6)Cachés de Lectura Crítica: Almacenamiento de tokens de acceso del sistema que requieren el mínimo overhead de acceso.


7)Gestores de Memoria: Beans que monitorean el heap y lanzan alertas, donde el uso de un proxy podría interferir con la medición.