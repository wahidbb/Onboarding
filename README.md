# Onboarding
 Implmenting Google SignIn in project
1. You have to connect your project with firebase.
2. Download Google services.json file and add it to project->App
3. Take SHA1 key from gradle ->signReport and run the app. you will get SHA1 key and add to project setting in firebase. 
4. Take Web client ID from authentication->sign_in_Method->web SDK configuration and add it to .setServerClientId into your fun buildSignInRequest().
