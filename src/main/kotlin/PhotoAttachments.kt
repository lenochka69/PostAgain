data class PhotoAttachments (
    override val type: String = "photo",
    val photo: Photo
) : Attachments