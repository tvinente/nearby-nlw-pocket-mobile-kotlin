package br.rocketseat.nearby.ui.theme.screen.market_details

import br.rocketseat.nearby.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null,
)