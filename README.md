# 🐑 Sheep Counter Challenge

## Description

Java application that counts sheep (`true`) in a flock while excluding wolves (`false`).

<img width="600" alt="Screenshot From 2026-02-16 17-16-47" src="https://github.com/user-attachments/assets/c3c42e40-e92d-4ae7-ac39-4e170a7cc461" />

## Challenge Rules

- ✅ Cannot use `ELSE` statement
- ✅ Cannot use additional methods
- ✅ Code without comments
- ✅ Must count only sheep (true values)
- ✅ If only wolves remain, display special message

## Test Cases

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

## Requirements

- JDK 8 or higher

## How to Run

1. Clone the repository:
```bash
git clone https://github.com/gzifoto-spec/java-sheep-counter-challenge.git
cd java-sheep-counter-challenge
```

2. Compile the code:
```bash
javac SheepCounter.java
```

3. Run the application:
```bash
java SheepCounter
```

## Project Structure

```
java-sheep-counter-challenge/
├── SheepCounter.java
├── README.md
└── .gitignore
```

## Technologies

- Java
- No external libraries used

## Technical Features

- No `ELSE` statements used
- No additional methods (all logic in `main`)
- Clean code without comments
- Ternary operators for conditional logic

## Author

Xavier Piñeiro aka gzifoto

## License

GPLv3
