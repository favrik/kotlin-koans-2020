fun containsEven(collection: Collection<Int>): Boolean = collection.any { 
    item: Int ->
    item % 2 == 0
}
