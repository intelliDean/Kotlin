package oop

class LikesLateInit {
    private lateinit var favoriteMeal: String
    private lateinit var favoriteSport: String
    private lateinit var favoriteDay: String
    private lateinit var favoriteClub: String


    fun setFavoriteMeal(favoriteMeal: String) {
        this.favoriteMeal = favoriteMeal
    }
    fun getFavoriteMeal(): String {
        return favoriteMeal
    }
    fun setFavoriteSport(favoriteSport: String) {
        this.favoriteSport = favoriteSport
    }
    fun setFavoriteDay(favoriteDay: String) {
        this.favoriteDay = favoriteDay
    }
    fun setFavoriteClub(favoriteClub: String) {
        this.favoriteClub = favoriteClub
    }
}


fun main(){
    val likes = LikesLateInit()

    likes.setFavoriteMeal("Beans and corn")
    println(
        likes.getFavoriteMeal()
    )
}