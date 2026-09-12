# Setup Instructions

## Prerequisites
- JDK 17+
- Git

## Clone
```bash
git clone <repo-url>
cd MediTrack
```

## Build
```bash
javac -d out $(find src -name "*.java")
```

## Run
```bash
java -cp out com.airtribe.meditrack.Main
```

## Test
```bash
java -cp out com.airtribe.meditrack.test.TestRunner
```