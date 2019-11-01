package test.headers

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import io.micronaut.http.annotation.Headers
import io.micronaut.http.client.annotation.Client

@Headers(
        Header(name = "X-Header-1", value = "1"),
        Header(name = "X-Header-2", value = "2")
)
@Client("/")
interface HeadersClient {

    @Get
    fun headerValues(): String
}
