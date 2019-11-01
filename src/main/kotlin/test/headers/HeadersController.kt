package test.headers

import io.micronaut.http.HttpHeaders
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class HeadersController {

    @Get
    fun headerValues(headers: HttpHeaders): String {
        return headers.get("X-Header-1") + headers.get("X-Header-2")
    }
}
