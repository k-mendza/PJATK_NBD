// Dodaj siebie do bazy, zgodnie z formatem danych użytych dla innych osób (dane dotyczące karty kredytowej, adresu zamieszkania i wagi mogą być fikcyjne);

printJson(db.people.insertOne(
    {
        "birth_date": "1991-05-09T17:22:24Z",
        "credit": [
            {
                "type": "mastercard",
                "number": "56022541652043117",
                "currency": "PLN",
                "balance": "3843.63"
            }
        ],
        "description": "lacus morbi sem mauris laoreet ut rhoncus aliquet pulvinar sed nisl nunc rhoncus dui vel sem",
        "email": "hlawson2@flavors.me",
        "first_name": "Karol",
        "height": "173.4",
        "job": "Software Engineer",
        "last_name": "Nazwisko",
        "location": {
            "city": "Warsaw",
            "address": {
                "streetname": "Wspólna",
                "streetnumber": "33"
            }
        },
        "nationality": "Poland",
        "sex": "Male",
        "weight": "75.25"
    }
))
