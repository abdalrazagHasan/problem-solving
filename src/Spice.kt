class Book {

    var numberOfBooksBorrowed:Int = 0

    companion object {
        const val MAXIMUM_BORROW_BOOKS = 8
    }

    fun canBorrow():Boolean {
        return numberOfBooksBorrowed < MAXIMUM_BORROW_BOOKS
    }

    fun borrow(){
        if (canBorrow()){
            numberOfBooksBorrowed++
        } else {
            println("you borrow $MAXIMUM_BORROW_BOOKS you can't borrow more")
        }
    }

}
