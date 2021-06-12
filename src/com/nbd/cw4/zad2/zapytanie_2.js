// Łączną ilość środków pozostałych na kartach kredytowych osób w bazie, w podziale na waluty;

db.people.aggregate([
    {$unwind: "$credit"},
    {
        $group: {
            _id: "$credit.currency",
            "totalBalance": {$sum: {$toDouble: "$credit.balance"}},
        }
    }
])
