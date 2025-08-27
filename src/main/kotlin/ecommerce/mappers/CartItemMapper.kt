package ecommerce.mappers

import ecommerce.entities.CartItem
import ecommerce.model.CartItemResponseDTO
import ecommerce.model.ProductDTO

fun CartItem.toResponseDto(productDTO: ProductDTO) = CartItemResponseDTO(id!!, memberId, productDTO, quantity, addedAt!!)
