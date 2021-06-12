// Lista wszystkich osób znajdujących się w bazie o wadze z przedziału <68, 71.5);
printJson(db.people.find({"weight": {$gte: "68", $lt:"71.5"}}).toArray())
