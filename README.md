## Requisitos:

![Imgur](https://i.imgur.com/HHY7837.png)

## Estructura del Proyecto:

- `src/repository:` directorio para la gestión de datos
- `src/entity:` directorio para clases como pasajeros, aeropuertos, reservas.
- `src/service:` directorio para las clases que manejan los datos.
- `data:` toda la informacion de pasajeros, vuelos, y reservas se guardan aqui.

## Features:

<!-- - [x] `createNewPassenger()` -->

- [x] `createNewReservation():`
- [x] `getFlightHistoryByPassenger()`
- [x] `getReservationsByDate()`
- [x] `getReservationsBySourceAndDestination()`

## Datos:

Vuelos:

| Flight_number | Source     | Destination | Date       | Time  | Sites | Price |
| ------------- | ---------- | ----------- | ---------- | ----- | ----- | ----- |
| BO123         | Santa Cruz | La Paz      | 07-11-2023 | 09:15 | 210   | 200.0 |
| BO456         | La Paz     | Santa Cruz  | 08-11-2023 | 10:00 | 117   | 150.0 |

Reservacion de vuelos:

| Flight_number | Passenger_CI | Total_Price | Sites |
| ------------- | ------------ | ----------- | ----- |
| BO123         | 123456789    | 150.0       | 5     |
| BO456         | 987654321    | 180.0       | 3     |

Pasajeros:

| CI        | Name          | age |
| --------- | ------------- | --- |
| 123456789 | Jhon Doe      | 5   |
| 987654321 | Luis Fernando | 3   |
