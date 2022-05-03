data class VideoAttachments (
    override val type: String = "video",
    val video: Video
) : Attachments