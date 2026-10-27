# Simulador de Ecosistema
Primera instancia evaluativa de Interfaz Gráfica.

# Intrucciones de ejecución
- 1. Clonar el repositorio y abrir el proyecto en el IDE (NetBeans/Eclipse/IntelliJ).

- 2. Ubicar la clase principal SimuladorEcosistema.java dentro del paquete simuladorecosistema.

- 3. Ejecutar el archivo (Clic derecho -> Run File / Ejecutar archivo).

- 4. La simulación comenzará en la consola inferior. Para testear el funcionamiento exacto de esta entrega, ingresar los siguientes parámetros iniciales cuando el sistema lo solicite (ejemplo):

- Plantas: 6
- Conejos: 2
- Lobos: 1
- Turnos: 10
- Clima Inicial: SOLEADO

- 5. Presionar ENTER para avanzar secuencialmente entre cada turno.

- 6. Al finalizar el Turno 3, se desplegará automáticamente el Menú de Intervención en consola: seleccionar la opción 1 para cambiar el clima o 2 para agregar una nueva entidad, confirmando la acción para observar su impacto en los turnos siguientes.
  
# Estructura del proyecto
Parcial1-InterfazGr-fica/
│
├── README.md
├── .gitignore
│
└── SimuladorEcosistema/
    ├── build.xml
    ├── manifest.mf
    ├── nbproject/                        (configuración del proyecto de NetBeans)
    │
    └── src/
        └── simuladorecosistema/
            ├── Clima.java                (Yazmin Riquelme)
            ├── Entidad.java              (Yazmin Riquelme)
            ├── Mortal.java               (Yazmin Riquelme)
            ├── Reproducible.java         (Yazmin Riquelme)
            │
            ├── Planta.java               (Hedda Conci)
            ├── PlantaVenenosa.java       (Hedda Conci)
            ├── Animal.java               (Hedda Conci)
            ├── Conejo.java               (Hedda Conci)
            │
            ├── Lobo.java                 (Ismael Gorocito)
            ├── Peligroso.java            (Ismael Gorocito)
            ├── Ecosistema.java           (Ismael Gorocito y Martino Recio)
            │
            └── SimuladorEcosistema.java  (Martino Recio)
            
# Integrantes y roles
- **Yazmin Riquelme:** Base del sistema.
- **Hedda Conci:** Plantas y conejos.
- **Ismael Gorocito:** Lobos y ecosistema (implementacion de las clases lobo, ecosistema e interfaz peligroso-).
- **Martino Recio:** Main y reporte final (Loop interactivo, menú de configuración, intervenciones y reporte final).

# Desafios encontrados
- **Yazmin Riquelme: Consultar la energía desde una interfaz:** en Mortal, verificarMuerte() necesitaba saber la energía de la entidad, pero una interfaz no tiene atributos. Lo resolví declarando getEnergia() como método abstracto en la interfaz Conejo y Lobo ya lo heredan de Entidad, así que no tienen que escribirlo de nuevo.
- **Dependencia con Ecosistema:** Entidad recibe un Ecosistema en actuar(), pero esa clase la desarrollaba otro integrante. Dejé una clase Ecosistema vacía para poder compilar en paralelo hasta que llegue la versión completa.
  
- **Hedda Conci:** El mayor desafío arquitectónico fue la dependencia de código: mis clases (Conejo, Planta) necesitaban interactuar con las listas de la clase Ecosistema, la cual estaba siendo desarrollada en paralelo por otro compañero y aún no estaba finalizada. Lo resolví apoyándome en el control de versiones, trabajando en mi propia rama aislada en Git. Programé la lógica interna de los seres vivos y dejé temporalmente comentadas las llamadas externas a las listas para poder compilar y testear de forma independiente. Una vez que la clase Ecosistema se integró a la rama principal (main), fusioné mi código y descomenté las líneas, logrando una integración limpia.
  
- **Ismael Gorocito:** El mayor desafío fue desarrollar la clase central Ecosistema en paralelo con la lógica de depredación (Lobo y la jerarquía de entidades Peligroso). Como mis compañeros dependían de las listas del ecosistema para programar sus seres vivos, subí primero una estructura base a Git para no bloquear su trabajo. A nivel de código, el reto principal fue lograr que los lobos cazaran y eliminaran conejos sin generar errores de concurrencia al modificar las listas mientras el sistema las estaba recorriendo en cada turno. Lo resolví usando iteradores seguros (o listas de bajas temporales) para separar la búsqueda de presas de su eliminación, logrando una simulación estable.

- **Martino Recio:** Uno de los principales problemas que tuve fue organizar bien el funcionamiento del programa y hacer que todo se coordinara correctamente con los turnos y las distintas entidades. Como estaba trabajando principalmente con la clase SimuladorEcosistema, tenía que encargarme de la entrada de datos, de avanzar los turnos y de mostrar el menú de intervención cada tres turnos. Para hacer esto dependía también de cómo estaban implementadas las clases Ecosistema, Conejo y Lobo por parte de mis compañeros.

Cuando empezamos a probar todo junto, vimos que había un problema con el equilibrio de la simulación, ya que las plantas se terminaban muy rápido, generalmente en el turno 1 o 2. Esto hacía que no pudiéramos llegar al turno 3 para probar el menú de intervención. Revisando el funcionamiento, encontramos que no se estaban generando nuevos brotes cuando las plantas se reproducían y que también había una llamada que se hacía de más al momento de comprobar si las presas habían muerto.
  
# Documentación de uso de IA
- *[Yazmin Riquelme]*
Conversación completa: https://claude.ai/share/128e321c-f3fc-41aa-87e3-907464d06666

- *[Hedda Conci]*
Conversación completa: https://share.gemini.google/13LGl97w3Vyk

- *[Ismael Gorocito]*
Conversación completa: https://chatgpt.com/share/6ab9ccef-46c0-83e9-9234-a2eae3a146de?ogimg=plain

- *[Martino Recio]*
Conversación completa: https://share.gemini.google/j66ctnUDSd1P

# Link del video
https://drive.google.com/file/d/1XqtY-RKrW1qgPAI8oHoBMj8hoPCnkeIK/view?usp=drivesdk
