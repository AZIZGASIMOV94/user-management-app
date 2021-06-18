# User Managment App using Spring boot, JWT (restful service )

## Default url
    http://localhost:8090/api/


# REST API

### The REST API app is described below. 
Main components are "entity" package contains the represetation of User table, "dao" package contains default interfaces and implementation classes,
"config", "service", "model" packages are for jwt configuration. Spring securty password encoder is used.

## Register/Signup a new User

### Request

`POST /api/register`

    http://localhost:8090/api/register

### Sample JSON data 
    
{
    "username":"test13",
    "password":"test13"
}

### Sample Response

{
    "id": 18,
    "username": "test13",
    "password": "$2a$10$NR..Z4.HIHOSXVztfJU.h.lzAxGH/FYBvhpWA5fLgepfvfuRiIG9q"
}


## Authenticate a User

### Request

`GET /api/authenticate`

    http://localhost:8090/api/authenticate

### Sample JSON data 
    
{
    "username":"test20",
    "password":"test20"
}

### Sample Response

{
    "errorCode": null,
    "errorMessage": null,
    "successMessage": "user authenticated",
    "obj": {
        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0MjAiLCJleHAiOjE2MjQwMjQ4MjUsImlhdCI6MTYyNDAwNjgyNX0.iF7PJ_98U5v7HIGRTPM944ltRRvZ0T-95JyXmCsHQbMlQQUIfSVg5AxDpadeQOVnMzv9HnAWyZgpxWYCR4Pkzg"
    }
}

## if attempt to auth a non-existent User

### Request

`GET /api/authenticate`

    http://localhost:8090/api/authenticate
    
### Sample JSON data 

{
    "username":"test21",
    "password":"test21"
}

### Sample Response
    404 Not Found

