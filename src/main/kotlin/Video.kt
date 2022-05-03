data class Video (
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val image: Array<Image>?,
    val firstFrame: Array <FirstFrame>?,
    val date: Int,
    val addingDate: Int,
    val views: Int,
    val localViews: Int,
    val comments: Int,
    val player: String,
    val platform: String,
    val canAdd: Boolean = false,
    val isPrivate: Int,
    val accessKey: String,
    val processing: Int,
    val isFavorite: Boolean = false,
    val canComment: Boolean = false,
    val canEdit: Boolean = false,
    val canLike: Boolean = false,
    val canRepost: Boolean = false,
    val canSubscribe: Boolean = false,
    val canAddToFaves: Boolean = false,
    val canAttachLink: Boolean = false,
    val width: Int,
    val height: Int,
    val userId: Int,
    val converting: Boolean = false,
    val added: Boolean = false,
    val isSubscribed: Boolean = false,
    val repeat: Int,
    val type: String,
    val balance: Int,
    val liveStatus: String,
    val live: Boolean = false,
    val upcoming: Boolean = false,
    val spectators: Int,
    val likes: Like?,
    val reposts: RepostVideo?

        )