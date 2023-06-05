# java-prolog-physical-condition

Sistema experto desarrollado en ``java`` para el conocimiento de la condición física de una persona. Incluye una base de conocimiento utilizando ``prolog``. 

Está conformado por varios test, los cuales se muestran a continuación:

## TEST DE CONDICIÓN BIOMÉTRICA

Introduzca su peso (Kg) y altura (centímetros).

Nota: Con este dato se calcula el IMC ``(peso / altura^2)``, el resultado se valorará de la siguiente forma:

| **Composición corporal**     |  **Índice de masa corporal (IMC)**       |
| ------------------------ | --------------------------------- |
| Bajo Peso                | Menos de 18.5                     |
| Normal                   | 18.5 – 24.9                       |
| Sobrepeso                | 25.0 – 29.9                       |
| Obesidad                 | Más de 30.0                       |

Si el peso excede lo normal constituye un elemento invalidante y se puede dictaminar como mala la condición física independiente de los resultados posteriores.

## TEST DE COORDINACIÓN

Hay que **descalzarse sobre una superficie lisa y no deslizante y levantar una pierna** sin que esta entre en contacto con la pierna de apoyo. Mientras dura el ejercicio, las manos se mantienen apoyadas sin esfuerzo en las caderas. Se da como buena aquella posición que es capaz de **mantenerse sin tener que hacer movimientos compensatorios** para evitar perder el equilibrio.

#### Resultados que marcaría el usuario (solo uno):
1. **No se mantiene el equilibrio** sobre un pie ni tan siquiera balanceándose o no se es capaz de mantener la posición durante cinco segundos.
2. Se es capaz de **mantener el equilibrio al menos cinco segundos**, aunque sea necesario balancearse.
3. Se mantiene el equilibrio **por lo menos diez segundos**, aunque sea balanceándose en algún momento.
4. Se puede mantener el equilibrio **al menos cinco segundos con los ojos cerrados,** aunque sea balanceándose.
5. Se mantiene el equilibrio **al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza**, aunque sea balanceándose.

#### Puntos según la valoración
| Opción | Menos de 45 años | Más de 45 años |
| ------ | ---------------- | -------------- |
| 1      | 1 punto          | 1 punto        |
| 2      | 1 punto          | 2 puntos       |
| 3      | 2 puntos         | 3 puntos       |
| 4      | 3 puntos         | 4 puntos       |
| 5      | 4 puntos         | 4 puntos       |

#### Pautas según la puntuación
- **1 o 2 puntos** significa que se tienen **problemas evidentes con el equilibrio**, pero no hay que preocuparse demasiado, porque todavía pueden solucionarse con un **entrenamiento específico**.
- **3 puntos** es una señal de que **el equilibrio está dentro de lo aceptable, pero puede mejorarse mucho**.
- **4 puntos** significan que esta capacidad de coordinación ya se ha desarrollado de modo idóneo.

## TEST DE FLEXIBILIDAD

**Sentarse en el suelo con la espalda recta, las piernas juntas y rectas, los brazos estirados hacia adelante.** Los pies se mantienen en ángulo recto. **Se inclina la parte superior del cuerpo hacia delante** lentamente tanto como se pueda.

#### Resultados que marcaría el usuario (solo uno):

Se comprueba cuál es la **posición que se es capaz de mantener sin dolor durante cinco segundos** y se observa la distancia que hay entre los dedos de las manos y los dedos de los pies.

1. **La distancia entre los dedos de las manos y los dedos de los pies es más de un palmo**.
2. La distancia es **aproximadamente de un palmo**.
3. La distancia equivale a la **longitud del dedo índice**.
4. **El dedo índice toca las puntas de los** dedos de los pies.
5. **Las puntas de los dedos de las manos se tocan con las puntas de los dedos** de los pies.
6. **Las manos cubren los dedos de los pies** en toda su longitud.

#### Puntos según la valoración
| Opción | Menos de 45 años | Más de 45 años |
| ------ | ---------------- | -------------- |
| 1      | 1 punto          | 1 punto        |
| 2      | 1 punto          | 2 puntos       |
| 3      | 2 puntos         | 3 puntos       |
| 4      | 3 puntos         | 4 puntos       |
| 5      | 4 puntos         | 5 puntos       |
| 6      | 5 puntos         | 5 puntos       |

#### Pautas según la puntuación

- **1 o 2 puntos** indican que existe una seria dificultad para prevenir lesiones, envejecer con salud y desarrollar adecuadamente una práctica deportiva. Se puede hacer mucho para mejorar la capacidad.
- **3 puntos** es un buen resultado, pero existen posibilidades de aumentar la flexibilidad.
- **4 y 5 puntos** muestran una flexibilidad mayor a la media. El objetivo es no oxidarse y se potenciará el rendimiento deportivo.

## TEST DE FORTALEZA

**Tumbarse de espaldas con las rodillas flexionadas** y las plantas de los pies en contacto con el suelo. Los brazos reposan al lado del cuerpo y en contacto con este. Los dedos de las manos apuntan a los pies. Se hace una marca en el suelo en el punto exacto en donde finalizan los dedos de las manos. Luego se hace otra señal a 10 cm del punto anterior y en dirección a los pies. Ahora se tienen que **levantar la cabeza y los hombros hasta que se sea capaz de llegar a la segunda marca.** Después se vuelve a la posición inicial, pero sin dejar reposar la cabeza en el suelo y **manteniendo la tensión abdominal.**

**Un movimiento completo dura alrededor de tres segundos.** Se repite el ejercicio tantas veces como sea posible.

#### Puntos según el número de repeticiones:

| Repeticiones | Menos de 45 años |
| ------------ | ---------------- |
| < 15         | 1 punto          |
| 16-19        | 2 punto          |
| 20-24        | 3 puntos         |
| 25-29        | 4 puntos         |
| > 30         | 5 puntos         |

| Repeticiones | Más de 45 años |
| ------------ | ---------------- |
| < 10        | 1 punto          |
| 11-15        | 2 punto          |
| 16-19        | 3 puntos         |
| 20-24        | 4 puntos         |
| > 25         | 5 puntos         |

#### Pautas según la puntuación:
- **1 y 2 puntos** indican que se está bastante alejado del típico modelo de deportista fuerte, pero también de personas corrientes. Los abdominales no están mínimamente desarrollados.
- **3 puntos** significan que se posee una fortaleza abdominal dentro de la media de la población. Un poco más de entrenamiento puede traer muchos beneficios, como, por ejemplo, menos dolores de espalda.
- **4 y 5 puntos** sugieren que la musculatura está bien desarrollada. Por lo menos hay que mantenerla así de bien.

## TEST DE RESISTENCIA

Lo primero que se debe hacer es **tomarse el pulso**. Para ello se cuentan los latidos en una muñeca durante 30 segundos y se multiplica el resultado por dos. A continuación, hay que colocarse ante un **escalón doble** -unos 35 cm de altura- para **subirlo y bajarlo con una pierna**. Tras tres minutos se cambia la pierna.

**La velocidad depende del peso corporal**: las personas de hasta 60 kg pueden subir y bajar hasta 30 veces por minuto; las de 61 a 80 kg, 25 veces por minuto; las de más de 80 kg. 20 veces. Tras finalizar el ejercicio se mide de nuevo el pulso. **De este segundo resultado se resta el valor del pulso en reposo.**

#### Puntos según la diferencia de pulsos:

| Diferencia | Menos de 45 años |
| ------------ | ---------------- |
| > 75         | 1 punto          |
| 70-74        | 2 punto          |
| 60-69        | 3 puntos         |
| 55-59        | 4 puntos         |
| < 54         | 5 puntos         |

| Diferencia | Más de 45 años |
| ------------ | ---------------- |
| > 65        | 1 punto          |
| 60-64        | 2 punto          |
| 55-59        | 3 puntos         |
| 50-54        | 4 puntos         |
| < 49         | 5 puntos         |

#### Pautas según la puntuación:
- 1 punto indica que **la resistencia está en el mínimo****.**
- 2 y 3 puntos indican un **resultado mejorable.**
- 4 y 5 puntos significan que se goza de una **resistencia de buena a óptima****.**

---
## **RESULTADO FINAL EN FUNCIÓN DE LA SUMA TOTAL DE PUNTOS**
- **4 a 6 puntos**. La condición física es deficiente. Lo primero que se debe hacer es moverse más en la vida cotidiana: subir las escaleras en lugar de coger los ascensores, bajarse del autobús una parada antes... Hay que convencerse de que el ejercicio físico no es algo que se haya inventado para los demás.

- **7 a 10 puntos**. La forma física no es buena, pero es un buen punto de partida. En muy poco tiempo se pueden apreciar los beneficios de realizar alguna actividad física con regularidad.
- **11 a 14 puntos**. El cuerpo responde. Seguramente ya se tienen hábitos correctos y sólo hay que mantenerlos. El test puede señalar los puntos débiles que conviene trabajar.
- **15 a 17 puntos**. La condición física es muy buena. Como en el caso anterior, el objetivo es mantenerse o alcanzar aún mejores resultados en cada uno de los tests.
- **18 a 20 puntos**. Es un resultado digno de un deportista. El objetivo es mantener este nivel y no dar ni un paso hacia atrás.

---

**Autores:**
- Edgar Moya Cáceres
- Mario Abel Ortega Sánchez
