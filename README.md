# booking-application

To get an access token:

curl --request POST \
  --url https://dev-tjo9gany.us.auth0.com/oauth/token \
  --header 'content-type: application/json' \
  --data '{"client_id":"bzfZmaCqQp05XqUvzEIKaF3UvIEIrATW","client_secret":"7DP1ZkpcdHdvPtpWN-a_eHu9vVrOWpW-NaMX1w6K6sXjLu7shG1F2UsPvzqwG8Uc","audience":"https://booking-api.com","grant_type":"client_credentials"}'
  
Using access token:

Header : 'authorization: Bearer {bearer-token}'
