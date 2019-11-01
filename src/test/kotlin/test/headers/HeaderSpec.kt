package test.headers

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.micronaut.test.annotation.MicronautTest
import javax.inject.Inject

@MicronautTest
class HeaderSpec(@Inject var client: HeadersClient): StringSpec() {

    init {
        "test the headers are applied"() {
            client.headerValues() shouldBe "12"
        }
    }
}
