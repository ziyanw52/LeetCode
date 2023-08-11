#Definition Array
[Leetcode](https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/)
>The size of an array in Java is fixed when it's created, meaning that you cannot dynamically add or remove elements from it after initialization. The length of the array is determined when you create it, and it cannot be changed during the lifetime of the array.

```java

int[] myArray = new int[5]

```

>If you need a data structure that can dynamically adjust its size as elements are added or removed, you should consider using classes from the java.util package, such as ArrayList, LinkedList.

---

```java

// Create a new array with a capacity of 6.
int[] array = new int[6];

// Current length is 0, because it has 0 elements.
int length = 0;

// Add 3 items into it.
for (int i = 0; i < 3; i++) {
    array[i] = i * i;
    // Each time we add an element, the length goes up by one.
    length++;
}

System.out.println("The Array has a capacity of " + array.length);
System.out.println("The Array has a length of " + length);

```
> In this code, the capacity of the array is 6, meaning it can potentially hold 6 elements.The length of the array is 3, which represents the number of elements that have been added to the array.
> 
**Keep in mind that the capacity of an array is fixed once it's created, and you cannot change it. The length of the array indicates how many elements have been effectively added to it.**









