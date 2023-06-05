% Procedimientos auxiliares
miembro(X, [X|_]) :- !.
miembro(X, [_|R]) :- miembro(X,R).

% Calcular IMC y verificar condición.
condicion('bajo peso', 'buena').
condicion('normal', 'buena').
condicion('sobrepeso', 'mala').
condicion('obesidad', 'mala').

condiciones(L) :- findall(X, condicion(X, _), L).

imc(Peso, Altura, Ind) :- Ind is Peso/(Altura*Altura).
tipo_condicion(Peso, Altura, Condicion) :-
    imc(Peso, Altura, Ind),
    (
        Ind < 18.5, !, Condicion = 'bajo peso'; 
        Ind < 25, !, Condicion = 'normal'; 
        Ind < 30, !, Condicion = 'sobrepeso';
        Condicion = 'obesidad'
    ).
mala_condicion(P, A) :- tipo_condicion(P, A, Cond), findall(M, condicion(M, 'mala'), L), miembro(Cond, L).

% Puntuación obtenida en la prueba de coordinación.
puntos_coordinacion(_, 'No mantiene el equilibrio', 1).
puntos_coordinacion(Edad, 'Mantiene el equilibrio al menos cinco segundos', Puntos) :-
    (Edad >= 45, Puntos is 2) ; (Edad < 45, Puntos is 1).
puntos_coordinacion(Edad, 'Mantiene el equilibrio por lo menos diez segundos', Puntos) :-
    (Edad >= 45, Puntos is 3) ; (Edad < 45, Puntos is 2).
puntos_coordinacion(Edad, 'Mantiene el equilibrio al menos cinco segundos con los ojos cerrados', Puntos) :- 
    (Edad >= 45, Puntos is 4) ; (Edad < 45, Puntos is 3).
puntos_coordinacion(_, 'Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza', 4).

% Pautas según la puntuación obtenida en la prueba de coordinación
pautas_coordinacion(Puntos, 'Tienen problemas evidentes con el equilibrio, pero no hay que preocuparse demasiado, porque todavía pueden solucionarse con un entrenamiento específico.') :-
    (Puntos = 1; Puntos = 2), !.
pautas_coordinacion(3, 'El equilibrio está dentro de lo aceptable, pero puede mejorarse mucho.').
pautas_coordinacion(4, 'La capacidad de coordinación ya se ha desarrollado de modo idóneo.').



% Puntuación obtenida en la prueba de flexibilidad.
puntos_flexibilidad(_, 'Mas de un palmo', 1).
puntos_flexibilidad(Edad, 'Aproximadamente un palmo', Puntos) :- 
    (Edad >= 45, Puntos is 2) ; (Edad < 45, Puntos is 1).
puntos_flexibilidad(Edad, 'Longitud del dedo indice', Puntos) :- 
    (Edad >= 45, Puntos is 3) ; (Edad < 45, Puntos is 2).
puntos_flexibilidad(Edad, 'El dedo indice toca la punta de los pies', Puntos) :- 
    (Edad >= 45, Puntos is 4) ; (Edad < 45, Puntos is 3).
puntos_flexibilidad(Edad, 'Las puntas de los dedos de las manos se tocan con las puntas de los dedos de los pies', Puntos) :- 
    (Edad >= 45, Puntos is 5) ; (Edad < 45, Puntos is 4).
puntos_flexibilidad(_, 'Las manos cubren los dedos de los pies', 5).

% Pautas según la puntuación obtenida en la prueba de flexibilidad
pautas_flexibilidad(Puntos, 'Posee una seria dificultad para prevenir lesiones, envejecer con salud y desarrollar adecuadamente una práctica deportiva. Se puede hacer mucho para mejorar la flexibilidad.') :-
    (Puntos = 1; Puntos = 2), !.
pautas_flexibilidad(3, 'Puede aumentar la flexibilidad, aunque es un buen resultado.') :- !.
pautas_flexibilidad(_, 'Su flexibilidad es mayor a la media. El objetivo es no oxidarse y se potenciará el rendimiento deportivo.').



% Puntuación obtenida en la prueba de fortaleza.
puntos_fortaleza(Edad, Rep, Puntos) :- Edad < 45, fuerza_Menos45(Rep, Puntos), !.
puntos_fortaleza(_, Rep, Puntos) :- fuerza_Mas45(Rep, Puntos).

fuerza_Menos45(Rep, 1) :- Rep < 15, !.
fuerza_Menos45(Rep, 2) :- Rep < 20, !.
fuerza_Menos45(Rep, 3) :- Rep < 25, !.
fuerza_Menos45(Rep, 4) :- Rep < 30, !.
fuerza_Menos45(_, 5).

fuerza_Mas45(Rep, 1) :- Rep < 10, !.
fuerza_Mas45(Rep, 2) :- Rep < 16, !.
fuerza_Mas45(Rep, 3) :- Rep < 20, !.
fuerza_Mas45(Rep, 4) :- Rep < 25, !.
fuerza_Mas45(_, 5).

% Pautas según la puntuación obtenida en la prueba de fortaleza
pautas_fortaleza(Puntos, 'Está bastante alejado del típico modelo de deportista fuerte, pero también de personas corrientes. Los abdominales no están mínimamente desarrollados.') :-
    (Puntos = 1; Puntos = 2), !.
pautas_fortaleza(3, 'Posee una fortaleza abdominal dentro de la media de la población. Un poco más de entrenamiento puede traer muchos beneficios, por ejemplo, menos dolores de espalda.') :- !.
pautas_fortaleza(_, 'La musculatura está bien desarrollada, debe mantenerla así de bien.').



% Puntuación obtenida en la prueba de resistencia.
puntos_resistencia(Edad, Pulso, Puntos) :- Edad < 45, resistencia_Menos45(Pulso, Puntos), !.
puntos_resistencia(_, Pulso, Puntos) :- resistencia_Mas45(Pulso, Puntos).

resistencia_Menos45(Pulso, 1) :- Pulso > 75, !.
resistencia_Menos45(Pulso, 2) :- Pulso >= 70, !.
resistencia_Menos45(Pulso, 3) :- Pulso >= 60, !.
resistencia_Menos45(Pulso, 4) :- Pulso >= 55, !.
resistencia_Menos45(_, 5).

resistencia_Mas45(Pulso, 1) :- Pulso > 65, !.
resistencia_Mas45(Pulso, 2) :- Pulso >= 60, !.
resistencia_Mas45(Pulso, 3) :- Pulso >= 55, !.
resistencia_Mas45(Pulso, 4) :- Pulso >= 50, !.
resistencia_Mas45(_, 5).

% Pautas según la puntuación obtenida en la prueba de fortaleza
pautas_resistencia(1, 'La resistencia está en el mínimo, debe hacer un esfuerzo para mejorar.') :- !.
pautas_resistencia(Puntos, 'Su resistencia es mejorable.') :-
    (Puntos = 2; Puntos = 3), !.
pautas_resistencia(_, 'Goza de una resistencia de buena a óptima.').


% Mensaje final y pautas a responder según la puntuación
mensaje_final(Puntos, 'La condición física es deficiente. Lo primero que se debe hacer es moverse más en la vida cotidiana: subir las escaleras en lugar de coger los ascensores, bajarse del autobús una parada antes. Hay que convencerse de que el ejercicio físico no es algo que se haya inventado para los demás.') :- 
    Puntos >= 4, Puntos =< 6, !.
mensaje_final(Puntos, 'La forma física no es buena, pero es un buen punto de partida. En muy poco tiempo se pueden apreciar los beneficios de realizar alguna actividad física con regularidad.') :- 
    Puntos =< 10, !.
mensaje_final(Puntos, 'El cuerpo responde. Seguramente ya se tienen hábitos correctos y sólo hay que mantenerlos.') :- 
    Puntos =< 14, !.
mensaje_final(Puntos, 'La condición física es muy buena. El objetivo es mantenerse o alcanzar aún mejores resultados en cada uno de las pruebas.') :- 
    Puntos =< 17, !.
mensaje_final(_, 'Es un resultado digno de un deportista. El objetivo es mantener este nivel y no dar ni un paso hacia atrás.').

pautas(PCoo, PFle, PFor, PRes, [Coo, Fle, For, Res]) :- 
    pautas_coordinacion(PCoo, Coo),
    pautas_flexibilidad(PFle, Fle),
    pautas_fortaleza(PFor, For),
    pautas_resistencia(PRes, Res).


% Entrada de datos
prueba(_, Peso, Altura, _, _, _, _, 0, ['Le recomendamos que busque asesoramiento de un profesional de la salud, como un médico o un nutricionista. Estos profesionales pueden evaluar la situación de la persona, determinar si su peso es un problema de salud y, en caso afirmativo, desarrollar un plan de tratamiento personalizado.'], 'Su condición física no es buena, usted presenta sobrepeso.') :- mala_condicion(Peso, Altura), !.
prueba(Edad, _, _, Coo, Fle, For, Res, Puntos, Pautas, Mensaje) :- 
    puntos_coordinacion(Edad, Coo, PuntosCoo),
    puntos_flexibilidad(Edad, Fle, PuntosFle),
    puntos_fortaleza(Edad, For, PuntosFor),
    puntos_resistencia(Edad, Res, PuntosRes),
    Puntos is PuntosCoo + PuntosFle + PuntosFor + PuntosRes,
    pautas(PuntosCoo, PuntosFle, PuntosFor, PuntosRes, Pautas),
    mensaje_final(Puntos, Mensaje).