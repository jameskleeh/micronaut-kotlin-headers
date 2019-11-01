package test.headers

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("test.headers")
                .mainClass(Application.javaClass)
                .start()
    }
}