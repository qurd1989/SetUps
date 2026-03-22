# Vehicle Package - Internal Documentation

## Overview
This package models three vehicle types used by a simple rental CLI:
- `Car`
- `Motorcycle`
- `Truck`

Shared identity data is exposed through `Vehicle`.
Type-specific behavior is declared in `CarVehicle`, `MotorcycleVehicle`, and `TruckVehicle`.

## Design Rules
- Identity fields (`make`, `model`, `year`) are immutable after construction.
- Construction fails fast if required values are invalid.
- Mutable attributes are validated in their setters.
- Option-like inputs are normalized to lowercase canonical values.

## Validation Utility
`VehicleValidation` centralizes common checks:
- `requireNonBlank(...)`
- `requireYearInRange(...)`
- `normalizeOption(...)`

Using one utility avoids duplicate logic and keeps error behavior consistent.

## Contracts by Type
### Car
- `doors`: 1..6
- `fuelType`: `petrol`, `diesel`, `electric`

### Motorcycle
- `wheels`: 2..4
- `motorcycleType`: `sport`, `cruiser`, `off-road`

### Truck
- `cargoCapacity`: > 0
- `transmissionType`: `manual`, `automatic`

## Notes for Future Changes
- If new options are added (e.g., new fuel types), update only the corresponding allowed-set constant.
- Keep all validation in constructors/setters so object state remains valid.
- If UI requirements grow, move console output from model classes to a separate presenter layer.

