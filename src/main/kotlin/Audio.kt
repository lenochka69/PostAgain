data class Audio (
    val id: Int,
    val ownerId: Int,
    val artist: Int,
    val title: Int,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch:  Boolean = false,
    val isHq: Boolean = false
    )
