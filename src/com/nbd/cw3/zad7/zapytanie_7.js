// Usuń z bazy osoby o wzroście przekraczającym 190

prinJson(db.people.deleteMany({"height": {$gt: "190"}}).toArray())
