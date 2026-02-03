package com.ajstudioz.gallery.feature_node.presentation.ignored.setup

import com.ajstudioz.gallery.feature_node.domain.model.Album

sealed class IgnoredType {

    data class SELECTION(val selectedAlbum: Album?) : IgnoredType()

    data class REGEX(val regex: String) : IgnoredType()
}
