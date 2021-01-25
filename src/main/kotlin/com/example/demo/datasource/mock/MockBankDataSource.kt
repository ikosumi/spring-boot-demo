package com.example.demo.datasource.mock

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 1.0, 1),
        Bank("101010", 13.01, 17),
        Bank("1234", 0.0, 0),
    )

    override fun getBanks(): Collection<Bank> = banks
}
