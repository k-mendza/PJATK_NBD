// Średnie, minimalne i maksymalne BMI (waga/wzrost^2) dla osób w bazie, w podziale na narodowości;

// Wyniki z DataGrip
db.people.aggregate({
    $group: {
        _id: "$nationality",
        "minBmi": {
            $min: {$divide: [{$toDouble: "$weight"},{$divide: [{$multiply: [{$toDouble: "$height"}, {$toDouble: "$height"}]},10000]}]}
        },
        "avgBmi": {
            $avg: {$divide: [{$toDouble: "$weight"},{$divide: [{$multiply: [{$toDouble: "$height"}, {$toDouble: "$height"}]},10000]}]}
        },
        "maxBmi": {
            $max: {$divide: [{$toDouble: "$weight"},{$divide: [{$multiply: [{$toDouble: "$height"}, {$toDouble: "$height"}]},10000]}]}
        }
    }
})


