// Średnia i łączna ilość środków na kartach kredytowych kobiet narodowości polskiej w podziale na waluty

// Wyniki z DataGrip
db.people.aggregate([
    {
        $match: {
            "sex": "Female",
            "nationality": "Poland"
        }
    },
    {
        $unwind: "$credit"
    },
    {
        $group: {
            _id:"$credit.currency",
            "avg": {$avg: {$toDouble: "$credit.balance"}},
            "totalBalance": {$sum: {$toDouble: "$credit.balance"}},
        }
    }
])


