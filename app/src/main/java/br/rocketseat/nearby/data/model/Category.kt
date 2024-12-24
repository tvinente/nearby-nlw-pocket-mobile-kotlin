package br.rocketseat.nearby.data.model

import androidx.annotation.DrawableRes
import br.rocketseat.nearby.ui.theme.ui.component.category.NearbyCategoryFilterChipView
import kotlinx.serialization.Serializable

@Serializable
data class Category(
    val id: String,
    val name: String
) {
    @get:DrawableRes
    val icon: Int?
        get() = NearbyCategoryFilterChipView.fromDescription(description = name)?.icon
}
