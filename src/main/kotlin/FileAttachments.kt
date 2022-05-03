data class FileAttachments (
    override val type: String = "file",
    val file: File
) : Attachments