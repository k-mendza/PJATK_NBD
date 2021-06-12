// Lista imion i nazwisk wszystkich osób oraz miast, w których mieszkają, dla osób urodzonych w XXI wieku;
printJson(db.people.find({"birth_date": {$gt: "2001-01-01T00:00:00Z"}}, {'first_name': 1, 'last_name': 1, 'location': 1}).toArray())
