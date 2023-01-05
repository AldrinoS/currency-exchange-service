
# Currency Exchange Service

This is a project created to learn about Spring Boot microservice. 
This service provides exchange rate of two currencies that is stored in database.
H2 in memory database is used to store the currency exchange data.




## API Reference

#### Get Exchange rate

```http
  GET /currency-exchange/from/{from}/to/{to}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `from` | `string` | **Required**. Currency letter symbol |
| `to` | `string` | **Required**. Currency letter symbol |

Currently supported currencies are USD, INR, EUR, AUD


## Lessons Learned

How to setup a spring boot application, controller, reposotory interface. How to set the application.property for h2 database and console. How to load data to H2 using data.sql.

