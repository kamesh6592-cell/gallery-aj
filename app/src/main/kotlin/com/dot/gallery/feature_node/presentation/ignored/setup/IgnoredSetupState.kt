package com.ajstudioz.gallery.feature_node.presentation.ignored.setup

import com.ajstudioz.gallery.feature_node.domain.model.Album
import com.ajstudioz.gallery.feature_node.domain.model.IgnoredAlbum

data class IgnoredSetupState(
    val label: String = "",
    val location: Int = IgnoredAlbum.ALBUMS_ONLY,
    val type: IgnoredType = IgnoredType.SELECTION(null),
    val matchedAlbums: List<Album> = emptyList(),
    val stage: IgnoredSetupStage = IgnoredSetupStage.LABEL
)
