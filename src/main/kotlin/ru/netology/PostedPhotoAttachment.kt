package ru.netology

class PostedPhotoAttachment(
    override val type: String = "Posted Photo",
    val PostedPhoto: PostedPhoto
) : Attachment