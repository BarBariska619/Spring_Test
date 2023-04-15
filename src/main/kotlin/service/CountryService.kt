package service


import dto.CoutnryDto

interface CountryService {
    fun getAll(): List<CoutnryDto>
}