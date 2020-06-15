class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = DateIterator(this)
}

class DateIterator(val range: DateRange): Iterator<MyDate> {
    var currentDate: MyDate = range.start
    
    override fun hasNext(): Boolean {
        return currentDate <= range.end
    }
    
    override fun next(): MyDate {
        val testDate: MyDate = currentDate
        currentDate = currentDate.nextDay()
        
        return testDate
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
