# 🐑 Sheep Counter Challenge

## Descripción

Aplicación Java que cuenta ovejas (`true`) en un rebaño excluyendo a los lobos (`false`).

## Reglas del Challenge

- ✅ No se puede usar `ELSE`
- ✅ No se puede usar métodos adicionales
- ✅ Código sin comentarios
- ✅ Debe contar solo las ovejas (true)
- ✅ Si solo hay lobos, mostrar mensaje especial

## Casos de Prueba

### Test Case 1
**Input:**
```java
{true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, true, false, false, true, true}
```
**Output:**
```
There are 17 sheep in total
```

### Test Case 2
**Input:**
```java
{false, false, false}
```
**Output:**
```
UPS!!! Wolfs've eaten the Sheeps
```

## Requisitos

- JDK 8 o superior

## Cómo ejecutar

1. Clona el repositorio:
```bash
git clone <tu-repositorio-url>
cd sheep-counter
```

2. Compila el código:
```bash
javac SheepCounter.java
```

3. Ejecuta la aplicación:
```bash
java SheepCounter
```

## Estructura del Proyecto

```
sheep-counter/
├── SheepCounter.java
├── README.md
└── .gitignore
```

## Tecnologías

- Java
- No se utilizan librerías externas

## Características Técnicas

- Sin uso de sentencias `ELSE`
- Sin métodos adicionales (todo en `main`)
- Código limpio sin comentarios
- Operadores ternarios para lógica condicional

## Autor

Tu nombre aquí

## Licencia

MIT
