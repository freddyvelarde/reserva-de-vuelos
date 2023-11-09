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
| BO456         | Santa Cruz | La Paz      | 2023-11-07 | 10:00 | 117   | 150.0 |
| BO438         | Cochabamba | Sucre       | 2023-11-09 | 11:30 | 130   | 100.0 |
| BO789         | Beni       | La Paz      | 2023-11-07 | 11:15 | 145   | 260.0 |
| BO654         | Santa Cruz | La Paz      | 2023-12-01 | 08:45 | 117   | 200.0 |
| BO987         | Oruro      | Sucre       | 2023-10-09 | 22:00 | 130   | 150.0 |

Reservacion de vuelos:

| Flight_number | Passenger_CI | Total_Price | Sites |
| ------------- | ------------ | ----------- | ----- |
| BO438         | 13827575     | 420.0       | 2     |
| BO123         | 123456789    | 150.0       | 5     |
| BO456         | 987654321    | 180.0       | 3     |
| BO789         | 246813579    | 310.0       | 4     |
| BO654         | 135792468    | 200.0       | 6     |
| BO987         | 357924681    | 250.0       | 7     |
