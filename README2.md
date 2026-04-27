Deber #3
Richard Gonzaga






1. @ApplicationScoped
   Este contexto indica que solo existe una instancia de la clase en toda la aplicación. Se crea una vez y vive hasta que la aplicación se detiene.

Configuraciones Globales: Almacenar parámetros de un archivo YAML que no cambian durante la ejecución.

Contadores de Estadísticas: Un bean que rastrea el número total de peticiones procesadas por el servidor desde su inicio.

Cache de Datos Estáticos: Guardar una lista de países o códigos postales que se cargan al arrancar el sistema.

Clientes de API Externos: Mantener una única instancia de un cliente HTTP (como un RestClient) para reutilizar conexiones.

Procesadores de Reglas: Un motor de validación que no mantiene estado de usuario, sino lógica pura reutilizable.

Gestores de Eventos: Un componente que escucha y despacha eventos internos a diferentes módulos del sistema.

Pools de Conexiones Personalizados: Un bean que administra el acceso a un recurso compartido limitado.

2. @Dependent (Por defecto)
   Es el scope predeterminado. La instancia comparte el ciclo de vida del bean que lo inyecta. Si se inyecta en un RequestScoped, durará lo que dure la petición; si es en un ApplicationScoped, será un Singleton.

Loggers Personalizados: Una clase que formatea logs y necesita ser instanciada individualmente para cada clase que la use.

Helper de Formato de Fechas: Una utilidad que realiza conversiones simples y no necesita persistir en memoria.

Validadores de DTO: Clases que validan objetos de entrada específicos y se destruyen tras la validación.

Mappers (MapStruct/Custom): Componentes que transforman entidades de base de datos a objetos de respuesta.

Generadores de IDs Temporales: Un bean que genera un identificador único para una transacción específica y luego se descarta.

Configuraciones de Inyección Directa: Clases que leen una propiedad específica de application.properties usando @ConfigProperty.

Estrategias de Algoritmos: Implementaciones del patrón Strategy que se inyectan según la lógica de negocio actual.

3. @Singleton
   Similar a ApplicationScoped, pero con una diferencia técnica clave: no utiliza un Client Proxy. La inyección es directa a la instancia, lo que ofrece un rendimiento ligeramente superior pero menos flexibilidad en la gestión de contextos dinámicos.

Configuraciones de Seguridad Inmutables: Definiciones de roles y permisos que deben cargarse lo más rápido posible.

Beans de Arranque (Startup): Componentes que deben inicializar recursos críticos en el segundo exacto en que la JVM arranca.

Fábricas de Objetos (Factories): Un bean cuya única función es crear otros objetos y no requiere estados complejos.

Drivers de Bajo Nivel: Componentes que interactúan directamente con hardware o sockets específicos.

Registro de Microservicios: Un bean que mantiene el estado de "salud" del nodo actual para orquestadores como Kubernetes.

Cachés de Lectura Crítica: Almacenamiento de tokens de acceso del sistema que requieren el mínimo overhead de acceso.

Gestores de Memoria: Beans que monitorean el heap y lanzan alertas, donde el uso de un proxy podría interferir con la medición.