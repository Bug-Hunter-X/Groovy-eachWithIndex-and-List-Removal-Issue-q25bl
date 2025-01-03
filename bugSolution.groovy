```groovy
def myMethod(List<String> list) {
  // Create a copy of the list to avoid modification during iteration
  list.eachWithIndex { str, index ->
    println "Element at index $index: $str"
    if (index == 1) {
      // Remove element from the copy, not the original.
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList)
```

**Alternative Solution (Iterating backwards):**

To avoid issues with index updating, iterate over the list in reverse order. This ensures that removing an element does not affect the index of subsequent elements:

```groovy
def myMethod(List<String> list) {
  for (int i = list.size() - 1; i >= 0; i--) {
    println "Element at index $i: ${list[i]}"
    if (i == 1) {
      list.remove(i)
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList)
```