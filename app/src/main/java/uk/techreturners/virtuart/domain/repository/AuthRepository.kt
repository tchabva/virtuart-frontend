package uk.techreturners.virtuart.domain.repository

import kotlinx.coroutines.flow.StateFlow
import uk.techreturners.virtuart.domain.model.SignInResult
import uk.techreturners.virtuart.domain.model.UserData

interface AuthRepository {
    val userState: StateFlow<UserData?>
    val source: StateFlow<String>
    val refreshExhibitions: StateFlow<Boolean>
    suspend fun signIn(): SignInResult
    suspend fun signOut()
    fun getSignedInUser(): UserData?
    fun updateSource(newSource: String)
    suspend fun updateUserData(userData: UserData)
    fun setRefreshExhibitionsToTrue()
    fun setRefreshExhibitionsToFalse()
}