// Lista mężczyzn narodowości niemieckiej;
printJson(db.people.find({"sex":{$eq:"Male"}, "nationality":{$eq:"Germany"}}).toArray())
