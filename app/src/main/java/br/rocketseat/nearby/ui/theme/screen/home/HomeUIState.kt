package br.rocketseat.nearby.ui.theme.screen.home

import com.google.android.gms.maps.model.LatLng
import br.rocketseat.nearby.data.model.Category
import br.rocketseat.nearby.data.model.Market

data class HomeUiState(
    val categories: List<Category>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null
)