package com.example.chatbot.domain.usecase

import com.example.chatbot.domain.repository.ChatRepository
import javax.inject.Inject

class DeleteAllChatsUseCase @Inject constructor(
    private val chatRepository: ChatRepository
) {
    suspend operator fun invoke() {
        return chatRepository.deleteAllChats()
    }
}