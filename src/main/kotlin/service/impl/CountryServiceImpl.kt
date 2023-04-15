package service.impl

import com.sun.source.tree.CompilationUnitTree
import dto.CoutnryDto
import org.springframework.stereotype.Service
import service.CountryService

@Service
class CountryServiceImpl : CountryService {
    override fun getAll(): List<CoutnryDto> {
        return listOf(
            CoutnryDto(1, "Германия", 10_000_000),
            CoutnryDto(2, "Англия", 15_000_000)
        )
    }
}