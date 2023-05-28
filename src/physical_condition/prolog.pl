% IMC.
imc(Peso, Altura, Ind) :- Ind is Peso/(Altura*Altura).
tipo_condicion(Peso, Altura, Condicion) :-
    imc(Peso, Altura, Ind),
    (
        Ind < 18.5, !, Condicion = 'bajo peso'; 
        Ind < 25, !, Condicion = 'normal'; 
        Ind < 30, !, Condicion = 'sobrepeso';
        Condicion = 'obesidad'
    ).
mala_condicion(P, A) :- tipo_condicion(P, A, Ind), member(Ind, ['sobrepeso', 'obesidad']).

% Puntuación obtenida en la prueba de coordinación.
puntos_coordinacion(_, 'No mantiene el equilibrio', 1).
puntos_coordinacion(Edad, 'Mantiene el equilibrio al menos cinco segundos', Puntos) :-
    (Edad >= 45, Puntos is 2) ; (Edad < 45, Puntos is 1).
puntos_coordinacion(Edad, 'Mantiene el equilibrio por lo menos diez segundos', Puntos) :-
    (Edad >= 45, Puntos is 3) ; (Edad < 45, Puntos is 2).
puntos_coordinacion(Edad, 'Mantiene el equilibrio al menos cinco segundos con los ojos cerrados', Puntos) :- 
    (Edad >= 45, Puntos is 4) ; (Edad < 45, Puntos is 3).
puntos_coordinacion(_, 'Mantiene el equilibrio al menos cinco segundos con los ojos cerrados y los brazos estirados por encima de la cabeza', 4).

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

% Puntuación obtenida en la prueba de fortaleza.
puntos_fortaleza(Edad, Rep, Puntos) :- Edad < 45, fuerza_Menos45(Rep, Puntos), !.
puntos_fortaleza(_, Rep, Puntos) :- fuerza_Mas45(Rep, Puntos).

fuerza_Menos45(Rep, Puntos) :- Rep < 15, Puntos is 1, !.
fuerza_Menos45(Rep, Puntos) :- Rep < 20, Puntos is 2, !.
fuerza_Menos45(Rep, Puntos) :- Rep < 25, Puntos is 3, !.
fuerza_Menos45(Rep, Puntos) :- Rep < 30, Puntos is 4, !.
fuerza_Menos45(_, 5).

fuerza_Mas45(Rep, Puntos) :- Rep < 10, Puntos is 1, !.
fuerza_Mas45(Rep, Puntos) :- Rep < 16, Puntos is 2, !.
fuerza_Mas45(Rep, Puntos) :- Rep < 20, Puntos is 3, !.
fuerza_Mas45(Rep, Puntos) :- Rep < 25, Puntos is 4, !.
fuerza_Mas45(_, 5).

% Puntuación obtenida en la prueba de resistencia.
puntos_resistencia(Edad, Pulso, Puntos) :- Edad < 45, resistencia_Menos45(Pulso, Puntos), !.
puntos_resistencia(_, Pulso, Puntos) :- resistencia_Mas45(Pulso, Puntos).

resistencia_Menos45(Pulso, Puntos) :- Pulso > 75, Puntos is 1, !.
resistencia_Menos45(Pulso, Puntos) :- Pulso >= 70, Puntos is 2, !.
resistencia_Menos45(Pulso, Puntos) :- Pulso >= 60, Puntos is 3, !.
resistencia_Menos45(Pulso, Puntos) :- Pulso >= 55, Puntos is 4, !.
resistencia_Menos45(_, 5).

resistencia_Mas45(Pulso, Puntos) :- Pulso > 65, Puntos is 1, !.
resistencia_Mas45(Pulso, Puntos) :- Pulso >= 60, Puntos is 2, !.
resistencia_Mas45(Pulso, Puntos) :- Pulso >= 55, Puntos is 3, !.
resistencia_Mas45(Pulso, Puntos) :- Pulso >= 50, Puntos is 4, !.
resistencia_Mas45(_, 5).

% Mensaje a responder según la puntuación
mensaje(Puntos, 'La condición física es deficiente. Lo primero que se debe hacer es moverse más en la vida cotidiana: subir las escaleras en lugar de coger los ascensores, bajarse del autobús una parada antes. Hay que convencerse de que el ejercicio físico no es algo que se haya inventado para los demás.') :- 
    Puntos >= 4, Puntos =< 6, !.
mensaje(Puntos, 'La forma física no es buena, pero es un buen punto de partida. En muy poco tiempo se pueden apreciar los beneficios de realizar alguna actividad física con regularidad.') :- 
    Puntos =< 10, !.
mensaje(Puntos, 'El cuerpo responde. Seguramente ya se tienen hábitos correctos y sólo hay que mantenerlos.') :- 
    Puntos =< 14, !.
mensaje(Puntos, 'La condición física es muy buena. El objetivo es mantenerse o alcanzar aún mejores resultados en cada uno de las pruebas.') :- 
    Puntos =< 17, !.
mensaje(_, 'Es un resultado digno de un deportista. El objetivo es mantener este nivel y no dar ni un paso hacia atrás.').


% Entrada de datos
prueba(_, Peso, Altura, _, _, _, _, 0, 'Obesidad') :- mala_condicion(Peso, Altura), !.
prueba(Edad, _, _, Coo, Fle, For, Res, Puntos, Mensaje) :- 
    puntos_coordinacion(Edad, Coo, PuntosCoo), 
    puntos_flexibilidad(Edad, Fle, PuntosFle), 
    puntos_fortaleza(Edad, For, PuntosFor),
    puntos_resistencia(Edad, Res, PuntosRes),
    Puntos is PuntosCoo + PuntosFle + PuntosFor + PuntosRes,
    mensaje(Puntos, Mensaje).