package ecommerce.entities

data class Member(val id: Long? = null, val name: String, val email: String, val password: String, val role: Role = Role.CUSTOMER) {
    enum class Role { CUSTOMER, ADMIN }
}
