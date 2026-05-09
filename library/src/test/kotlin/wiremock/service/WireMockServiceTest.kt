package wiremock.service

import kotlin.test.Test
import kotlin.test.assertFalse

class WireMockServiceTest {

    @Test
    fun `newly created service is not running`() {
        val service = WireMockService()
        assertFalse(service.isRunning)
    }
}
