```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { str, index ->
    println "Element at index $index: $str"
    if (index == 1) {
      list.remove(index)
    }
  }
}

List<String> myList = ['a', 'b', 'c', 'd']
myMethod(myList)
```