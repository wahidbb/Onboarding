package no.beiningbogen.oboardinginternal

import androidx.compose.runtime.Composable

@Composable
fun pairs(): List<Pair<String, String>> {
    val itemsList = listOf(
        "Read Personal Håndboken" to "https://example.com/handboken",
        "Check Gmail" to "https://mail.google.com",
        "Join Slack" to "https://slack.com",
        "Jira Board" to "https://example.com/handboken",  // Assuming no link for this item
        "Github" to "https://github.com",
        "Jira Board" to "https://example.com/handboken",
        "1Password" to "https://example.com/handboken",
        "Go to Figma" to "https://example.com/handboken",
        "B&B Tripletex" to "https://example.com/handboken",
        "B&B Harvest" to "https://example.com/handboken",
        "B&B Website" to "https://example.com/handboken"
        // Add other items and their links or blank if no link
    )
    return itemsList
}