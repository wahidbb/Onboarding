package no.beiningbogen.googleauthentication.signin


data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)
