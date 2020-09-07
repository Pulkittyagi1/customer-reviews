# This Repository contains code for below Requirement: #

## webservice replated ask ## 
1) Create a new ItemType to model Customer feedback reviews which has one to many relation with customer type.
2) expose it using webservices (OOTB oauth2 server inclused as part of platform code)
3) Code written in TDD way.

## BackOffice customization ## 
1) No delete button in ListView
2) new attributes in advanced Search
3) in Editor Area attributes should appear under additional tab


## OCC Request Paths: ##

### OAuth request ###

Post:https://<server>/authorizationserver/oauth/token
sample request Body:
  
  key         | value
------------- | -------------
client_id     | trusted_client
client_secret | 12345
grant_type    | password
username      | keenreviewer14@hybris.com
password      | 12345

#### Get Reviews Request ###

GET: https://<server>/occ/v2/electronics/users/keenreviewer14@hybris.com
sample HEADER:
    key       | value
------------- | -------------
Authorization | bearer 713cf9b2-c6a0-4287-88c1-7c0e956a5a2f


Note: autherization server is not in this repo, it is part of platform code.
