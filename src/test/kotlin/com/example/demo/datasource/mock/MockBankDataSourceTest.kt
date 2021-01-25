package com.example.demo.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {
    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        val banks = mockDataSource.getBanks()
        assertThat(banks).isNotEmpty
        assertThat(banks.size).isGreaterThanOrEqualTo(1)
    }

    @Test
    fun `should provide some mock data`() {
        val banks = mockDataSource.getBanks()

        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }
    }
}
