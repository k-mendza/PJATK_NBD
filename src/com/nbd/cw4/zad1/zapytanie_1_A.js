// Średnią wagę i wzrost osób w bazie z podziałem na płeć (tzn. osobno mężczyzn, osobno kobiet);

// wyniki z DataGrip
db.people.aggregate({
    $group: {
        _id:"$sex",
        "avgWeight": {$avg: {$toDouble: "$weight"}},
        "avgHeight": {$avg: {$toDouble: "$height"}}
    }
})

