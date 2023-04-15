package controller


import dto.CoutnryDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import service.CountryService

@RestController
@RequestMapping("/countries")
class CountryController (
    private val countryService: CountryService,
) {
    @GetMapping
    fun getAll(): List<CoutnryDto> = countryService.getAll()
}