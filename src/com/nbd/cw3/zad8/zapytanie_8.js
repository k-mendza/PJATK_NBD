// Zastąp nazwę miasta „Moscow” przez „Moskwa” u wszystkich osób w bazie;

printJson(db.people.updateMany({"location.city": {$eq: "Moscow"}}, { $set: { "location.city" : "Moskwa" }}).toArray())
