# Iterator Design Pattern

Java example of traversing a name collection through a custom iterator.

## How it works

`NameRepository` stores strings in an `ArrayList` and exposes an inner `NameIterator`. The client uses `hasNext()` and `next()` to print names without managing the collection index.

## Usage

Requires a Java Development Kit. Run from the repository root:

```sh
javac -d out src/iterator/IteratorDemo.java
java -cp out iterator.IteratorDemo
```


## Notes

The aggregate interface includes `remove()`, but that method is not implemented.
