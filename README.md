# Programación Orientada a Objetos (Java)
## MiniSIA: Sistema de Gestión Académica
#### Universidad Nacional de Colombia

---

Este repositorio contiene el desarrollo de un sistema académico simplificado (**MiniSIA**) implementado en **Java**, enfocado en la aplicación de los principios de la **Programación Orientada a Objetos (POO)**. El programa simula la gestión de entidades universitarias fundamentales mediante el uso de clases, constructores sobrecargados, métodos con polimorfismo (sobrecarga de métodos) y encapsulamiento.

---

## Contenido del Proyecto

El sistema está compuesto por las siguientes clases principales y su lógica de interacción:

* **Estudiante:** Modela la información personal y académica de los alumnos (nombre, carrera, facultad, código e índice académico), incluyendo métodos sobrecargados para procesos de inscripción a materias.
* **Profesor:** Gestiona los datos del cuerpo docente (nombre, departamento, ID, teléfono y correo electrónico) y calcula la carga académica mediante métodos flexibles.
* **Materia:** Administra los cursos ofrecidos, sus créditos y cupos disponibles, permitiendo la adición de estudiantes con diferentes niveles de detalle.
* **Inscripción:** Controla la vinculación entre estudiantes y materias, calculando notas definitivas de forma dinámica.
* **Nota:** Registra calificaciones detalladas asociadas a evaluaciones, porcentajes y fechas específicas.
* **MiniSIA (Clase Principal):** Clase ejecututable (`main`) que instancia objetos de cada entidad utilizando múltiples firmas de constructores, ejecuta operaciones y despliega los reportes informativos en consola.

---

## Especificaciones de Ejecución

* **Entorno:** Desarrollado para su compilación y ejecución en cualquier entorno o IDE compatible con **Java (JDK 8 o superior)**.
* **Requerimientos:** No se requieren librerías externas adicionales; el proyecto utiliza exclusivamente las características estándar de Java (`java.lang`).
* **Estructura:** El diseño implementa sobrecarga de métodos y constructores para demostrar flexibilidad y buenas prácticas en POO.
