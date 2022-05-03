data class AudioAttachments (
    override val type: String = "audio",
    val audio: Audio
) : Attachments